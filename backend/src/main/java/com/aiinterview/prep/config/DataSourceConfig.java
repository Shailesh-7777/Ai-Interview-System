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

@Configuration
@Profile("!h2")
public class DataSourceConfig {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    public static class ResolvedDataSourceParams {
        private final String jdbcUrl;
        private final String username;
        private final String password;

        public ResolvedDataSourceParams(String jdbcUrl, String username, String password) {
            this.jdbcUrl = jdbcUrl;
            this.username = username;
            this.password = password;
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
    }

    public static ResolvedDataSourceParams resolveParameters(Environment env) {
        String rawUrl = getFirstEnv(env,
                "SPRING_DATASOURCE_URL",
                "DATABASE_URL",
                "MYSQL_URL",
                "DB_URL",
                "spring.datasource.url"
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

        if (rawUrl != null && !rawUrl.isBlank()) {
            rawUrl = rawUrl.trim();

            // Handle standard URI syntax: mysql://user:pass@host:port/database
            if (rawUrl.startsWith("mysql://") || rawUrl.startsWith("mariadb://")) {
                try {
                    URI uri = new URI(rawUrl);
                    String host = uri.getHost() != null ? uri.getHost() : "localhost";
                    int port = uri.getPort() > 0 ? uri.getPort() : 3306;
                    String path = uri.getPath();
                    String dbName = (path != null && path.length() > 1) ? path.substring(1) : "ai_interview_prep";

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

                    String query = uri.getQuery();
                    StringBuilder queryParams = new StringBuilder();
                    if (query != null && !query.isBlank()) {
                        String normalized = query.replace("ssl-mode=", "sslMode=");
                        queryParams.append(normalized);
                        if (!normalized.contains("sslMode") && !normalized.contains("useSSL")) {
                            queryParams.append("&sslMode=PREFERRED");
                        }
                        if (!normalized.contains("allowPublicKeyRetrieval")) {
                            queryParams.append("&allowPublicKeyRetrieval=true");
                        }
                        if (!normalized.contains("serverTimezone")) {
                            queryParams.append("&serverTimezone=UTC");
                        }
                    } else {
                        queryParams.append("sslMode=PREFERRED&allowPublicKeyRetrieval=true&serverTimezone=UTC");
                    }

                    resolvedJdbcUrl = String.format("jdbc:mysql://%s:%d/%s?%s", host, port, dbName, queryParams);
                    logger.info("Configured MySQL DataSource from URI string targeting host: [{}:{}] and database: [{}]", host, port, dbName);
                } catch (Exception e) {
                    logger.warn("Could not parse database URI as RFC 2396; using fallback translation: {}", e.getMessage());
                    resolvedJdbcUrl = rawUrl.replaceFirst("^(mysql|mariadb)://", "jdbc:mysql://");
                }
            } else if (rawUrl.startsWith("jdbc:")) {
                if (rawUrl.startsWith("jdbc:mysql:") || rawUrl.startsWith("jdbc:mariadb:")) {
                    char delimiter = rawUrl.contains("?") ? '&' : '?';
                    StringBuilder enhanced = new StringBuilder(rawUrl);
                    if (!rawUrl.contains("allowPublicKeyRetrieval")) {
                        enhanced.append(delimiter).append("allowPublicKeyRetrieval=true");
                        delimiter = '&';
                    }
                    if (!rawUrl.contains("sslMode") && !rawUrl.contains("useSSL")) {
                        enhanced.append(delimiter).append("sslMode=PREFERRED");
                        delimiter = '&';
                    }
                    if (!rawUrl.contains("serverTimezone")) {
                        enhanced.append(delimiter).append("serverTimezone=UTC");
                        delimiter = '&';
                    }
                    if (!rawUrl.contains("createDatabaseIfNotExist")) {
                        enhanced.append(delimiter).append("createDatabaseIfNotExist=true");
                    }
                    resolvedJdbcUrl = enhanced.toString();
                } else {
                    resolvedJdbcUrl = rawUrl;
                }
            } else {
                resolvedJdbcUrl = "jdbc:mysql://" + rawUrl;
            }
        } else {
            // Build from discrete environment parameters
            String host = getFirstEnvOrDefault(env, "localhost", "DB_HOST", "MYSQL_HOST", "MYSQLHOST");
            String portStr = getFirstEnv(env, "DB_PORT", "MYSQL_PORT", "MYSQLPORT");
            String db = getFirstEnvOrDefault(env, "ai_interview_prep", "DB_NAME", "MYSQL_DATABASE", "MYSQLDATABASE");
            String sslMode = getFirstEnvOrDefault(env, "PREFERRED", "DB_SSL_MODE", "MYSQL_SSL_MODE");

            int port = resolvePort(env, host, portStr);

            resolvedJdbcUrl = String.format("jdbc:mysql://%s:%d/%s?sslMode=%s&allowPublicKeyRetrieval=true&serverTimezone=UTC&createDatabaseIfNotExist=true",
                    host, port, db, sslMode);

            logger.info("Configured MySQL DataSource from parameters targeting host: [{}:{}] and database: [{}]", host, port, db);
        }

        if (username == null || username.isBlank()) username = "root";
        if (password == null) password = "root";

        boolean isLocalhost = resolvedJdbcUrl.contains("//localhost") || resolvedJdbcUrl.contains("//127.0.0.1");
        if (isLocalhost && isCloudEnvironment(env)) {
            logger.warn("\n" +
                    "********************************************************************************\n" +
                    "⚠️  DATABASE CONFIGURATION WARNING FOR CLOUD DEPLOYMENT:\n" +
                    "The application is configured to connect to MySQL on localhost: [{}]\n" +
                    "but this service is running in a cloud container (Render) where no local MySQL daemon is present.\n" +
                    "\n" +
                    "To connect to your database, set the following environment variables in Render:\n" +
                    "  - DB_HOST (e.g., your MySQL host from Aiven, Railway, AWS RDS, PlanetScale, etc.)\n" +
                    "  - DB_PORT (e.g., 3306)\n" +
                    "  - DB_NAME (e.g., ai_interview_prep)\n" +
                    "  - DB_USER (your database user)\n" +
                    "  - DB_PASSWORD (your database password)\n" +
                    "Or supply a single connection URL:\n" +
                    "  - DATABASE_URL (e.g., mysql://user:pass@host:3306/dbname)\n" +
                    "********************************************************************************", resolvedJdbcUrl);
        }

        return new ResolvedDataSourceParams(resolvedJdbcUrl, username, password);
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

        // Resilient connection pool configuration
        config.setConnectionTimeout(20000);
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setIdleTimeout(300000);
        config.setMaxLifetime(1800000);

        return new HikariDataSource(config);
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

        if ("localhost".equalsIgnoreCase(host) || "127.0.0.1".equals(host)) {
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
