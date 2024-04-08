/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */

//Задача 1: Сравнение эффективности линейного и бинарного поиска
public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        // Линейный поиск
        int linearIterations = 0;
        for (int i = 0; i < arr.length; i++) {
            linearIterations++;
            if (arr[i] == target) {
                break;
            }
        }

        // Бинарный поиск
        int binaryIterations = 0;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            binaryIterations++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Линейный поиск: " + linearIterations + " итераций");
        System.out.println("Бинарный поиск: " + binaryIterations + " итераций");
    }
}
