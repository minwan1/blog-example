package collection.tree.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

    public static void main(String[] args) {
        //저장될때 자동으로 값이 정렬되서 저장된다.
        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(98), "이동수");
        scores.put(new Integer(75), "박길순");
        scores.put(new Integer(95), "신용권");
        scores.put(new Integer(80), "김자바");

        Map.Entry<Integer,String> entry = null;

        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue()); //가장 낮은 점수: 75-박길순

        entry = scores.lastEntry();
        System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n"); //가장 높은 점수: 98-이동수

        // 자동 박싱이 되기에 95를 줘도 된다.
        entry = scores.lowerEntry(95);
        System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue()); //95점 아래 점수: 87-홍길동

        entry = scores.higherEntry(95);
        System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n"); //95점 위의 점수: 98-이동수

        entry = scores.floorEntry(96);
        System.out.println("96점이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue() ); //96점이거나 바로 아래 점수: 95-신용권

        entry = scores.ceilingEntry(96);
        System.out.println("96점이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n"); //96점이거나 바로 위의 점수: 98-이동수

        while(!scores.isEmpty()){
            //맨 앞에있는 Entry를 가져옴(제거)
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-" + entry.getValue() + " / 남은 객체수 : " + scores.size());
//            75-박길순 / 남은 객체수 : 4
//            80-김자바 / 남은 객체수 : 3
//            87-홍길동 / 남은 객체수 : 2
//            95-신용권 / 남은 객체수 : 1
//            98-이동수 / 남은 객체수 : 0
        }
    }
}


