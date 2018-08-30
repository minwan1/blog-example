package collection.tree.treeset;


import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        //가장 왼쪽에 있는 객체
        score = scores.first();
        System.out.println("가장 낮은 점수: " + score); //가장 낮은 점수: 75

        score = scores.last();
        System.out.println("가장 높은 점수: " + score); //가장 높은 점수: 98

        score = scores.lower(95);
        System.out.println("95미만이면서 95와 가까운 값: " + score); //95미만이면서 95와 가까운 값: 87

        score = scores.higher(95);
        System.out.println("92초과이면서 95와 가까운 값: " + score); //92초과이면서 95와 가까운 값: 98

        // 92가 없을 경우 92 바로 아래에 있는 값을 리턴한다.
        score = scores.floor(new Integer(92));
        System.out.println("95이하이면서 95와 가까운 값: " + score); //95이하이면서 95와 가까운 값: 87

        // 85이거나 바로 위의 점수
        score = scores.ceiling(new Integer(85));
        System.out.println("85이상이면서 85와 가까운 값: " + score); //85이상이면서 85와 가까운 값: 87

        while(!scores.isEmpty()){
            // 첫 번째 노드부터 빼서(트리셋에서 제거) score 변수에 저장한다.
            score = scores.pollFirst();
            System.out.println(score +"(남은 객체 수: " + scores.size() + ")");
//            75(남은 객체 수: 4)
//            80(남은 객체 수: 3)
//            87(남은 객체 수: 2)
//            95(남은 객체 수: 1)
//            98(남은 객체 수: 0)
        }



    }
}

