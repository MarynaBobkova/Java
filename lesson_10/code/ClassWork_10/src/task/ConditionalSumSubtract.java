package task;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Условное сложение и вычитание чисел в заданном диапазоне
 * Напишите программу, которая выполняет сложение или вычитание чисел в заданном диапазоне, в зависимости от того, является ли число четным или нечетным.
 * Пользователь должен указать начальное и конечное число диапазона. Каждое третье число в этом диапазоне должно быть пропущено и не участвовать в расчетах.
 * <p>
 * Правила:
 * Если число четное, добавьте его к итоговому результату.
 * Если число нечетное, вычтите его из итогового результата.
 * Пропустите каждое третье число в диапазоне.
 */
public class ConditionalSumSubtract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число диапазона:");
        int start = scanner.nextInt();
        System.out.println("Введите конечное число диапазона:");
        int end = scanner.nextInt();

        int result = 0;

        for (int i = start, counter = 1; i <= end; i++, counter++) {
            if (counter % 3 == 0) {
                System.out.println("Число " + i + " пропущено");
            } else if (i % 2 == 0) {
                System.out.println("прибавляем к " + result + " " + i);
                result += i;
            } else {
                System.out.println("отнимаем от " + result + " " + i);
                result -= i;
            }
            System.out.println("Итерация " + i + ", результат " + result);
            System.out.println();
        }
        System.out.println("_".repeat(70));
        System.out.println("Результат: " + result);
    }
}
