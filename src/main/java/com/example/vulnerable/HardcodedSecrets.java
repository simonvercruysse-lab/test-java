package com.example.vulnerable;

public class HardcodedSecrets {

    // S2068 - hardcoded credential
    private static final String DB_PASSWORD = "admin123";
    private static final String API_TOKEN = "secretToken12345";

    // Real-format fake AWS keys
    private static final String AWS_KEY = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET = "wJalrXUtnFMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

    // GitHub PAT format
    private static final String GH_TOKEN = "ghp_1234567890abcdefghijklmnopqrstuvwxyz12";

    public String getCreds() {
        return DB_PASSWORD + ":" + API_TOKEN + ":" + AWS_KEY + ":" + AWS_SECRET + ":" + GH_TOKEN;
    }
}