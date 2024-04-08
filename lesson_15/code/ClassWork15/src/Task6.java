import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */
// Задача 6: Объединение двух массивов
public class Task6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        // Полное объединение
        int[] fullMerge = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, fullMerge, 0, arr1.length);
        System.arraycopy(arr2, 0, fullMerge, arr1.length, arr2.length);

        // Вывод полного объединения
        System.out.print("Полное объединение: ");
        for (int num : fullMerge) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Объединение без дубликатов
        int[] tempMerge = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            if (!contains(tempMerge, index, num)) {
                tempMerge[index++] = num;
            }
        }

        for (int num : arr2) {
            if (!contains(tempMerge, index, num)) {
                tempMerge[index++] = num;
            }
        }

        int[] uniqueMerge = Arrays.copyOf(tempMerge, index);

        // Вывод объединения без дубликатов
        System.out.print("Объединение без дубликатов: ");
        for (int num : uniqueMerge) {
            System.out.print(num + " ");
        }
    }

    private static boolean contains(int[] arr, int length, int target) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
