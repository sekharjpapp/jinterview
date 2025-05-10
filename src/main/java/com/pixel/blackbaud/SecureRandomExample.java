package com.pixel.blackbaud;

import java.security.SecureRandom;
import java.util.Base64;

public class SecureRandomExample {
    public static void main(String[] args) {
        // Instantiate a SecureRandom instance
        SecureRandom secureRandom = new SecureRandom();

        // Generate a random integer
        int randomInt = secureRandom.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random double
        double randomDouble = secureRandom.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate a secure random byte array (useful for tokens or keys)
        byte[] randomBytes = new byte[16]; // 16 bytes = 128 bits
        secureRandom.nextBytes(randomBytes);
        String secureToken = Base64.getUrlEncoder().withoutPadding().encodeToString(randomBytes);
        System.out.println("Secure Token: " + secureToken);
    }
}
