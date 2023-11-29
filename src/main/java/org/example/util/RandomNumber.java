package org.example.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class RandomNumber {

    private final SecureRandom random;
    private final  int capacity;

    public RandomNumber(int capacity) throws NoSuchAlgorithmException {
        this.capacity = capacity;
        this.random = SecureRandom.getInstanceStrong();
    }

    public int nextInt() {
        return random.nextInt(this.capacity) + 1;
    }
}
