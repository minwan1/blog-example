package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example9 {

    public static void main(String args[]) {
        final String case1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789";
        final Pattern pattern1 = Pattern.compile("[^CDghi45]");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //A,B,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,,a,b,c,d,e,f,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,0,1,2,3,6,7,8,9
            }
            result1 = matcher1.find();
        }

        final String case2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789";
        final Pattern pattern2 = Pattern.compile("[^W-Z]");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group());//A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z, ,0,1,2,3,4,5,6,7,8,9
            }
            result2 = matcher2.find();
        }

    }
}





