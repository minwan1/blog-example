package thread.example3;

public class StatePrintThread extends Thread{
    private Thread targetThread;

    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    public void run(){
        while (true){
            Thread.State state = targetThread.getState();
            System.out.println("타겟 스레드 상태: " + state);

            if(state == State.NEW){ // 처음에 new로시작
                targetThread.start(); // 실행 대기 상태로 변경
            }

            if(state == State.TERMINATED){
                break;
            }
            try{
                //0.1초간 일시 정지
                Thread.sleep(100);
            }catch (Exception e){
                new RuntimeException(e);
            }
        }
    }
}
