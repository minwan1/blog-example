package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example12 {

    public static void main(String args[]) {
        final String case1 = "-@- *** -- \"*\" -- *** -@-";
        final Pattern pattern1 = Pattern.compile(".*.");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //-@- *** -- "*" -- *** -@-
            }
            result1 = matcher1.find();
        }

        final String case2 = "-@- *** -- \"*\" -- *** -@-";
        final Pattern pattern2 = Pattern.compile("-A*-");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group()); //--,--
            }
            result2 = matcher2.find();
        }

    }
}





