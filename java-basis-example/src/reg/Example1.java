package reg;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//        대소문자를 구분한다.
//        Case 1
//        Regular Expression:	Hello
//        matches:	Hello, world!
//        Case 2
//        Regular Expression:	hello
//         matches:	Hello, world!

public class Example1 {

    public static void main(String args[]){
        final String case1 = "Hello, world";
        final Pattern pattern1 = Pattern.compile("Hello");
        final Matcher matcher1 = pattern1.matcher(case1);
        final boolean result1 = matcher1.find();
        if(result1){// ture
            System.out.println(matcher1.group()); //Hello
        }

        final String case2 = "Hello,    world";
        final Pattern pattern2 = Pattern.compile("hello");
        final Matcher matcher2 = pattern2.matcher(case2);
        final boolean result2 = matcher2.find();
        if(result2){ // false
            System.out.println(matcher2.group());
        }

    }
}
