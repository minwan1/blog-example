package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example1 {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("내컴퓨터 IP : " + local.getHostAddress());

        InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
        for(InetAddress remote : iaArr){
            System.out.println("www.naver.com IP 주소:" +remote.getHostAddress());
        }
    }
}
