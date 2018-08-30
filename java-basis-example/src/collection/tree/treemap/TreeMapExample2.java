package collection.tree.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

    //맵 정렬
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(98), "이동수");
        scores.put(new Integer(75), "박길순");
        scores.put(new Integer(95), "신용권");
        scores.put(new Integer(80), "김자바");

        final NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        final Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();

        for(Map.Entry<Integer, String> entry : descendingEntrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue() + " ");
//            98-이동수
//            95-신용권
//            87-홍길동
//            80-김자바
//            75-박길순
        }
        System.out.println();

        final NavigableMap<Integer, String> asendingMap = descendingMap.descendingMap(); //내림차순
        final Set<Map.Entry<Integer, String>> asendingEntrySet = asendingMap.entrySet(); // 한번더호출하면 오름차순됨

        for(Map.Entry<Integer, String> entry : asendingEntrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue() + " ");
//            75-박길순
//            80-김자바
//            87-홍길동
//            95-신용권
//            98-이동수
        }
        System.out.println();
    }

}

