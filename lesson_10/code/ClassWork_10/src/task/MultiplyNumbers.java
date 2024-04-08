package task;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Умножение двух чисел с возможностью завершения программы
 */

import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();
            System.out.println("Результат умножения: " + (num1 * num2));
            System.out.println("Введите 777 для завершения или любое другое число для продолжения:");
            int exitCode = scanner.nextInt();
            if (exitCode == 777) {
                break;
            }
        }
    }
}

