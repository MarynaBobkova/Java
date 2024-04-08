/*
* Найти элемент N в массиве из сгенерированных чисел и заменить его на минимальный элемент в массиве.
* Если n не найден в массиве вывести сообщение, что элемент не найден!
 пример: дано: {10,4,2,3, 1}, n = 2;. Результат: {10,4,1,3, 1}*/

public class Task2 {
    public static void main(String[] args) {
        System.out.println("#2");
        int elemN = 25; // Сюда подставить любое число...(лень использовать Scanner)
        int[] arr = new int[10];
        //int[] arr1 = {15, 11, 22, 23, 58, 10, 47, 65, 98, 78};
        fillArray(arr, 10, 99);
        System.out.println("Исходный массив - ");
        printArray(arr);
        System.out.println("N элемент - " + elemN);
        //minIndex(arr);
        int nRes = nIndex(arr, elemN);
        int minEl = minIndex(arr);
        System.out.println("Минимальный элемент - " + minEl);
        if(nRes != -1) {
            exchange( minEl, nRes, arr);
            printArrayResult(arr);
        } else {
            System.out.println("Бро...такого элемента в массиве НЭТУ!!!");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void printArrayResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static int minIndex(int[] arr) {
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                //mIndex = i;
            }
        }
        return min;
    }

    public static int nIndex(int[] arr, int n) {
        int nIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if( n == arr[i]) {
                nIndex = i;
            }
        }
        return nIndex;
    }

    public static int exchange( int min, int nInd, int[] arr) {
        if(nInd != -1) {
            arr[nInd] = min;
            return 0;
        } else {
            return -1;
        }
    }

}