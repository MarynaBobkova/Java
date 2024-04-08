//Дан массив чисел, найдите все четные числа в массиве
//и запишите эти числа в другой массив. Отсортируйте только **второй ** массив и распечатайте оба массива.

public class Task4 {
    public static void main(String[] args) {
        System.out.println("#4");
        int[] arr = {15, 11, 22, 23, 58, 10, 47, 65, 98, 78};
        printArray(arr);
        newArr(arr);
    }

    public static void newArr(int[] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                newArr[i] = arr[i];
            }
        }
        bubleShortUp(newArr);
        printArray(newArr);
    }
    public static void bubleShortUp(int[] arr) {
        int storage = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    storage = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = storage;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
