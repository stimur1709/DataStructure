package org.example.search;

import org.example.util.RandomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SearchValueTest {

    private int[] array;
    BinarySearch binarySearch;
    BinaryRecursiveSearch binaryRecursiveSearch;


    @BeforeEach
    void setUp() {
        array = RandomArray.sortInitArray(5_000_000);
        binarySearch = new BinarySearch();
        binaryRecursiveSearch = new BinaryRecursiveSearch();
    }

    @Test
    @DisplayName("testSearchValue")
    void testSearchValue() {
        int bSearch = search(array, 156300, binarySearch);
        int brSearch = search(array, 1563, binaryRecursiveSearch);
        Assertions.assertEquals(brSearch, bSearch);
    }

    public int search(int[] array, int key, SearchValue searchValue) {
        long start = System.currentTimeMillis();
        int search = searchValue.search(array, key);
        System.out.printf("with %s top max: %s, execution time: %d%n", searchValue.getClass().getName(), search, System.currentTimeMillis() - start);
        return search;
    }

}