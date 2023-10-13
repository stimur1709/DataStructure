package org.example.search;

public class BinarySearch implements SearchValue {

    @Override
    public int search(int[] array, int search) {
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] < search) {
                left = middle + 1;
            } else if (array[middle] > search) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
