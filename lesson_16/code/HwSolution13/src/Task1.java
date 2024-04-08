/**
 * @author Andrej Reutow
 * created on 25.09.2023
 * Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100. Выполните сортировку полученного массива.
 * Попало ли число 0 в этот массив? (выяснить с помощью binary search)
 * Если да, то на какое место (индекс) в массиве? Если нет, то на какой индекс его следует поставить?
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201) - 100;
        }
        System.out.println("Массив до сортировки");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Массив после сортировки");
        printArray(arr);

        int target = 15;
        int index = binarySearch(arr, target);

        if (index >= 0) {
            System.out.println("Число " + target + " находится на индексе: " + index);
        } else {
            int insertionPoint = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > target || i == arr.length - 1) {
                    insertionPoint = i;
                    break;
                }
            }
            System.out.println("Число " + target + " отсутствует. Его следует поставить на индекс: " + insertionPoint);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int binarySearch(int[] source, int target) {
        int left = 0;
        int right = source.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentValue = source[mid];
            if (currentValue == target) {
                return mid;
            } else if (currentValue < target) {
                left = mid + 1;
            } else if (currentValue > target) {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void bubbleSort(int[] arr) {
        for (int indexOut = 0; indexOut < arr.length; indexOut++) {
            for (int indexIn = 0; indexIn < arr.length - 1 - indexOut; indexIn++) {

                if (arr[indexIn] > arr[indexIn + 1]) {
                    int temp = arr[indexIn];
                    arr[indexIn] = arr[indexIn + 1];
                    arr[indexIn + 1] = temp;
                }

            }
        }
    }
}

