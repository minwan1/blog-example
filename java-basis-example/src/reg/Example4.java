package reg;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//특수 문자 예를들어 위의 $같이 이런것에 정규 표현식을 정욕하려면 \를 적용해야한다.

public class Example4 {

    public static void main(String args[]){
        final String case1 = "$12$ \\-\\ $25$";
        final Pattern pattern1 = Pattern.compile("^$");
        final Matcher matcher1 = pattern1.matcher(case1);
        final boolean result1 = matcher1.find();

        if(result1){ // false
            System.out.println(matcher1.group());
        }

        final String case2 = "$12$ \\-\\ $25$";
        final Pattern pattern2 = Pattern.compile("\\$");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while(result2)
        if(result2){ // true
            System.out.println(matcher2.group()); //$ $ $ $
            result2 = matcher2.find();
        }

        final String case3 = "$12$ \\-\\ $25$";
        final Pattern pattern3 = Pattern.compile("^\\$");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();
        if(result3){
            System.out.println(matcher3.group()); //$
        }

        final String case4 = "$12$ \\-\\ $25$";
        final Pattern pattern4 = Pattern.compile("\\$$");
        final Matcher matcher4 = pattern4.matcher(case4);
        boolean result4 = matcher4.find();
        if(result4){
            System.out.println(matcher4.group()); //$
        }

    }
}
