package collection.tree.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        // 내림차순으로 저장
        final NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer score : descendingSet){
            System.out.print(score + " ");
        }
        System.out.println();

        // 다시 descendingSet을 호출하면 차순이 역전된다.(참고만)
        final NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
        for(Integer score : asendingSet){
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
