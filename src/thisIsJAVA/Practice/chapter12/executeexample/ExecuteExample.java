package thisIsJAVA.Practice.chapter12.executeexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0 ; i < 10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String thraedName = Thread.currentThread().getName();
                    System.out.println("[총 쓰레드 개수 : " + poolSize + "] [작업 쓰레드 이름 : " +  thraedName + "]" );

                    int value = Integer.parseInt("삼");
                }
            };

            //executorService.execute(runnable);
            executorService.submit(runnable);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
