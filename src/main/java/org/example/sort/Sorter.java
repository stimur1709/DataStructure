package org.example.sort;

import java.util.List;

public interface Sorter<E> {

    List<E> sort(List<E> list);

    boolean compare(E value1, E value2);

}
