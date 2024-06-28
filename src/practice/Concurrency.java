package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Concurrency {
    public static void main(String[] args) {
        Runnable r = getRunnable();
        Callable c = getCallable();
        doRunnable(r);
        doCallable(c);
    }

    private static Callable<String> getCallable() {
        Callable<String> callableTask = () -> {
            System.out.println("Callable Thread Name:" + Thread.currentThread().getName());
            return "Task's execution";
        };
        return callableTask;
    }

    private static Runnable getRunnable() {
        Runnable runnableTask = () -> {
            try {
                System.out.println("Thread Name:" + Thread.currentThread().getName());
            } catch (Throwable e) {
                e.printStackTrace();
            }
        };
        return runnableTask;
    }

    private static void doCallable(Callable<String> c) {
        ExecutorService executorService =
                new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>());
        List<Callable<String>> callableTasks = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            callableTasks.add(c);
        try {
            List<Future<String>> futures = executorService.invokeAll(callableTasks);
            futures.stream().forEach(i -> {
                try {
                    System.out.println("future result:" + i.get().toLowerCase());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
            executorService.shutdownNow();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void doRunnable(Runnable r) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            executor.execute(r);
        }
        executor.shutdownNow();
    }
}
