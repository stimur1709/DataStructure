package org.example.sort;

import org.example.util.RandomArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

class SortTest {

    private ArrayList<Integer> arrayList;
    SelectSort selectSort;


    @BeforeEach
    void setUp() throws NoSuchAlgorithmException {
        arrayList = new ArrayList<>(RandomArray.randomInitList(5_000));
        selectSort = new SelectSort();
    }

    @Test
    @DisplayName("test_sort")
    void test_sort() {
        long start = System.currentTimeMillis();
        selectSort.sort(arrayList);
        System.out.printf("sort, execution time: %d%n", System.currentTimeMillis() - start);

    }


}