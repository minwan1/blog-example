package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체수 : " + size); //총 객체수 : 4

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
//            Java
//            JDBC
//            Servlet/JSP
//            iBATIS
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체수 : " + set.size()); // 총 객체수 : 2

        for(String element : set){
            System.out.println("\t" + element);
//            Java
//            Servlet/JSP
        }

        set.clear();
        if(set.isEmpty()){
            System.out.println("비어있음"); //비어있음
        }
    }
}

