package hw_solution_14;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */
public class Task1 {

    public static void main(String[] args) {
        int arrayLength = 10; // число N из условия задачи

        int[] array1 = new int[arrayLength]; // длина массива 10
        // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20

        sequence1(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[arrayLength]; // длина массива 10
        sequence2(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[arrayLength]; // длина массива 10
        sequence3(array3);
        System.out.println(Arrays.toString(array3));
    }

    // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
    public static void sequence1(int[] array) {
        array[0] = 2;
        for (int i = 0; i < array.length - 1; i++) {
            array[i + 1] = array[i] + 2;
        }

//        for (int i = 1; i < array.length; i++) {
//            array[i] = array[i - 1] + 2;
//        }
    }

    // последовательность 2: 0, 0, 2, 0, 4, 0, 6, 0, 8, 0
    public static void sequence2(int[] array) {
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i;
            }
        }
    }


    // последовательность 3: 0, 2, 0, 6, 0, 10, 0, 14, 0, 18
    // 1 - 2 -  1*2
    // 3 - 6 -  3*6
    // 5 - 10 - 5*2
    public static void sequence3(int[] array) {
        array[0] = 0;

//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array[i] = i * 2;
//            }
//        }

//        array[1] = 2;
//        for (int i = 2; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array[i] = array[i - 2] + 4;
//            }
//        }

        int count = 2;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = count;
                count += 4;
            }
        }


        // 0 2 0 0 0 0 0 0 0
        // 0 2 0 0 0 0 0 0 0
        // 0 2 0 6 0 0 0 0 0

        // 0 2 0 6 0 10 0 0 0

//        int i = 0; // индекс 1 элемента в массиве (индекс - номер ячейки)
//        if (i < array.length) {
//            if (i % 2 != 0) {
//                array[i] = i * 2;
//            }
//            i++;
//        }
//
//        if (i < array.length) {
//            if (i % 2 != 0) {
//                array[i] = i * 2;
//            }
//            i++;
//        }
//
//        if (i < array.length) {
//            if (i % 2 != 0) {
//                array[i] = i * 2;
//            }
//            i++;
//        }
//
//
//        if (i < array.length) {
//            if (i % 2 != 0) {
//                array[i] = i * 2;
//            }
//            i++;
//        }
    }
}
