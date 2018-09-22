package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example15 {

    public static void main(String args[]) {
        final String case1 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern1 = Pattern.compile(".{5}");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //One r, ing t,o bri,ng th,em al,l and, in t,he da,rknes,s bin,d the
            }
            result1 = matcher1.find();
        }

        final String case2 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern2 = Pattern.compile("[els]{1,3}");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group()); //e,e,ll,e,ess,e
            }
            result2 = matcher2.find();
        }

        final String case3 = "One ring to bring them all and in the darkness bind them";
        final Pattern pattern3 = Pattern.compile("[a-z]{3,}");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();

        while (result3) {
            if (result3) { // true
                System.out.println("Cas2e 3");
                System.out.println(matcher3.group()); //ring,bring,them,all,and,the,darkness,bind,them
            }
            result3 = matcher3.find();
        }

    }
}







