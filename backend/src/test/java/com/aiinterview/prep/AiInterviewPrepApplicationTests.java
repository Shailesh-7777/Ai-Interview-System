package com.aiinterview.prep;

import com.aiinterview.prep.controller.HomeController;
import com.aiinterview.prep.security.JwtTokenProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("h2")
class AiInterviewPrepApplicationTests {

    @Autowired
    private HomeController homeController;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Test
    void contextLoads() {
        assertNotNull(homeController, "HomeController should be loaded in the application context");
    }

    @Test
    void testRootEndpoint() {
        ResponseEntity<Map<String, Object>> response = homeController.root();
        assertNotNull(response.getBody());
        assertEquals("UP", response.getBody().get("status"));
        assertEquals("AI Interview Prep Backend REST API", response.getBody().get("service"));
    }

    @Test
    void testHealthEndpoint() {
        ResponseEntity<Map<String, Object>> response = homeController.health();
        assertNotNull(response.getBody());
        assertEquals("UP", response.getBody().get("status"));
        assertEquals("CONNECTED", response.getBody().get("database"));
    }

    @Test
    void testPasswordEncoder() {
        String raw = "student123";
        String encoded = passwordEncoder.encode(raw);
        assertTrue(passwordEncoder.matches(raw, encoded));
    }

    @Test
    void testJwtTokenGenerationAndValidation() {
        String token = jwtTokenProvider.generateTokenFromUsername("student@aiinterview.com");
        assertNotNull(token);
        assertTrue(jwtTokenProvider.validateToken(token));
        assertEquals("student@aiinterview.com", jwtTokenProvider.getUsernameFromToken(token));
    }
}
