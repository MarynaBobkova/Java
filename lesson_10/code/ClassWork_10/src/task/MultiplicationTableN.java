package task;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Вывести на экран таблицу умножения на n
 */
public class MultiplicationTableN {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}


