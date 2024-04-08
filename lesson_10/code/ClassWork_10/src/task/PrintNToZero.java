package task;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Вывести числа от n до 0
 */
public class PrintNToZero {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

