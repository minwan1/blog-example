package com.example.tobyreactiveexample.example1.sample2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class PubSub {

    public static void main(String[] args){
        // publisher <- Observable
        // subscriber <- observer

        List<Integer> iter = Arrays.asList(1, 2, 3, 4, 5);

        Publisher p = new Publisher<>() {
            @Override
            public void subscribe(Subscriber subscriber) {

                Iterator<Integer> it = iter.iterator();

                subscriber.onSubscribe(new Flow.Subscription() {

                    @Override
                    public void request(long n) {

                        try {
                            while (n-- > 0) {
                                if (it.hasNext()) {
                                    subscriber.onNext(it.next());
                                } else {
                                    subscriber.onComplete();
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            subscriber.onError(e);
                        }
                    }

                    @Override
                    public void cancel() {

                    }
                });
            }
        };

        Subscriber<Integer> subscriber = new Subscriber<Integer>(){

            Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) { // 반드시 호출되는 메소드
                System.out.println("onSubscription");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("onNext " + item);
                this.subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        p.subscribe(subscriber);

    }
}
