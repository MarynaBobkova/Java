/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */

/*
### Задача
Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
 */
public class Hw09Task1 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Task" + counter);
            counter += 1;
        }
    }
}
