package lamda.example2;

public class UsingThisExample {

    public static void main(String args[]){
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner Inner = usingThis.new Inner();
        Inner.method();
    }
}
