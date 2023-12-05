package org.example.search;

public interface SearchValueArray<E> {

    E search(E[] array, E search) throws Exception;

    byte compare(E v1, E v2);
}
