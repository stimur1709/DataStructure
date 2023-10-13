package org.example.max;

import org.example.util.RandomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class ArrayMaxValueTest {

    private int[] array;
    ArraySort arraySort;
    ArrayMathMax arrayMathMax;
    ArrayStream arrayStream;

    @BeforeEach
    void setUp() throws NoSuchAlgorithmException {
        array = RandomArray.randomInitArray(5_000_000);
        arraySort = new ArraySort();
        arrayMathMax = new ArrayMathMax();
        arrayStream = new ArrayStream();
    }


    @Test
    @DisplayName("testMaxValueArray")
    void testMaxValueArray() {
        Set<Integer> set = new TreeSet<>();
        set.add(getMaxValueArray(Arrays.copyOf(array, array.length), arraySort));
        set.add(getMaxValueArray(array, arrayMathMax));
        set.add(getMaxValueArray(array, arrayStream));
        Assertions.assertEquals(1, set.size());
    }

    @Test
    @DisplayName("testMaxTopValue")
    void testMaxTopValue() {
        int offset = 5;
        Set<Integer> set = new TreeSet<>();
        set.add(getMaxTopValue(Arrays.copyOf(array, array.length), offset, arraySort));
        set.add(getMaxTopValue(array, offset, arrayMathMax));
        set.add(getMaxTopValue(array, offset, arrayStream));
        Assertions.assertEquals(1, set.size());
    }

    public int getMaxValueArray(int[] array, ArrayMaxValue arrayMaxValue) {
        long start = System.currentTimeMillis();
        int max = arrayMaxValue.getMax(array);
        System.out.printf("with %s max: %d, execution time: %d%n", arrayMaxValue.getClass().getName(), max, System.currentTimeMillis() - start);
        return max;
    }

    public int getMaxTopValue(int[] array, int offset, ArrayMaxValue arrayMaxValue) {
        long start = System.currentTimeMillis();
        int[] top = arrayMaxValue.topMax(array, offset);
        System.out.printf("with %s top max: %s, execution time: %d%n", arrayMaxValue.getClass().getName(), Arrays.toString(top), System.currentTimeMillis() - start);
        return top[0];
    }
}