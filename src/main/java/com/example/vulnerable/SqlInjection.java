package com.example.vulnerable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjection {

    // S2077, S3649 - SQL injection via string concatenation
    public ResultSet vulnerable(String userId) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM users WHERE id = " + userId;
        return stmt.executeQuery(sql);
    }

    // S2077 - SQL injection via String.format
    public ResultSet alsoVulnerable(String name) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();
        String sql = String.format("SELECT * FROM users WHERE name = '%s'", name);
        return stmt.executeQuery(sql);
    }
}