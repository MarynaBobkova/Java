import java.time.LocalTime;
import java.util.Scanner;

public class TimerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input secunds");
        int counter = scanner.nextInt();
        System.out.println("Start timer");
        timer(counter);

    }

    public static void printEachSec() {
        int counter = 10;
        while (true) {
            sleep(1000);
            System.out.println(counter--);
        }
    }

    public static void sleep(long sleepDurationInMs) {
        try {
            // ctrl + q
            // ctrl + b
            Thread.sleep(sleepDurationInMs);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void timer(int counter) {
        while (counter >= 0) {
            sleep(1000);
            System.out.println(counter--);
        }
        System.out.println("Time is out");
    }


    public int stopWatch() {
        return 0;
    }

    public String atcher(LocalTime time, String str) {
        return null;
    }
}
