package org.example.util;

public class RandomNumber {

    private RandomNumber() {

    }

    public static int nextInt(int from, int before) {
        return from + (int) (Math.random() * before);
    }

    public static int nextInt(int before) {
        return nextInt(0, before);
    }
}
