/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */
// Задача 5: Сдвиг элементов массива
public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        // Вывод исходного массива
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }
        System.out.println();

        // Сдвиг массива
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        // Вывод сдвинутого массива
        System.out.print("Сдвинутый массив: ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }
    }
}

