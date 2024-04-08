package hw;

/**
 * Задача 3(*): Проверка на високосный год
 * Задача: Написать программу, определяющую, является ли год високосным.
 * Для того чтобы год был високосным, он должен:
 * - делиться без остатка на 4 и, либо не должен делиться без остатка на 100,
 * - либо если он делится на 100, то он должен делиться также на 400.
 * Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.
 */
public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2000;

        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    // Метод для определения, является ли год високосным
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
