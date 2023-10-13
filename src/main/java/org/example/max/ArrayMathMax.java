package org.example.max;

public class ArrayMathMax implements ArrayMaxValue {

    @Override
    public int getMax(int[] array) {
        int max = 0;
        for (int j : array) {
            max = Math.max(max, j);
        }
        return max;
    }

    @Override
    public int[] topMax(int[] array, int offset) {
        int[] top = new int[offset];
        int previousMax = Integer.MAX_VALUE;
        for (int i = 0; i < offset; i++) {
            int currentMax = findMaxUnderBoundary(array, previousMax);
            previousMax = currentMax;
            top[i] = currentMax;
        }
        return top;
    }

    private int findMaxUnderBoundary(int[] array, int topBoundary) {
        int currentMax = Integer.MIN_VALUE;
        for (int j : array) {
            if (j < topBoundary) {
                currentMax = Math.max(currentMax, j);
            }
        }
        return currentMax;
    }

}
