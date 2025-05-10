package com.pixel.blackbaud;

import java.security.SecureRandom;
import java.util.UUID;

public class SecureRandomUUID {
    public static String generateSecureUUID() {
        // Create a SecureRandom instance
        SecureRandom secureRandom = new SecureRandom();

        // Generate 16 random bytes (128 bits)
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        // Set the version (UUID version 4, based on random numbers)
        randomBytes[6] &= 0x0f;  // clear version bits
        randomBytes[6] |= 0x40;  // set version 4
        randomBytes[8] &= 0x3f;  // clear variant bits
        randomBytes[8] |= 0x80;  // set variant 10xx

        // Convert the bytes to a UUID (UUID format is based on 16 bytes)
        return UUID.nameUUIDFromBytes(randomBytes).toString();
    }

    public static void main(String[] args) {
        String secureUUID = generateSecureUUID();
        System.out.println("Secure UUID: " + secureUUID);
    }

}
