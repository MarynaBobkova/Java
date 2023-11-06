package arrays_copy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Обратный массив: Напишите программу, которая создает новый массив, содержащий элементы исходного массива
// в обратном порядке, используя System.arraycopy()
        int[] array = {1, 4, -2, 7, 2, -5};
        //  новый массив для хранения элементов в обратном порядке
        int[] copyArray = new int[array.length];
        // Копируем элементы  в обратном порядке
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array, i, copyArray, copyArray.length-i-1, 1);
        }
        System.out.println("Массив в обратном порядке: " + Arrays.toString(copyArray));


        //Слияние массивов: Напишите метод, который принимает два массива целых чисел и возвращает новый массив,
       // который является результатом их слияния. Используйте System.arraycopy().
        int[] array1 = {1, 4, -2, 7, 2, -5};
        int[] array2 = {1, 4, -2, 7};
        int[] arraysMerge = new int[array1.length + array2.length];
        System.arraycopy(array1,0, arraysMerge,0, array1.length);
        System.arraycopy(array2,0, arraysMerge,array1.length, array2.length);
        System.out.println("Слияние массивов: " + Arrays.toString(arraysMerge));


        //Удаление дубликатов: Напишите программу, которая удаляет все дубликаты из отсортированного массива.
       // Снова используйте System.arraycopy() для сдвига элементов
        int[] arrayDuplicate = {6, 1, 3, 1, 2, 5, 6, 6, 6, 9, 18};
        System.out.println("Массив до удаления дубликатов: " + Arrays.toString(arrayDuplicate));
        Arrays.sort(arrayDuplicate);
        int counterDuplicate = 0;
        for (int i = arrayDuplicate.length-1; i > 0; i--) {
            if(arrayDuplicate[i] == arrayDuplicate[i-1]) {
                counterDuplicate++;
                System.arraycopy(arrayDuplicate, i, arrayDuplicate, i-1, arrayDuplicate.length - i);
            }
        }
        int[] uniqueArray = new int [arrayDuplicate.length - counterDuplicate];
        System.arraycopy(arrayDuplicate, 0, uniqueArray, 0, uniqueArray.length);
        System.out.println("Массив после удаления дубликатов: " + Arrays.toString(uniqueArray));

    }
}
