package com.aiinterview.prep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired(required = false)
    private DataSource dataSource;

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        return ResponseEntity.ok(Map.of(
                "status", "UP",
                "service", "AI Interview Prep Backend REST API",
                "version", "1.0.0",
                "health", "/api/health",
                "roles", "/api/roles"
        ));
    }

    @GetMapping("/api/health")
    public ResponseEntity<Map<String, Object>> health() {
        boolean dbConnected = false;
        if (dataSource != null) {
            try (Connection conn = dataSource.getConnection()) {
                dbConnected = conn.isValid(2);
            } catch (Exception ignored) {
                dbConnected = false;
            }
        }
        return ResponseEntity.ok(Map.of(
                "status", dbConnected ? "UP" : "DEGRADED",
                "database", dbConnected ? "CONNECTED" : "DISCONNECTED"
        ));
    }
}
