package lamda.example5;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String args[]){
        Consumer<String> consumer = t-> System.out.println(t + 8); //java8
        consumer.accept("java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u); //Java8
        biConsumer.accept("Java", "8");

        DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d); //Java8.0
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer  = (t, i) -> System.out.println(t + i); //Java8
        objIntConsumer.accept("Java", 8);

    }
}
