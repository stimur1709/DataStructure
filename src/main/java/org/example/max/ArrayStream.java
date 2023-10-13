package org.example.max;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayStream implements ArrayMaxValue {

    @Override
    public int getMax(int[] array) {
        return Arrays.stream(array).max().orElse(0);
    }

    @Override
    public int[] topMax(int[] array, int offset) {
        return Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(offset)
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
