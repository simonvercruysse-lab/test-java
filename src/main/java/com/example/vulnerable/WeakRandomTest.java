package com.example.vulnerable;

import java.util.Random;

public class WeakRandom {

    // S2245 - insecure pseudorandom for security contextt
    public String generateSessionToken() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append((char) ('a' + random.nextInt(26)));
        }
        return sb.toString();
    }
}
