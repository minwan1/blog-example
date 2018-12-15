package thread.example7;

public class DaemonExample {

    public static void main(String args[]){
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // autoSaveThread를 데몬 스레드로 만듬
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }
        System.out.println("메인스레드 종료");

    }
}
