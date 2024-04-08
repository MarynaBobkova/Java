package hw13;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 * <p>
 * Напишите программу, которая находит n-ное вхождение заданного числа в отсортированном массиве. Если число не найдено, программа должна вернуть -1.
 * <p>
 * Пример:
 * <p>
 * Вход: Массив [1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19] и число 3 с номером вхождения 2.
 * <p>
 * Выход: Индекс 2, поскольку второе вхождение числа 3 находится на этой позиции.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19};
        int target = 3;
        int n = 2; // Второе вхождение числа три

        int linearIndex = findNthOccurrenceLinear(arr, target, n);

        if (linearIndex != -1) {
            System.out.println("Индекс " + n + "-го вхождения числа " + target + " (линейный поиск): " + linearIndex);
        } else {
            System.out.println("Число " + target + " с " + n + "-м вхождением (линейный поиск) не найдено в массиве.");
        }
    }

    public static int findNthOccurrenceLinear(int[] arr, int target, int n) {
        int count = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }
}
