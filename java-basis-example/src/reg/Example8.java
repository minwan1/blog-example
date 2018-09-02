package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example8 {

    public static void main(String args[]) {
        final String case1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789";
        final Pattern pattern1 = Pattern.compile("[a-d]");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        printResult(matcher1, result1, "Case1 : "); //a, b, c, d


        final String case2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789";
        final Pattern pattern2 = Pattern.compile("[2-6]");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        printResult(matcher2, result2, "Case2 : "); //2, 3, 4, 5, 6

        final String case3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789";
        final Pattern pattern3 = Pattern.compile("[C-Ka-d2-6]");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();


        printResult(matcher3, result3, "Case3 : "); // C, D, E, F, G, H, I, J, K, a, b, c, d, 2, 3, 4, 5, 6

    }

    private static void printResult(Matcher matcher, boolean result, String exampleOrder) {
        while (result) {
            if (result) { // true
                System.out.println(exampleOrder);
                System.out.println(matcher.group());
            }
            result = matcher.find();
        }
    }
}
