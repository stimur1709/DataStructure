package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectSort implements Sort<List<Integer>> {

    @Override
    public List<Integer> sort(List<Integer> arrayList) {
        ArrayList<Integer> newArray = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            int smallestIndex = findSmallest(arrayList);
            newArray.add(arrayList.get(smallestIndex));
            arrayList.remove(smallestIndex);
        }
        return newArray;
    }

    private int findSmallest(List<Integer> arrayList) {
        int smallest = arrayList.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Integer i1 = arrayList.get(i);
            if (i1 < smallest) {
                smallest = i1;
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}
