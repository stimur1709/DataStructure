package org.example.search;

public class BinarySearch implements SearchValue {

    @Override
    public int search(int[] array, int search) throws Exception {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int i = array[middle];
            if (i == search) {
                return search;
            } else if (i > search) {
                right = middle - 1;
            } else  {
                left = middle + 1;
            }
        }
        throw new Exception("Не найдено");
    }

}
