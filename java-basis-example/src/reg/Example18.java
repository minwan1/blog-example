package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example18 {

    public static void main(String args[]) {
        final String case1 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern1 = Pattern.compile("r.*");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //ring to bring them all and in the darkness bind them
            }
            result1 = matcher1.find();
        }


        final String case2 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern2 = Pattern.compile("r.*?");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group()); //r,r,r
            }
            result2 = matcher2.find();
        }

        final String case3 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern3 = Pattern.compile("r.+");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();

        while (result3) {
            if (result3) { // true
                System.out.println("Case 3");
                System.out.println(matcher3.group()); //ring to bring them all and in the darkness bind them
            }
            result3 = matcher3.find();
        }


        final String case4 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern4 = Pattern.compile("r.?+");
        final Matcher matcher4 = pattern4.matcher(case4);
        boolean result4 = matcher4.find();

        while (result4) {
            if (result4) { // true
                System.out.println("Case 4");
                System.out.println(matcher4.group()); //ri,ri,rk
            }
            result4 = matcher4.find();
        }

        final String case5 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern5 = Pattern.compile("r.?");
        final Matcher matcher5 = pattern5.matcher(case5);
        boolean result5 = matcher5.find();

        while (result5) {
            if (result5) { // true
                System.out.println("Case 5");
                System.out.println(matcher5.group()); //ri,ri,rk
            }
            result5 = matcher5.find();
        }

        final String case6 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern6 = Pattern.compile("r.??");
        final Matcher matcher6 = pattern6.matcher(case6);
        boolean result6 = matcher6.find();

        while (result6) {
            if (result6) { // true
                System.out.println("Case 6");
                System.out.println(matcher6.group()); //ri,ri,rk
            }
            result6 = matcher6.find();
        }

    }
}







