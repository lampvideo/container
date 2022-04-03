package com.company;

public class SingleArray<T> implements IArray<T> {
    public SingleArray() {
        array =  (T[])(new Object[0]);
    }
    T array[];
    public T get(int index) {
        return array[index];
    }
    public void put(T element) {
        resize();
        array[size() - 1] = element;
    }
    private void resize() {
        T new_array [] = (T[])(new Object[size() + 1]);
        if(!isEmpty()) {
            System.arraycopy(array,0, new_array,0, size());

        }
        array = new_array;
    }
    public int size() {
        return array.length;
    }

}
