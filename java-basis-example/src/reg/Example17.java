package reg;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example17 {

    public static void main(String args[]) {
        final String case1 = "A1 B2 c3 d_4 e:5 ffGG77--__--";
        final Pattern pattern1 = Pattern.compile("\\w");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //A,1,B,2,c,3,d,4,e,5,f,f,G,G,7,7,_,_
            }
            result1 = matcher1.find();
        }

        final String case2 = "A1 B2 c3 d_4 e:5 ffGG77--__--";

        final Pattern pattern2 = Pattern.compile("\\w+");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group()); //A1,B2,c3,d_4,e,5,ffGG77,__
            }
            result2 = matcher2.find();
        }


        final String case3 = "A1 B2 c3 d_4 e:5 ffGG77--__--";

        final Pattern pattern3 = Pattern.compile("[a-z]\\w*");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();

        while (result3) {
            if (result3) { // true
                System.out.println("Case 3");
                System.out.println(matcher3.group()); //c3,d_4,e,ffGG77
            }
            result3 = matcher3.find();
        }

        final String case4 = "A1 B2 c3 d_4 e:5 ffGG77--__--";

        final Pattern pattern4 = Pattern.compile("\\w{5}");
        final Matcher matcher4 = pattern4.matcher(case4);
        boolean result4 = matcher4.find();

        while (result4) {
            if (result4) { // true
                System.out.println("Case 4");
                System.out.println(matcher4.group()); //ffGG7
            }
            result4 = matcher4.find();
        }


        final Pattern pattern5 = Pattern.compile("[A-z0-9_]");
        final Matcher matcher5 = pattern5.matcher(case4);
        boolean result5 = matcher5.find();

        while (result5) {
            if (result5) { // true
                System.out.println("Case 5");
                System.out.println(matcher5.group()); //A,1,B,2,c,3,d,4,e,5,f,f,G,G,7,7,_,_
            }
            result5 = matcher5.find();
        }

    }
}










