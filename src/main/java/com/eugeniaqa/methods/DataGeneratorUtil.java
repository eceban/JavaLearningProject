package com.eugeniaqa.methods;

import java.security.SecureRandom;
import java.util.UUID;

public class DataGeneratorUtil {

    static SecureRandom random = new SecureRandom();

    public static int getRandomInt(int startLimit, int endLimit) {
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + startLimit;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + getRandomInt(99) + emailDomain;
    }
}
