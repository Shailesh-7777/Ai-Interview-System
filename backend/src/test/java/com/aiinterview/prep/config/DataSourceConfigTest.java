package com.aiinterview.prep.config;

import org.junit.jupiter.api.Test;
import org.springframework.mock.env.MockEnvironment;

import static org.junit.jupiter.api.Assertions.*;

class DataSourceConfigTest {

    @Test
    void testResolveParametersFromFullUri() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("DATABASE_URL", "mysql://avnadmin:SecretPass123@mysql-aiven.aivencloud.com:23456/defaultdb?ssl-mode=REQUIRED");

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertTrue(params.getJdbcUrl().startsWith("jdbc:mysql://mysql-aiven.aivencloud.com:23456/defaultdb"));
        assertTrue(params.getJdbcUrl().contains("sslMode=REQUIRED"));
        assertTrue(params.getJdbcUrl().contains("allowPublicKeyRetrieval=true"));
        assertEquals("avnadmin", params.getUsername());
        assertEquals("SecretPass123", params.getPassword());
        assertEquals("mysql-aiven.aivencloud.com", params.getHost());
        assertEquals(23456, params.getPort());
        assertEquals("defaultdb", params.getDatabaseName());
        assertEquals("REQUIRED", params.getSslMode());
    }

    @Test
    void testResolveParametersFromDiscreteVariables() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("DB_HOST", "mysql.custom-host.com");
        env.setProperty("DB_PORT", "3306");
        env.setProperty("DB_NAME", "custom_interview_db");
        env.setProperty("DB_USER", "db_admin");
        env.setProperty("DB_PASSWORD", "db_password_456");
        env.setProperty("DB_SSL_MODE", "REQUIRED");

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertTrue(params.getJdbcUrl().startsWith("jdbc:mysql://mysql.custom-host.com:3306/custom_interview_db"));
        assertTrue(params.getJdbcUrl().contains("sslMode=REQUIRED"));
        assertTrue(params.getJdbcUrl().contains("allowPublicKeyRetrieval=true"));
        assertTrue(params.getJdbcUrl().contains("createDatabaseIfNotExist=true"));
        assertEquals("db_admin", params.getUsername());
        assertEquals("db_password_456", params.getPassword());
        assertEquals("mysql.custom-host.com", params.getHost());
        assertEquals(3306, params.getPort());
        assertEquals("custom_interview_db", params.getDatabaseName());
        assertEquals("REQUIRED", params.getSslMode());
    }

    @Test
    void testResolveParametersAivenDiscreteWithUsername() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("DB_HOST", "mysql-2048437f-kumsailesh784-0111.aivencloud.com");
        env.setProperty("DB_PORT", "23456");
        env.setProperty("DB_NAME", "defaultdb");
        env.setProperty("DB_USERNAME", "avnadmin");
        env.setProperty("DB_PASSWORD", "SuperSecureAivenPass");
        env.setProperty("DB_SSL_MODE", "REQUIRED");

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertTrue(params.getJdbcUrl().startsWith("jdbc:mysql://mysql-2048437f-kumsailesh784-0111.aivencloud.com:23456/defaultdb"));
        assertTrue(params.getJdbcUrl().contains("sslMode=REQUIRED"));
        assertTrue(params.getJdbcUrl().contains("allowPublicKeyRetrieval=true"));
        assertEquals("avnadmin", params.getUsername());
        assertEquals("SuperSecureAivenPass", params.getPassword());
        assertEquals("mysql-2048437f-kumsailesh784-0111.aivencloud.com", params.getHost());
        assertEquals(23456, params.getPort());
        assertEquals("defaultdb", params.getDatabaseName());
        assertEquals("REQUIRED", params.getSslMode());
    }

    @Test
    void testRemoteHostDefaultsToSslRequired() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("DB_HOST", "remote-mysql-server.net");
        env.setProperty("DB_PORT", "3306");
        env.setProperty("DB_NAME", "cloud_db");
        env.setProperty("DB_USERNAME", "cloud_user");
        env.setProperty("DB_PASSWORD", "cloud_pass");

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertEquals("REQUIRED", params.getSslMode());
        assertTrue(params.getJdbcUrl().contains("sslMode=REQUIRED"));
    }

    @Test
    void testResolveParametersFromRailwayConvention() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("MYSQLHOST", "containers-us-west-1.railway.app");
        env.setProperty("MYSQLPORT", "7123");
        env.setProperty("MYSQLDATABASE", "railway");
        env.setProperty("MYSQLUSER", "root");
        env.setProperty("MYSQLPASSWORD", "railwaypass");

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertTrue(params.getJdbcUrl().startsWith("jdbc:mysql://containers-us-west-1.railway.app:7123/railway"));
        assertEquals("root", params.getUsername());
        assertEquals("railwaypass", params.getPassword());
    }

    @Test
    void testResolveParametersDefaultLocalhost() {
        MockEnvironment env = new MockEnvironment();

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertTrue(params.getJdbcUrl().startsWith("jdbc:mysql://localhost:"));
        assertTrue(params.getJdbcUrl().contains("/ai_interview_prep?sslMode=PREFERRED"));
        assertTrue(params.getJdbcUrl().contains("allowPublicKeyRetrieval=true"));
        assertTrue(params.getJdbcUrl().contains("createDatabaseIfNotExist=true"));
        assertEquals("root", params.getUsername());
        assertEquals("root", params.getPassword());
    }

    @Test
    void testResolveParametersJdbcEnhancement() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("SPRING_DATASOURCE_URL", "jdbc:mysql://remote-db.com:3306/interview_db");
        env.setProperty("SPRING_DATASOURCE_USERNAME", "dbuser");
        env.setProperty("SPRING_DATASOURCE_PASSWORD", "dbpass");

        DataSourceConfig.ResolvedDataSourceParams params = DataSourceConfig.resolveParameters(env);
        assertNotNull(params);
        assertTrue(params.getJdbcUrl().contains("allowPublicKeyRetrieval=true"));
        assertTrue(params.getJdbcUrl().contains("sslMode=REQUIRED")); // remote host defaults to REQUIRED
        assertTrue(params.getJdbcUrl().contains("serverTimezone=UTC"));
        assertEquals("dbuser", params.getUsername());
        assertEquals("dbpass", params.getPassword());
    }

    @Test
    void testMaskUrl() {
        String urlWithCreds = "mysql://avnadmin:SecretPass123@mysql-aiven.aivencloud.com:23456/defaultdb";
        String masked = DataSourceConfig.maskUrl(urlWithCreds);
        assertFalse(masked.contains("SecretPass123"));
        assertTrue(masked.contains("avnadmin:****@"));

        String jdbcUrlWithPasswordParam = "jdbc:mysql://host:3306/db?password=SecretPass123&user=admin";
        String maskedJdbc = DataSourceConfig.maskUrl(jdbcUrlWithPasswordParam);
        assertFalse(maskedJdbc.contains("SecretPass123"));
        assertTrue(maskedJdbc.contains("password=****"));
    }

    @Test
    void testFallbackToH2WhenRemoteHostUnresolvable() throws Exception {
        MockEnvironment env = new MockEnvironment();
        // Point to an unresolvable cloud domain (exact scenario as reported on Render)
        env.setProperty("DB_HOST", "mysql-2048437f-kumsailesh784-0111.e.aivencloud.com");
        env.setProperty("DB_PORT", "23959");
        env.setProperty("DB_NAME", "defaultdb");
        env.setProperty("DB_USERNAME", "avnadmin");
        env.setProperty("DB_PASSWORD", "somePassword");
        env.setProperty("DB_ALLOW_FALLBACK", "true");

        DataSourceConfig config = new DataSourceConfig();
        javax.sql.DataSource ds = config.dataSource(env);
        assertNotNull(ds);
        try (java.sql.Connection conn = ds.getConnection()) {
            assertTrue(conn.isValid(2));
            assertEquals("H2", conn.getMetaData().getDatabaseProductName());
        }
    }

    @Test
    void testFailFastWhenFallbackDisabled() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("DB_HOST", "mysql-2048437f-kumsailesh784-0111.e.aivencloud.com");
        env.setProperty("DB_PORT", "23959");
        env.setProperty("DB_NAME", "defaultdb");
        env.setProperty("DB_ALLOW_FALLBACK", "false");

        DataSourceConfig config = new DataSourceConfig();
        assertThrows(IllegalStateException.class, () -> config.dataSource(env));
    }
}
