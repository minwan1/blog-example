package com.example.tobyreactiveexample.example1.sample1;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableMain {

    static class IntObservable extends Observable implements Runnable{
        public void run() {

            for(int i = 1; i <= 10; i++){
                setChanged(); //publisher, observable
                notifyObservers(i);
            }

        }
    }


    public static void main(String[] args) throws IOException {
        Observer ob = new Observer() {
            @Override
            public void update(Observable o, Object arg) { // subscriber // observer

                System.out.println(Thread.currentThread().getName() + " "  + arg);

            }
        };

        IntObservable io = new IntObservable();
        io.addObserver(ob);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(io);
        System.out.println(Thread.currentThread().getName() + " "  + "EXIT");
    }
}
