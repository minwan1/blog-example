package thread.example8;

import java.util.concurrent.*;

public class ExecuteExample {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
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
            final Future<?> submit = executorService.submit(runnable);
            System.out.println(submit.get());
        }

        executorService.shutdown();
// 실행값 :
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-1
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-2
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-1
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-2
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-1
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-2
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-1
//                [총 스레드 개수 : 2] 작업 스레드 이름 pool-1-thread-2
    }
}
