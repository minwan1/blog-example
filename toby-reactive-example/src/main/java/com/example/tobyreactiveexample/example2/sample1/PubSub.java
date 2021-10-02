package com.example.tobyreactiveexample.example2.sample1;

import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PubSub {

    public static void main(String[] args) {
        Publisher<Integer> publisher = iterPub(Stream.iterate(1, a -> a + 1).limit(10).collect(Collectors.toList()));

//        Publisher<String> mapPub = mapPub(publisher, (Function<Integer, String>) s -> "[" + s + "]");
//        Publisher<Integer> sumPub = sumPub(publisher);
        Publisher<StringBuilder> reducePub = reducePub(publisher, new StringBuilder(),
                (a, b) -> a.append(b).append(","));
        reducePub.subscribe(logSub());
    }

    private static <T,R> Publisher<R> reducePub(Publisher<T> publisher, R init, BiFunction<R, T, R> biFunction) {

        return new Publisher<R>() {
            @Override
            public void subscribe(Subscriber<? super R> subscriber) {

                publisher.subscribe(new DelegateSub<T, R>(subscriber){
                    R result = init;

                    @Override
                    public void onNext(T item) {
                        result = biFunction.apply(result, item);
                    }

                    @Override
                    public void onComplete() {
                        subscriber.onNext(result);
                        subscriber.onComplete();
                    }
                });
            }
        };
    }

    private static <T, R> Publisher<R> mapPub(Publisher<T> publisher, Function<T, R> integerFunction) {

        return new Publisher<R>() {
            @Override
            public void subscribe(Subscriber<? super R> subscriber) {
                publisher.subscribe(new DelegateSub<T, R>(subscriber) {
                    @Override
                    public void onNext(T item) {
                        subscriber.onNext(integerFunction.apply(item));
                    }
                });
            }
        };
    }

//    private static Publisher<Integer> sumPub(Publisher<Integer> publisher) {
//        return new Publisher<Integer>() {
//            @Override
//            public void subscribe(Subscriber<? super Integer> subscriber) {
//                publisher.subscribe(new DelegateSub(subscriber) {
//                    int sum = 0;
//
//                    @Override
//                    public void onNext(Integer item) {
//                        sum += item;
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        subscriber.onNext(sum);
//                        subscriber.onComplete();
//                    }
//                });
//            }
//        };
//    }

    private static <T> Subscriber<T> logSub() {
        return new Subscriber<T>() {

            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("onSubscribe: ");
                subscription.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(T item) {
                System.out.println("onNext: " + item);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError: " + throwable);

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete: ");

            }
        };
    }

    private static Publisher<Integer> iterPub(List<Integer> iter) {
        return new Publisher<>() {

            @Override
            public void subscribe(Subscriber<? super Integer> subscriber) {

                subscriber.onSubscribe(
                        new Subscription() {
                            public void request(long n) {

                                try {
                                    iter.forEach(s -> subscriber.onNext(s));
                                    subscriber.onComplete();
                                } catch (Throwable e) {
                                    subscriber.onError(e);
                                }
                            }

                            public void cancel() {

                            }
                        }
                );
            }

        };
    }
}
