package com.company;

public class Main {

    public static void main(String[] args) {

        //обычный динамический массив с увеличением на const
        SingleArray<Integer> z = new SingleArray<>();
        testPut(z, 300);
        testPut(z, 3000);
        testPut(z, 30000);
        testPut(z, 300000);

        //динамический массив с увеличением на const эллементов при аллокации
        final int VECTOR_SIZE = 100;
        SimpleVector<Integer> v = new SimpleVector<>(VECTOR_SIZE);
        testPut(v, 300);
        testPut(v, 3000);
        testPut(v, 30000);
        testPut(v, 300000);

        //динамический массив с увеличением в factor раз
        final int FACTOR = 2;
        final int INIT_SIZE = 10;
        FactorVector<Integer> f = new FactorVector<>(FACTOR, INIT_SIZE);
        testPut(f, 300);
        testPut(f, 3000);
        testPut(f, 30000);
        testPut(f, 300000);

    }
    private static void testPut(IArray<Integer> single, int number) {
        long start = System.currentTimeMillis();
        for ( int i = 0; i < number; i++) {
            single.put( i );
        }
        System.out.println("Total: " + number + "  Duration:  " + (System.currentTimeMillis() - start) );
    }

}
