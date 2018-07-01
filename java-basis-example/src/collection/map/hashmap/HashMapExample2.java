package collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 90);

        System.out.println("총 Entry 수: " + map.size());

        System.out.println(map.get(new Student(1, "홍길동")));
    }

    public static class Student {
        public int sno;
        public String name;

        public Student(int sno, String name){
            this.sno = sno;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Student){
                Student student = (Student) obj;
                return sno == student.sno && name.equals(student.name);
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return Objects.hash(sno, name);
        }

    }

}

