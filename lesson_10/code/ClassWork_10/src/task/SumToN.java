package task;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Суммирование всех чисел от 1 до введенного пользователем числа
 */

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сумма всех чисел от 1 до " + n + " равна " + sum);
    }
}

