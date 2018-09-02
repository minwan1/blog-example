package lamda.example5;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String args[]){
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) +1;
            return num;
        };

        int num = intSupplier.getAsInt(); //Math.random() * 6) +1
        System.out.println(num);
    }
}
