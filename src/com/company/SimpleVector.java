package com.company;
//Динамический массив который при исчерпании места просто увеличиваниется
//на несколько эллеметнов
public class SimpleVector<T> implements IArray<T> {
    private int size;
    private int vector;
    public SimpleVector(int vector) {
        array =  (T[])(new Object[vector]);
        size = 0;
        this.vector = vector;
    }
    T array[];
    public T get(int index) {
        return array[index];
    }
    public void put(T element) {
        if ( size() == array.length )
            resize();

        array[ size() ] = element;
        size++;
    }
    private void resize() {
        T[] new_array = (T[]) (new Object[size() + vector] );
        if ( !isEmpty() ) {
            System.arraycopy(array,0, new_array,0, size());

        }
        array = new_array;
    }
    public int size() {
        return size;
    }

}
