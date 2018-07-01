package collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");

        // 기존 2번 인덱스는 3번으로 밀어내고 2번에 저장 서블릿이 밀림
        list.add(2, "Database");

        list.add("iBATIS");

        int size = list.size();
        System.out.println("총 객체수: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        list.remove("iBATIS");

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }

    }

}

