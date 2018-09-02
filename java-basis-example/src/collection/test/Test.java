package collection.test;

public class Test {

    public static void main(String[] args){

        final Member member1 = new Member("1");
        final Member member2 = member1;

        System.out.println(member1 == member2); //true
        System.out.println( member1.equals(member2)); //true
    }

    public static class Member{

        private String id;

        public Member(String id) {
            this.id = id;
        }
    }

}
