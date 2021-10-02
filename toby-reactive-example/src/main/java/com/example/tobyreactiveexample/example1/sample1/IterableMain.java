package com.example.tobyreactiveexample.example1.sample1;

import java.util.Iterator;

public class IterableMain {

    public static void main(String[] args) {


        Iterable<Integer> iter = new Iterable<>(){

            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {

                    int i = 0;
                    final static int MAX = 10;
                    @Override
                    public boolean hasNext() {
                        return i < MAX;
                    }

                    @Override
                    public Integer next() {
                        return ++i;
                    }
                };
            }
        };

        for (Integer i : iter){
            System.out.println(i);
        }

        for(Iterator<Integer> it = iter.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
