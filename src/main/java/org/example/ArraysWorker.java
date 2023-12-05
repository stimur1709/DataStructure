package org.example;

import org.example.sort.Sorter;

import java.util.ArrayList;
import java.util.List;

public class ArraysWorker {

    public static <E> List<E> sort(List<E> list, Sorter<E> sorter) {
        long start = System.currentTimeMillis();
        List<E> sortedList = sorter.sort(new ArrayList<>(list));
        System.out.printf(
                "sort %s, execution time: %d%n",
                sorter.getClass().getName(),
                System.currentTimeMillis() - start);
        return sortedList;
    }

}
