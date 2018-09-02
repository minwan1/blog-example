package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

    public static void main(String args[]) {
        final String case1 = "How do you do?";
        final Pattern pattern1 = Pattern.compile("[oyu]");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case1 : ");
                System.out.println(matcher1.group());//o,o,y,o,u,o,
            }
            result1 = matcher1.find();
        }

        final String case2 = "How do you do?";
        final Pattern pattern2 = Pattern.compile("[dH].");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            System.out.println("Case2 : ");
            if (result2) { // true
                System.out.println(matcher2.group());//Ho, do, do
            }
            result2 = matcher2.find();
        }

        final String case3 = "How do you do?";
        final Pattern pattern3 = Pattern.compile("[owy][yow]");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();

        while (result3) {
            System.out.println("Case3 : ");
            if (result3) { // true
                System.out.println(matcher3.group());//ow, yo
            }
            result3 = matcher3.find();
        }
    }
}
