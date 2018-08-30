package lamda.example2;


public class UsingThis {

    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            //람다식
            MyFunctionalInterface fi = () -> {
                //여기에서 this는 Inner클래스를 가르킴.
                System.out.println("outterField:" + outterField); //outterField:10
                //바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
                System.out.println("outterField:" + UsingThis.this.outterField + "\n"); //outterField:10

                System.out.println("innerField:" + innerField); //innerField:20
                //람다식 내부에서 this는 Inner 객체를 참조.
                System.out.println("innerField:" + this.innerField + "\n"); //innerField:20
            };
            fi.method();

        }
    }
}
