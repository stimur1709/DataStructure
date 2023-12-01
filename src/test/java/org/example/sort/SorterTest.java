package org.example.sort;

import org.example.util.RandomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

class SorterTest {

    private ArrayList<Integer> list;

    @BeforeEach
    void setUp() throws NoSuchAlgorithmException {
        list = new ArrayList<>(RandomArray.randomInitList(10));
    }

    @Test
    @DisplayName("test_sort")
    void test_sort() {
        List<Integer> sort1 = sort(new SelectSorter<>() {
            @Override
            public boolean compare(Integer value1, Integer value2) {
                return isaBoolean(value1, value2);
            }
        });
        List<Integer> sort2 = sort(new QuickSorter<>() {
            @Override
            public boolean compare(Integer value1, Integer value2) {
                return isaBoolean(value1, value2);
            }
        });
        Assertions.assertEquals(sort1, sort2);
    }

    private static boolean isaBoolean(Integer value1, Integer value2) {
        return value1 < value2;
    }

    private List<Integer> sort(Sorter<Integer> sorter) {
        long start = System.currentTimeMillis();
        List<Integer> sortedList = sorter.sort(new ArrayList<>(list));
        System.out.printf(
                "sort %s, execution time: %d%n",
                sorter.getClass().getName(),
                System.currentTimeMillis() - start);
        return sortedList;
    }


}