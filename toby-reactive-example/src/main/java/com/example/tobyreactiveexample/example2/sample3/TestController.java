package com.example.tobyreactiveexample.example2.sample3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Flow;

@RestController
public class TestController {


    @RequestMapping("/hello")
    public Flow.Publisher hello(String name){
        return new Flow.Publisher() {
            @Override
            public void subscribe(Flow.Subscriber subscriber) {
                subscriber.onSubscribe(new Flow.Subscription() {
                    @Override
                    public void request(long n) {
                        subscriber.onNext("Hello " + name);
                        subscriber.onComplete();
                    }

                    @Override
                    public void cancel() {

                    }
                });
            }
        };
    }
}
