package org.example.sort;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class QuickSorter<E> implements Sorter<E> {

    @Override
    public List<E> sort(List<E> list) {
        if (list.size() < 2) {
            return list;
        } else {
            E pivot = list.get(0);
            List<E> less = list.stream().skip(1).filter(v -> compare(v, pivot)).toList();
            List<E> greater = list.stream().skip(1).filter(v -> !compare(v, pivot)).toList();
            return Stream.of(
                            sort(less).stream(),
                            Stream.of(pivot),
                            sort(greater).stream()
                    ).flatMap(Function.identity())
                    .toList();
        }
    }


}
