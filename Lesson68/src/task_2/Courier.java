package task_2;

import java.util.List;
import java.util.Random;

public class Courier extends Thread {
    private String start;
    private String destination;
    private List<Package> packages;
    private Courier anotherCourier;
    private boolean inExchangePoint;

    public Courier(String start, String destination, List<Package> packages) {
        this.start = start;
        this.destination = destination;
        this.packages = packages;
    }

    public void setAnotherCourier(Courier anotherCourier) {
        this.anotherCourier = anotherCourier;
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            int timeDelay = random.nextInt(9000) + 1000;

            Thread.sleep(timeDelay);
            System.out.printf("%s выехал из точки %s.%n", this, start);

            Thread.sleep(timeDelay);
            System.out.printf("%s доехал до пункта обмена %s.%n", this, start);

            Thread.sleep(timeDelay);
            System.out.printf("%s уехал из пункта обмена %s.%n", this, start);

            Thread.sleep(timeDelay);
            System.out.printf("%s доехал до точки выгрузки %s.%n", this, start);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return String.format("Курьер {%s -> %s}", start, destination);
    }
}
