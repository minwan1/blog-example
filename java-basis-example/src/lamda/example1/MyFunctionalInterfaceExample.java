package lamda.example1;

import lamda.example1.MyFunctionalInterface;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args){
        MyFunctionalInterface fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5)); //7

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(2, 5)); //7

        //return 문만 있으면 {}, return 생략가능
        fi = (x, y) -> x + y;
        System.out.println(fi.method(2, 5)); //7

        //return 문만 있으면 {}, return 생략가능
        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2, 5)); //7

    }

    public static int sum(int x, int y){
        return (x + y);

    }
}
