package org.example.max;

import java.util.Arrays;

public class ArraySort implements ArrayMaxValue {

    @Override
    public int getMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    @Override
    public int[] topMax(int[] array, int offset) {
        Arrays.sort(array);
        return reverse(Arrays.copyOfRange(array, array.length - offset, array.length));
    }

}
