package com.example.vulnerable;

import java.io.IOException;

public class CommandInjection {

    // S4721 - OS command injection
    public Process pingHost(String host) throws IOException {
        return Runtime.getRuntime().exec("ping " + host);
    }

    // S4721 - OS command injection via array
    public Process pingHostArray(String host) throws IOException {
        return Runtime.getRuntime().exec(new String[] {"sh", "-c", "ping " + host});
    }
}