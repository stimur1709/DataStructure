package org.example.util;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomArray {

    private RandomArray() {

    }

    public static int[] randomInitArray(int capacity) throws NoSuchAlgorithmException {
        RandomNumber random = new RandomNumber(capacity);
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static List<Integer> randomInitList(int capacity) throws NoSuchAlgorithmException {
        RandomNumber random = new RandomNumber(capacity);
        return IntStream
                .range(0, capacity)
                .mapToObj(i -> random.nextInt())
                .collect(Collectors.toCollection(() -> new ArrayList<>(capacity)));
    }

    public static int[] sortInitArray(int capacity) {
        return IntStream.range(0, capacity).toArray();
    }


}
