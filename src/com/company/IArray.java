package com.company;

public interface IArray <T> {
    T get(int index);
    void put(T item);
    //void put(int pos, T item);
    int size() ;

    default boolean isEmpty() {
          return size()== 0;
    }
}
