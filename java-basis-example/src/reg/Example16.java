package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example16 {

    public static void main(String args[]) {
        final String case1 = "AA ABA ABBBBA ABBCBA";
        final Pattern pattern1 = Pattern.compile("AB*A");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //AA,ABA,ABBBBA
            }
            result1 = matcher1.find();
        }

        final String case2 = "AA ABA ABBBBA ABBCBA";
        final Pattern pattern2 = Pattern.compile("AB{0,}A");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group()); //AA, ABA, ABBBBA
            }
            result2 = matcher2.find();
        }

        final String case3 = "AA ABA ABBBBA ABBCBA";
        final Pattern pattern3 = Pattern.compile("AB+A");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();

        while (result3) {
            if (result3) { // true
                System.out.println("Case 3");
                System.out.println(matcher3.group()); //ABA, ABBBBA
            }
            result3 = matcher3.find();
        }


        final String case4 = "AA ABA ABBBBA ABBCBA";
        final Pattern pattern4 = Pattern.compile("AB{1,}A");
        final Matcher matcher4 = pattern4.matcher(case4);
        boolean result4 = matcher4.find();

        while (result4) {
            if (result4) { // true
                System.out.println("Case 4");
                System.out.println(matcher4.group()); //ABA, ABBBBA
            }
            result4 = matcher4.find();
        }

        final String case5 = "AA ABA ABBBBA ABBCBA";
        final Pattern pattern5 = Pattern.compile("AB?A");
        final Matcher matcher5 = pattern5.matcher(case5);
        boolean result5 = matcher5.find();

        while (result5) {
            if (result5) { // true
                System.out.println("Case 5");
                System.out.println(matcher5.group()); //AA,ABA
            }
            result5 = matcher5.find();
        }

        final String case6 = "AA ABA ABBBBA ABBCBA";
        final Pattern pattern6 = Pattern.compile("AB{0,1}A");
        final Matcher matcher6 = pattern6.matcher(case6);
        boolean result6 = matcher6.find();

        while (result6) {
            if (result6) { // true
                System.out.println("Case 6");
                System.out.println(matcher6.group()); //AA,ABA
            }
            result6 = matcher6.find();
        }


    }
}







