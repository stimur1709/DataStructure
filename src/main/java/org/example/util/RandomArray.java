package org.example.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomArray {

    private RandomArray() {

    }

    public static int[] randomInitArray(int capacity) {
        return IntStream
                .range(0, capacity)
                .map(i -> RandomNumber.nextInt(capacity))
                .toArray();
    }

    public static List<Integer> randomInitList(int capacity) {
        return IntStream
                .range(0, capacity)
                .mapToObj(i -> RandomNumber.nextInt(capacity))
                .collect(Collectors.toCollection(() -> new ArrayList<>(capacity)));
    }

    public static Integer[] sortInitArray(int capacity) {
        return IntStream
                .range(0, capacity)
                .boxed()
                .toArray(Integer[]::new);
    }


}
