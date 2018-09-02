package thread.example3;

public class TargetThread extends Thread{

    public void run(){
        for(long i=0; i<1000000000; i++){
        }
        try{
            Thread.sleep(1500); // 해당 쓰레드 TIME_WAITING 상태로 변경
        }catch (Exception e){
            new RuntimeException(e);
        }
        for(long i=0; i<1000000000; i++){
        }
    }
}
