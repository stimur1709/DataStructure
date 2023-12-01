package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public abstract class SelectSorter<E> implements Sorter<E> {

    @Override
    public List<E> sort(List<E> list) {
        List<E> newArray = new ArrayList<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int smallestIndex = findSmallest(list);
            newArray.add(list.get(smallestIndex));
            list.remove(smallestIndex);
        }
        return newArray;
    }

    private int findSmallest(List<E> arrayList) {
        E smallest = arrayList.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            E i1 = arrayList.get(i);
            if (compare(i1, smallest)) {
                smallest = i1;
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}
