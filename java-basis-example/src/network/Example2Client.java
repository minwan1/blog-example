package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Example2Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");
        }catch (Exception e){

            if(!socket.isClosed()){
                socket.close();
            }
        }
    }
}
