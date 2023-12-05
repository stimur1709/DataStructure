package org.example.search;

public abstract class BinarySearchArray<E> implements SearchValueArray<E> {

    @Override
    public E search(E[] array, E search) throws Exception {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            E i = array[middle];
            if (compare(i, search) == -1) {
                left = middle + 1;
            } else if (compare(i, search) == 1) {
                right = middle - 1;
            } else {
                return search;
            }
        }
        throw new Exception("Не найдено");
    }

}
