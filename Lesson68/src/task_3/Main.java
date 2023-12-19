package task_3;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {

        // CountDownLatch
        // Синхронизировать потоки так,
        // чтобы несмотря на их разную скорость,
        // все пассажиры вылетали одновременно на одном самолёте

        CountDownLatch latch = new CountDownLatch(5);
        long startTime = System.currentTimeMillis();

        new Passenger("Иван", latch);
        new Passenger("Пётр", latch);
        new Passenger("Сидор", latch);
        new Passenger("Поликарп", latch);
        new Passenger("Ефистафий", latch);

        try {
            latch.await();
            System.out.println("Все пассажиры вылетели одновременно на одном самолёте");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}