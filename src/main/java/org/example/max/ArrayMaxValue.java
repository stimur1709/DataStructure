package org.example.max;

public interface ArrayMaxValue {

    int getMax(int[] array);

    int[] topMax(int[] array, int offset);

    default int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }
        return reversed;
    }

}
