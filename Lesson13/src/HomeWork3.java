import java.util.Arrays;

/* Задача* 3:
Напишите программу, которая сначала сортирует массив целых чисел по возрастанию,
 а затем по убыванию, используя сортировку пузырьком.
 Пример:
Вход: Массив [10, 3, 15, 7, 8, 5, 11, 2].
Выход: Два отсортированныe массива: [2, 3, 5, 7, 8, 10, 11, 15] и [15, 11, 10, 8, 7, 5, 3, 2].
 */
public class HomeWork3 {
    public static void main(String[] args) {
        int [] array = {10, 3, 15, 7, 8, 5, 11, 2};
        for (int indexOut = 0; indexOut < array.length; indexOut++) {
            for (int indexIn = 0; indexIn < array.length ; indexIn++) {
                if (array[indexIn] > array[indexOut]) {
                    int temp = array[indexOut];
                    array [indexOut] = array[indexIn];
                    array [indexIn] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int [] array2 = array.clone();
        int lastElementIndex = array.length - 1;
        for (int i = 0; i <= lastElementIndex; i++) {
            int reversedIndex = lastElementIndex - i;
            array2[i] = array[reversedIndex];
        }
        System.out.println(Arrays.toString(array2));
    }
}
