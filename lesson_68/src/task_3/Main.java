package task_3;

public class Main {

    public static void main(String[] args) {

        // CountDownLatch
        // Синхронизировать потоки так,
        // чтобы несмотря на их разную скорость,
        // все пассажиры вылетали одновременно на одном самолёте

        new Passenger("Иван");
        new Passenger("Пётр");
        new Passenger("Сидор");
        new Passenger("Поликарп");
        new Passenger("Ефистафий");
    }
}