package collection.tree.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String ar[]){
        TreeSet<String> treeSet =new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        //아래의 ce단어로 시작되서 g로 끝나는거 다검색
        final NavigableSet<String> nSet=treeSet.subSet("c",true,"f",true);
        for(String str:nSet){
            System.out.println(str);
        }
    }
}