package reg;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//.은 어떤 문자이든 정규 표현식에 해당 된다.

public class Example5 {

    public static void main(String args[]) {
        final String case1 = "Regular expressions are powerful!!!";
        final Pattern pattern1 = Pattern.compile(".");
        final Matcher matcher1 = pattern1.matcher(case1);
        final boolean result1 = matcher1.find();

        if (result1) { // true
            System.out.println(matcher1.group());//R
        }

        final String case2 = "Regular expressions are powerful!!!";
        final Pattern pattern2 = Pattern.compile("......");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println(matcher2.group()); //Regula, r expr, ession, s are , powerf
                result2 = matcher2.find();
            }
        }

    }
}
