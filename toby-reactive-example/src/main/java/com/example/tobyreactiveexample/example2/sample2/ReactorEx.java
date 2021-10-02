package com.example.tobyreactiveexample.example2.sample2;

import reactor.core.publisher.Flux;

public class ReactorEx {

    public static void main(String[] args) {
        Flux.<Integer>create(s -> {
            s.next(1);
            s.next(2);
            s.next(3);
            s.complete(); })
                .log()
                .map(s -> s * 10)
                .subscribe(s -> System.out.println("test:" +s));
    }
}
