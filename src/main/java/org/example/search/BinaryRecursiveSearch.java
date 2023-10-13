package org.example.search;

public class BinaryRecursiveSearch implements SearchValue {

    public int lowerBound(int[] array, int search, int left, int right) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] < search) {
                return lowerBound(array, search, middle + 1, right);
            } else if (array[middle] > search) {
                return lowerBound(array, search, left, middle - 1);
            } else {
                return middle;
            }
        }
        return -1;
    }

    @Override
    public int search(int[] array, int search) {
        return lowerBound(array, search, 0, array.length);
    }

}
