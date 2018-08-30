package lamda.example3;

public class UsingLocalVariable {
    void method(int arg){ //final 특성을 가짐
        int localVar = 40; //final 특성을 가짐

        //arg = 31;// final 특성때문에 수정 불가
        //localVar = 41; // final 특성때문에 수정 불가

        //람다식
        MyFunctionalInterface fi = () ->{
            //로컬 변수 읽기
            System.out.println("arg : " + arg); //20
            System.out.println("localVar : " + localVar + "\n"); //40
        };
        fi.method();
    }
}
