package org.example.sort;

import org.example.ArraysWorker;
import org.example.util.RandomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SorterTest {

    private ArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(RandomArray.randomInitList(10));
    }

    @Test
    @DisplayName("test_sort")
    void test_sort() {
        List<Integer> sort1 = ArraysWorker.sort(new ArrayList<>(list), new SelectSorter<>() {
            @Override
            public boolean compare(Integer value1, Integer value2) {
                return compareValues(value1, value2);
            }
        });
        List<Integer> sort2 = ArraysWorker.sort(new ArrayList<>(list), new QuickSorter<>() {
            @Override
            public boolean compare(Integer value1, Integer value2) {
                return compareValues(value1, value2);
            }
        });
        Assertions.assertEquals(sort1, sort2);
    }

    private static boolean compareValues(Integer value1, Integer value2) {
        return value1 < value2;
    }

}