package binary_search;

import java.util.Arrays;

// Поиск медианы: Создайте отсортированный массив случайных чисел. Напишите программу,
// которая находит медиану этого массива с помощью бинарного поиска.
//
//Медианой ряда чисел (или медианой числового ряда) называется число, стоящее посередине упорядоченного
// по возрастанию ряда чисел — в случае, если количество чисел нечётное.
// Если же количество чисел в ряду чётно, то медианой ряда является полусумма двух стоящих посередине чисел упорядоченного по возрастанию ряда.
//
//Пример 1. Найти медиану числового ряда 5, 17, 3, 9, 14, 2.
//
//Решение. Записываем все числа ряда в порядке возрастания: 2, 3, 5, 9, 14, 17.
// Количество чисел в ряду чётно, поэтому медиана этого ряда будет равна полусумме двух средних чисел: (5 + 9) / 2 = 7.
//Пример 2. Найти медиану числового ряда 5, 2, 18, 8, 3.
//
//Решение. записываем все числа ряда в порядке возрастания: 2, 3, 5, 8, 18. Количество чисел в ряду нечётно,
// поэтому медиана этого ряда будет равна стоящему посередине числу, то есть равна 5.
public class RandomNumbers {
    public static void main(String[] args) {
        int[] array = new int[6];
        System.out.println("Рандомный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.print("\t" + array[i]);
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        System.out.print(Arrays.toString(array));
        System.out.println();

        if (array.length % 2 == 0) {
            int mediana1Index= array.length/2;
            int mediana1 = array[mediana1Index];

            int mediana2Index = mediana1Index-1;
            int mediana2 = array[mediana2Index];

            double mediana = (mediana1 + mediana2) / 2.0;

            System.out.println("Медиана:" + mediana);
        } else {
            System.out.println("Медиана:" + array[array.length / 2]);
        }
    }
}
