package task_1;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // Отдать исполнителю задачу, вычисляющую 2 + 3.
        // Создать объект Future, в которой в итоге должен быть размещён результат.
        // Получить решение из объекта Future и вывести его в консоль.
        // Продемонстрировать ожидание результата с таймаутом.

       // Runnable runnable = () -> {
    //        System.out.println("Эта строка отработала в др потоке");
      //      System.out.println("Эта строка отработала в др потоке");
       //     System.out.println("Эта строка отработала в др потоке");
      //  };
     //   new Thread(runnable).start();

        Callable<Integer> task = () -> {
            int x = 2;
            int y = 3;
            Thread.sleep(10_000);
            int result = x +y;
            return result;
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("Главный поток передал задачу на выполнение");
        Future<Integer> box = service.submit(task);

        System.out.println("Главный поток занимается своими делами 5 сек");
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            // System.out.println("Главный поток ожидает результата");
            System.out.println("Главный поток ожидает результата 3 сек");
            int result = box.get(3, TimeUnit.SECONDS);
            System.out.println("Полученный результат - " + result);
        } catch (Exception e) {
            System.out.println("Получение решения при данных условиях не возможно");;
        }
        service.shutdown();
    }
}
