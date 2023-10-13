package org.example.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.stream.IntStream;

public class RandomArray {

    private RandomArray() {

    }

    public static int[] randomInitArray(int capacity) throws NoSuchAlgorithmException {
        SecureRandom random = SecureRandom.getInstanceStrong();
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int[] sortInitArray(int capacity) {
        return IntStream.range(0, capacity).toArray();
    }

}
