package collection.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

    public static void main(String[] args) {
        final List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
        for(String name : list1){
            System.out.println(name);
        }

        final List<Integer> list2 = Arrays.asList(1, 2, 3);
        for(int value : list2){
            System.out.println(value);
        }
    }
}

