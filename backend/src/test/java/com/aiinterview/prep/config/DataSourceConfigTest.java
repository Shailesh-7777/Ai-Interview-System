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
        assertTrue(params.getJdbcUrl().contains("sslMode=PREFERRED"));
        assertTrue(params.getJdbcUrl().contains("serverTimezone=UTC"));
        assertEquals("dbuser", params.getUsername());
        assertEquals("dbpass", params.getPassword());
    }
}
