package org.example.search;

import org.example.util.RandomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SearchValueArrayTest {

    private final Integer[] array = RandomArray.sortInitArray(5_000);
    BinarySearchArray<Integer> binarySearch = new BinarySearchArray<>() {
        @Override
        public byte compare(Integer v1, Integer v2) {
            return (byte) (v1.compareTo(v2));
        }
    };
    BinaryRecursiveSearchArray<Integer> binaryRecursiveSearch = new BinaryRecursiveSearchArray<>() {
        @Override
        public byte compare(Integer v1, Integer v2) {
            return (byte) (v1.compareTo(v2));
        }
    };

    @Test
    @DisplayName("testSearchValue")
    void testSearchValue() throws Exception {
        int bSearch = search(array, 15, binarySearch);
        int brSearch = search(array, 15, binaryRecursiveSearch);
        Assertions.assertEquals(brSearch, bSearch);
    }

    public int search(Integer[] array, int key, SearchValueArray<Integer> searchValueArray) throws Exception {
        long start = System.currentTimeMillis();
        int search = searchValueArray.search(array, key);
        System.out.printf("with %s top max: %s, execution time: %d%n", searchValueArray.getClass().getName(), search, System.currentTimeMillis() - start);
        return search;
    }

}