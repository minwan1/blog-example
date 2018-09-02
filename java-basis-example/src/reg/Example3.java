package reg;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ^는 시작하는 문자열에 대해서 매치를 해준다.
// $는 끝나는 문자열에 대해서 매치를 해준다.
//Case 1
//        Regular Expression:	^who
//        matches:	who is who
//        Case 2
//        Regular Expression:	who$
//        matches:	who is who

public class Example3 {

    public static void main(String args[]){
        final String case1 = "who is who";
        final Pattern pattern1 = Pattern.compile("^who");
        final Matcher matcher1 = pattern1.matcher(case1);
        final boolean result1 = matcher1.find();
        if(result1){ // ture
            System.out.println(matcher1.group()); //who
        }

        final String case2 = "who is who";
        final Pattern pattern2 = Pattern.compile("who$");
        final Matcher matcher2 = pattern2.matcher(case2);
        final boolean result2 = matcher2.find();
        if(result2){ // true
            System.out.println(matcher2.group()); //who
        }

    }
}
