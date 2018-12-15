package thread.example9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[작업 처리 요청]");
        Callable<Integer> task = () -> {
            int sum = 0;
            for(int i = 1; i <= 10; i++){
                sum += i;
            }
            return sum;
        };

        Future<Integer> future = executorService.submit(task);

        try {
            int sum = future.get();
            System.out.println("[처리 결과]" + sum);
            System.out.println("[작업 처리 완료]");
        }catch (Exception e){
            System.out.println("[실행 예외 발생함] " + e.getMessage());
        }
        executorService.shutdown();
    }
}
