package task_3;

import java.util.Random;

public class Passenger extends Thread {

    public Passenger(String name) {
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            Random random = new Random();
            int millis = random.nextInt(9000) + 1000;
            Thread.sleep(millis);
            System.out.printf("%s вошёл в аэропорт.%n", getName());
            Thread.sleep(millis);
            System.out.printf("%s сдал багаж и зарегистрировался.%n", getName());
            Thread.sleep(millis);
            System.out.printf("%s прошёл паспортный контроль.%n", getName());
            Thread.sleep(millis);
            System.out.printf("%s совершает посадку в самолёт.%n", getName());
            Thread.sleep(millis);

            System.out.printf("%s вылетел, время вылета - %d.%n",
                    getName(), (System.currentTimeMillis() - start) / 1000);

        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}