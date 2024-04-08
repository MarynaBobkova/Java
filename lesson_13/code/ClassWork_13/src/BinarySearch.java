public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Вычисляем середину
            if (arr[mid] == target) {
                return mid; // Элемент найден
            }
            if (arr[mid] < target) {
                left = mid + 1; // Сужаем область поиска справа
            } else {
                right = mid - 1; // Сужаем область поиска слева
            }
        }
        return -1; // Элемент не найден
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;

        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден на позиции: " + result);
        }
    }
}
