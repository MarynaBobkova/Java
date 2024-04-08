package hw13;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 * <p>
 * Напишите программу, которая сначала сортирует массив целых чисел по возрастанию, а затем по убыванию, используя сортировку пузырьком.
 * <p>
 * Пример:
 * <p>
 * Вход: Массив [10, 3, 15, 7, 8, 5, 11, 2].
 * <p>
 * Выход: Два отсортированных массива: [2, 3, 5, 7, 8, 10, 11, 15] и [15, 11, 10, 8, 7, 5, 3, 2].
 */
public class Task3 {

    public static void main(String[] args) {
        int[] arr = {10, 3, 15, 7, 8, 5, 11, 2};

        // Сортировка по возрастанию.
        bubbleSortAscending(arr);
        System.out.print("Отсортированный массив по возрастанию: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Сортировка по убыванию.
        bubbleSortDescending(arr);
        System.out.print("Отсортированный массив по убыванию: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Метод для сортировки массива по возрастанию сортировкой пузырьком.
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Метод для сортировки массива по убыванию сортировкой пузырьком.
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

