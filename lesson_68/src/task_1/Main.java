package task_1;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);

        new Car("Хонда", semaphore);
        new Car("Ауди", semaphore);
        new Car("Тойота", semaphore);
        new Car("БМВ", semaphore);
    }
}