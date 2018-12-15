package thread.example8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String args[]){
        ExecutorService executorService = Executors.newFixedThreadPool(2); // 스레드 최대 생성 개수

        for(int i = 0; i < 10; i++){
            Runnable runnable = () -> {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                int poolSize = threadPoolExecutor.getPoolSize();
                String threadName = Thread.currentThread().getName();
                System.out.println("[총 스레드 개수 : " + poolSize + "] 작업 스레드 이름 " +threadName);
                Integer.parseInt("삼");
            };

//            executorService.execute(runnable);
            executorService.submit(runnable);
        }

        executorService.shutdown();;
    }
}
