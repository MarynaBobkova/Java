package hw;

/**
 * @author Andrej Reutow
 * created on 18.09.2023
 */

// Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
public class Hw09Task1 {

    public static void main(String[] args) {
//        System.out.println("Task" + 1); // 1 итерация
//        System.out.println("Task" + 2);
//        System.out.println("Task" + 3);
//        System.out.println("Task" + 4);
//        System.out.println("Task" + 5);
//        System.out.println("Task" + 6);
//        System.out.println("Task" + 7);
//        System.out.println("Task" + 8);
//        System.out.println("Task" + 9);
//        System.out.println("Task" + 10); // 10 итерация

        int counter = 1;
        while (counter <= 100) {
            System.out.println("Task" + counter);
//            counter = counter + 1;
            counter += 1;
        }
    }
}
