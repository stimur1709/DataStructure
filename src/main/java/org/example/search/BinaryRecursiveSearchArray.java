package org.example.search;

public abstract class BinaryRecursiveSearchArray<E> implements SearchValueArray<E> {

    public E lowerBound(E[] array, E search, int left, int right) throws Exception {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (compare(array[middle], search) == -1) {
                return lowerBound(array, search, middle + 1, right);
            } else if (compare(array[middle], search) == 1) {
                return lowerBound(array, search, left, middle - 1);
            } else {
                return search;
            }
        }
        throw new Exception("Не найдено");
    }

    @Override
    public E search(E[] array, E search) throws Exception {
        return lowerBound(array, search, 0, array.length);
    }
}
