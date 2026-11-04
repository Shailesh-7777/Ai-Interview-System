package com.aiinterview.prep.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@Configuration
@Profile("!h2")
public class DataSourceConfig {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    public static class ResolvedDataSourceParams {
        private final String jdbcUrl;
        private final String username;
        private final String password;
        private final String host;
        private final int port;
        private final String databaseName;
        private final String sslMode;

        public ResolvedDataSourceParams(String jdbcUrl, String username, String password) {
            this(jdbcUrl, username, password, parseHost(jdbcUrl), parsePort(jdbcUrl), parseDb(jdbcUrl), parseSsl(jdbcUrl));
        }

        public ResolvedDataSourceParams(String jdbcUrl, String username, String password,
                                        String host, int port, String databaseName, String sslMode) {
            this.jdbcUrl = jdbcUrl;
            this.username = username;
            this.password = password;
            this.host = host;
            this.port = port;
            this.databaseName = databaseName;
            this.sslMode = sslMode;
        }

        public String getJdbcUrl() {
            return jdbcUrl;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getHost() {
            return host;
        }

        public int getPort() {
            return port;
        }

        public String getDatabaseName() {
            return databaseName;
        }

        public String getSslMode() {
            return sslMode;
        }
    }

    public static ResolvedDataSourceParams resolveParameters(Environment env) {
        String explicitUrl = getFirstEnv(env,
                "SPRING_DATASOURCE_URL",
                "DATABASE_URL",
                "MYSQL_URL",
                "DB_URL"
        );

        String username = getFirstEnv(env,
                "SPRING_DATASOURCE_USERNAME",
                "DB_USERNAME",
                "DB_USER",
                "MYSQL_USER",
                "MYSQLUSER"
        );

        String password = getFirstEnv(env,
                "SPRING_DATASOURCE_PASSWORD",
                "DB_PASSWORD",
                "MYSQL_PASSWORD",
                "MYSQLPASSWORD"
        );

        String resolvedJdbcUrl;
        String host;
        int port;
        String dbName;
        String sslMode;

        if (explicitUrl != null && !explicitUrl.isBlank()) {
            explicitUrl = explicitUrl.trim();

            if (explicitUrl.startsWith("mysql://") || explicitUrl.startsWith("mariadb://")) {
                try {
                    URI uri = new URI(explicitUrl);
                    host = uri.getHost() != null ? uri.getHost() : "localhost";
                    port = uri.getPort() > 0 ? uri.getPort() : 3306;
                    String path = uri.getPath();
                    dbName = (path != null && path.length() > 1) ? path.substring(1) : "ai_interview_prep";

                    String userInfo = uri.getUserInfo();
                    if (userInfo != null && !userInfo.isEmpty()) {
                        String[] parts = userInfo.split(":", 2);
                        if (username == null || username.isBlank()) {
                            username = URLDecoder.decode(parts[0], StandardCharsets.UTF_8);
                        }
                        if (parts.length > 1 && (password == null || password.isBlank())) {
                            password = URLDecoder.decode(parts[1], StandardCharsets.UTF_8);
                        }
                    }

                    boolean isRemote = !isLocalhost(host);
                    String defaultSsl = isRemote ? "REQUIRED" : "PREFERRED";

                    String query = uri.getQuery();
                    StringBuilder queryParams = new StringBuilder();
                    if (query != null && !query.isBlank()) {
                        String normalized = query.replace("ssl-mode=", "sslMode=");
                        queryParams.append(normalized);
                        if (!normalized.contains("sslMode") && !normalized.contains("useSSL")) {
                            queryParams.append("&sslMode=").append(defaultSsl);
                        }
                        if (!normalized.contains("allowPublicKeyRetrieval")) {
                            queryParams.append("&allowPublicKeyRetrieval=true");
                        }
                        if (!normalized.contains("serverTimezone")) {
                            queryParams.append("&serverTimezone=UTC");
                        }
                    } else {
                        queryParams.append("sslMode=").append(defaultSsl).append("&allowPublicKeyRetrieval=true&serverTimezone=UTC");
                    }

                    if (!queryParams.toString().contains("connectTimeout")) {
                        queryParams.append("&connectTimeout=30000");
                    }
                    if (!queryParams.toString().contains("socketTimeout")) {
                        queryParams.append("&socketTimeout=60000");
                    }

                    sslMode = parseSsl(queryParams.toString());
                    resolvedJdbcUrl = String.format("jdbc:mysql://%s:%d/%s?%s", host, port, dbName, queryParams);
                    logger.info("Configured MySQL DataSource from URI string targeting host: [{}:{}] and database: [{}]", host, port, dbName);
                } catch (Exception e) {
                    logger.warn("Could not parse database URI as RFC 2396; using fallback translation: {}", e.getMessage());
                    resolvedJdbcUrl = explicitUrl.replaceFirst("^(mysql|mariadb)://", "jdbc:mysql://");
                    host = parseHost(resolvedJdbcUrl);
                    port = parsePort(resolvedJdbcUrl);
                    dbName = parseDb(resolvedJdbcUrl);
                    sslMode = parseSsl(resolvedJdbcUrl);
                }
            } else if (explicitUrl.startsWith("jdbc:")) {
                resolvedJdbcUrl = enhanceJdbcUrl(explicitUrl);
                host = parseHost(resolvedJdbcUrl);
                port = parsePort(resolvedJdbcUrl);
                dbName = parseDb(resolvedJdbcUrl);
                sslMode = parseSsl(resolvedJdbcUrl);
            } else {
                resolvedJdbcUrl = enhanceJdbcUrl("jdbc:mysql://" + explicitUrl);
                host = parseHost(resolvedJdbcUrl);
                port = parsePort(resolvedJdbcUrl);
                dbName = parseDb(resolvedJdbcUrl);
                sslMode = parseSsl(resolvedJdbcUrl);
            }
        } else {
            // Build from discrete environment parameters
            host = getFirstEnvOrDefault(env, "localhost", "DB_HOST", "MYSQL_HOST", "MYSQLHOST");
            String portStr = getFirstEnv(env, "DB_PORT", "MYSQL_PORT", "MYSQLPORT");
            dbName = getFirstEnvOrDefault(env, "ai_interview_prep", "DB_NAME", "MYSQL_DATABASE", "MYSQLDATABASE");

            boolean isRemote = !isLocalhost(host);
            String defaultSsl = isRemote ? "REQUIRED" : "PREFERRED";
            sslMode = getFirstEnvOrDefault(env, defaultSsl, "DB_SSL_MODE", "MYSQL_SSL_MODE");

            port = resolvePort(env, host, portStr);

            resolvedJdbcUrl = String.format(
                    "jdbc:mysql://%s:%d/%s?sslMode=%s&allowPublicKeyRetrieval=true&serverTimezone=UTC&createDatabaseIfNotExist=true&connectTimeout=30000&socketTimeout=60000",
                    host, port, dbName, sslMode
            );

            logger.info("Configured MySQL DataSource from discrete parameters targeting host: [{}:{}] and database: [{}]", host, port, dbName);
        }

        if (username == null || username.isBlank()) username = "root";
        if (password == null) password = "root";

        boolean isLocal = isLocalhost(host);
        if (isLocal && isCloudEnvironment(env)) {
            logger.warn("\n" +
                    "********************************************************************************\n" +
                    "⚠️  DATABASE CONFIGURATION WARNING FOR CLOUD DEPLOYMENT:\n" +
                    "The application is configured to connect to MySQL on localhost: [{}]\n" +
                    "but this service is running in a cloud container (Render) where no local MySQL daemon is present.\n" +
                    "\n" +
                    "To connect to your database, set the following environment variables in Render:\n" +
                    "  - DB_HOST (e.g., your MySQL host from Aiven: mysql-xxxx.aivencloud.com)\n" +
                    "  - DB_PORT (e.g., 23456 - check Aiven Console for exact port)\n" +
                    "  - DB_NAME (e.g., defaultdb)\n" +
                    "  - DB_USERNAME (e.g., avnadmin)\n" +
                    "  - DB_PASSWORD (your Aiven database password)\n" +
                    "  - DB_SSL_MODE (REQUIRED)\n" +
                    "Or supply a single connection URL:\n" +
                    "  - DATABASE_URL (e.g., mysql://avnadmin:password@host:port/defaultdb?ssl-mode=REQUIRED)\n" +
                    "********************************************************************************", maskUrl(resolvedJdbcUrl));
        }

        return new ResolvedDataSourceParams(resolvedJdbcUrl, username, password, host, port, dbName, sslMode);
    }

    @Bean
    @Primary
    public DataSource dataSource(Environment env) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

        ResolvedDataSourceParams params = resolveParameters(env);
        config.setJdbcUrl(params.getJdbcUrl());
        if (params.getUsername() != null) config.setUsername(params.getUsername());
        if (params.getPassword() != null) config.setPassword(params.getPassword());

        // Resilient connection pool configuration for cloud environments
        config.setPoolName("HikariPool-AIInterview");
        config.setConnectionTimeout(30000); // 30s timeout to acquire connection
        config.setValidationTimeout(5000);   // 5s timeout to validate connection
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setIdleTimeout(300000);       // 5m idle timeout
        config.setMaxLifetime(900000);       // 15m max lifetime (avoids severed TCP connections by cloud NAT/firewalls)
        config.setKeepaliveTime(30000);      // 30s keepalive ping
        config.setLeakDetectionThreshold(60000);

        // Performance and timeout properties for MySQL connector
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        config.addDataSourceProperty("useServerPrepStmts", "true");
        config.addDataSourceProperty("connectTimeout", "30000");
        config.addDataSourceProperty("socketTimeout", "60000");

        HikariDataSource ds;
        try {
            ds = new HikariDataSource(config);
            verifyAndLogConnection(ds, params);
            return ds;
        } catch (Exception ex) {
            logger.error("================================================================================");
            logger.error("  CRITICAL: DATABASE INITIALIZATION FAILED ON STARTUP");
            logger.error("  Target Endpoint : {}:{}", params.getHost(), params.getPort());
            logger.error("  Target Database : {}", params.getDatabaseName());
            logger.error("  Configured User : {}", params.getUsername());
            logger.error("  Target JDBC URL : {}", maskUrl(params.getJdbcUrl()));
            logger.error("  Error Type      : {}", ex.getClass().getName());
            logger.error("  Error Message   : {}", ex.getMessage());
            diagnoseAndLogFailure(ex, params);
            logger.error("================================================================================");
            throw new IllegalStateException("Failed to establish database connection to " + params.getHost() + ":" + params.getPort() + "/" + params.getDatabaseName(), ex);
        }
    }

    private void verifyAndLogConnection(DataSource ds, ResolvedDataSourceParams params) {
        try (Connection conn = ds.getConnection()) {
            DatabaseMetaData meta = conn.getMetaData();
            logger.info("================================================================================");
            logger.info("  DATABASE CONNECTION VERIFIED AND READY");
            logger.info("  Database Product : {} (v{})", meta.getDatabaseProductName(), meta.getDatabaseProductVersion());
            logger.info("  Host Endpoint    : {}:{}", params.getHost(), params.getPort());
            logger.info("  Database Catalog : {}", conn.getCatalog());
            logger.info("  Database User    : {}", meta.getUserName());
            logger.info("  SSL Mode         : {}", params.getSslMode());
            logger.info("  Target JDBC URL  : {}", maskUrl(params.getJdbcUrl()));
            logger.info("================================================================================");
        } catch (Exception ex) {
            logger.error("================================================================================");
            logger.error("  CRITICAL: DATABASE INITIALIZATION FAILED");
            logger.error("  Target Endpoint : {}:{}", params.getHost(), params.getPort());
            logger.error("  Target Database : {}", params.getDatabaseName());
            logger.error("  Configured User : {}", params.getUsername());
            logger.error("  Target JDBC URL : {}", maskUrl(params.getJdbcUrl()));
            logger.error("  Error Type      : {}", ex.getClass().getName());
            logger.error("  Error Message   : {}", ex.getMessage());
            diagnoseAndLogFailure(ex, params);
            logger.error("================================================================================");
            if (ds instanceof HikariDataSource hikariDs && !hikariDs.isClosed()) {
                hikariDs.close();
            }
            throw new IllegalStateException("Failed to establish database connection to " + params.getHost() + ":" + params.getPort() + "/" + params.getDatabaseName(), ex);
        }
    }

    private static void diagnoseAndLogFailure(Throwable rootEx, ResolvedDataSourceParams params) {
        Throwable curr = rootEx;
        boolean unknownHost = false;
        boolean communicationsFailure = false;
        boolean accessDenied = false;
        boolean sslError = false;
        boolean dbNotExist = false;

        while (curr != null) {
            String msg = curr.getMessage() != null ? curr.getMessage() : "";
            if (curr instanceof java.net.UnknownHostException || msg.contains("UnknownHostException") || msg.contains("Name or service not known")) {
                unknownHost = true;
            }
            if (msg.contains("Communications link failure") || curr.getClass().getName().contains("CJCommunicationsException") || curr.getClass().getName().contains("CommunicationsException")) {
                communicationsFailure = true;
            }
            if (msg.contains("Access denied") || msg.contains("1045")) {
                accessDenied = true;
            }
            if (msg.contains("SSL") || msg.contains("handshake") || msg.contains("Certificates") || msg.contains("PKIX")) {
                sslError = true;
            }
            if (msg.contains("Unknown database") || msg.contains("1049")) {
                dbNotExist = true;
            }
            curr = curr.getCause();
        }

        logger.error("--- ACTIONABLE DIAGNOSIS & REMEDIATION STEPS ---");
        if (unknownHost) {
            logger.error("1. [UNKNOWN HOST ERROR]: DNS resolution failed for hostname '{}'.", params.getHost());
            logger.error("   * IF USING AIVEN CLOUD:");
            logger.error("     - Go to the Aiven Console (https://console.aiven.io/).");
            logger.error("     - Check service state: If it is 'POWERED OFF', click 'Power on'. Aiven removes DNS records when services are stopped.");
            logger.error("     - Copy the exact 'Host' from the Aiven Service Overview (e.g. mysql-xxxx-xxxx.aivencloud.com).");
            logger.error("   * IF ON RENDER:");
            logger.error("     - Update the DB_HOST environment variable with the exact active hostname.");
        }
        if (communicationsFailure && !unknownHost) {
            logger.error("2. [COMMUNICATIONS LINK FAILURE]: Could not establish TCP connection to {}:{}.", params.getHost(), params.getPort());
            logger.error("   * Verify port: Aiven MySQL runs on a high dynamic port (e.g., 23456), NOT default 3306.");
            logger.error("   * Verify DB_PORT in Render environment variables.");
            logger.error("   * Ensure Aiven firewall IP filters (if enabled) allow incoming traffic from 0.0.0.0/0 (Render).");
        }
        if (accessDenied) {
            logger.error("3. [AUTHENTICATION FAILURE]: Access denied for user '{}'.", params.getUsername());
            logger.error("   * In Aiven MySQL, the default user is 'avnadmin', not 'root'.");
            logger.error("   * Verify DB_USERNAME=avnadmin and DB_PASSWORD match the credentials in Aiven Console.");
        }
        if (sslError) {
            logger.error("4. [SSL / TLS ERROR]: SSL negotiation failed with MySQL server.");
            logger.error("   * Aiven requires encrypted SSL connections. Set DB_SSL_MODE=REQUIRED and allowPublicKeyRetrieval=true.");
        }
        if (dbNotExist) {
            logger.error("5. [DATABASE NOT FOUND]: Database '{}' does not exist.", params.getDatabaseName());
            logger.error("   * In Aiven MySQL, the default pre-created database is 'defaultdb'. Set DB_NAME=defaultdb.");
        }
    }

    public static String maskUrl(String url) {
        if (url == null) return null;
        String masked = url.replaceAll("://([^:]+):([^@]+)@", "://$1:****@");
        return masked.replaceAll("(?i)(password=)[^&]+", "$1****");
    }

    private static boolean isLocalhost(String host) {
        if (host == null) return true;
        String h = host.trim().toLowerCase();
        return h.equals("localhost") || h.equals("127.0.0.1") || h.equals("::1");
    }

    private static String enhanceJdbcUrl(String rawUrl) {
        if (!rawUrl.startsWith("jdbc:mysql:") && !rawUrl.startsWith("jdbc:mariadb:")) {
            return rawUrl;
        }
        char delimiter = rawUrl.contains("?") ? '&' : '?';
        StringBuilder enhanced = new StringBuilder(rawUrl);
        String host = parseHost(rawUrl);
        boolean isRemote = !isLocalhost(host);

        if (!rawUrl.contains("allowPublicKeyRetrieval")) {
            enhanced.append(delimiter).append("allowPublicKeyRetrieval=true");
            delimiter = '&';
        }
        if (!rawUrl.contains("sslMode") && !rawUrl.contains("useSSL")) {
            enhanced.append(delimiter).append("sslMode=").append(isRemote ? "REQUIRED" : "PREFERRED");
            delimiter = '&';
        }
        if (!rawUrl.contains("serverTimezone")) {
            enhanced.append(delimiter).append("serverTimezone=UTC");
            delimiter = '&';
        }
        if (!rawUrl.contains("connectTimeout")) {
            enhanced.append(delimiter).append("connectTimeout=30000");
            delimiter = '&';
        }
        if (!rawUrl.contains("socketTimeout")) {
            enhanced.append(delimiter).append("socketTimeout=60000");
            delimiter = '&';
        }
        if (!rawUrl.contains("createDatabaseIfNotExist")) {
            enhanced.append(delimiter).append("createDatabaseIfNotExist=true");
        }
        return enhanced.toString();
    }

    private static String parseHost(String jdbcUrl) {
        if (jdbcUrl == null) return "localhost";
        try {
            String clean = jdbcUrl.replaceFirst("^jdbc:mysql://", "").replaceFirst("^mysql://", "");
            int slash = clean.indexOf('/');
            String hostPort = slash > 0 ? clean.substring(0, slash) : clean;
            int colon = hostPort.indexOf(':');
            return colon > 0 ? hostPort.substring(0, colon) : hostPort;
        } catch (Exception e) {
            return "unknown";
        }
    }

    private static int parsePort(String jdbcUrl) {
        if (jdbcUrl == null) return 3306;
        try {
            String clean = jdbcUrl.replaceFirst("^jdbc:mysql://", "").replaceFirst("^mysql://", "");
            int slash = clean.indexOf('/');
            String hostPort = slash > 0 ? clean.substring(0, slash) : clean;
            int colon = hostPort.indexOf(':');
            if (colon > 0) {
                return Integer.parseInt(hostPort.substring(colon + 1));
            }
        } catch (Exception ignored) {}
        return 3306;
    }

    private static String parseDb(String jdbcUrl) {
        if (jdbcUrl == null) return "ai_interview_prep";
        try {
            String clean = jdbcUrl.replaceFirst("^jdbc:mysql://", "").replaceFirst("^mysql://", "");
            int slash = clean.indexOf('/');
            if (slash > 0) {
                String pathQuery = clean.substring(slash + 1);
                int q = pathQuery.indexOf('?');
                return q > 0 ? pathQuery.substring(0, q) : pathQuery;
            }
        } catch (Exception ignored) {}
        return "ai_interview_prep";
    }

    private static String parseSsl(String jdbcUrl) {
        if (jdbcUrl == null) return "PREFERRED";
        if (jdbcUrl.contains("sslMode=REQUIRED") || jdbcUrl.contains("ssl-mode=REQUIRED")) return "REQUIRED";
        if (jdbcUrl.contains("sslMode=DISABLED") || jdbcUrl.contains("ssl-mode=DISABLED")) return "DISABLED";
        if (jdbcUrl.contains("sslMode=VERIFY_CA")) return "VERIFY_CA";
        if (jdbcUrl.contains("sslMode=VERIFY_IDENTITY")) return "VERIFY_IDENTITY";
        return "PREFERRED";
    }

    private static boolean isCloudEnvironment(Environment env) {
        return env.containsProperty("RENDER") ||
                env.containsProperty("RENDER_SERVICE_ID") ||
                env.containsProperty("PORT") && "10000".equals(env.getProperty("PORT"));
    }

    private static String getFirstEnv(Environment env, String... keys) {
        for (String key : keys) {
            String val = env.getProperty(key);
            if (val != null && !val.trim().isEmpty()) {
                return val.trim();
            }
        }
        return null;
    }

    private static String getFirstEnvOrDefault(Environment env, String defaultVal, String... keys) {
        String val = getFirstEnv(env, keys);
        return (val != null && !val.trim().isEmpty()) ? val.trim() : defaultVal;
    }

    private static int resolvePort(Environment env, String host, String portStr) {
        if (portStr != null && !portStr.isBlank()) {
            try {
                return Integer.parseInt(portStr.trim());
            } catch (NumberFormatException e) {
                logger.warn("Invalid DB_PORT '{}', falling back", portStr);
            }
        }

        if (isCloudEnvironment(env)) {
            return 3306;
        }

        if (isLocalhost(host)) {
            if (isPortListening("127.0.0.1", 3307)) {
                logger.info("Auto-detected local MySQL database active on port 3307");
                return 3307;
            }
            if (isPortListening("127.0.0.1", 3306)) {
                logger.info("Auto-detected local MySQL database active on port 3306");
                return 3306;
            }
            return 3307;
        }

        return 3306;
    }

    private static boolean isPortListening(String host, int port) {
        try (java.net.Socket s = new java.net.Socket()) {
            s.connect(new java.net.InetSocketAddress(host, port), 200);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
