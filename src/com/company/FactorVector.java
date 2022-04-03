package com.company;
//Динамические массив который при аллокации увеличивается в n раз
public class FactorVector<T> implements IArray<T> {
    private int factor;
    private int init_size;
    private int size;
    public FactorVector(int factor, int init_size) {
        array =  (T[])(new Object[init_size]);
        size = 0;
        this.init_size = init_size;
        this.factor = factor;
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
        T[] new_array = (T[]) (new Object[size() * factor ] );
        if ( !isEmpty() ) {
            System.arraycopy(array,0, new_array,0, size());

        }
        array = new_array;
    }
    public int size() {
        return size;
    }

}
