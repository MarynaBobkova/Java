package hw13;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 * Условие: Напишите программу на Java, которая использует бинарный поиск для нахождения индекса первого вхождения числа в отсортированном массиве с повторяющимися элементами.
 * <p>
 * Пример:
 * <p>
 * Вход: Отсортированный массив [1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19] и число 3. Выход: Индекс первого вхождения числа 3 в массиве.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19};
        int target = 3;
        int firstIndex = binnarySearch(arr, target);

        if (firstIndex != -1) {
            System.out.println("Индекс первого вхождения числа " + target + " в массиве: " + firstIndex);
        } else {
            System.out.println("Число " + target + " не найдено в массиве.");
        }
    }

    public static int binnarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Двигаемся влево для поиска первого вхождения.
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
