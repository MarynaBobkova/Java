package tasks;

// Обратный массив: Напишите программу, которая создает новый массив,
// содержащий элементы исходного массива в обратном порядке, используя System.arraycopy().

// Слияние массивов: Напишите метод, который принимает два массива целых чисел и возвращает новый массив,
// который является результатом их слияния. Используйте System.arraycopy().

// Удаление дубликатов: Напишите программу, которая удаляет все дубликаты из отсортированного массива.
// Снова используйте System.arraycopy() для сдвига элементов.

import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        int[] reversed = reverse();
        System.out.println(Arrays.toString(reversed));

        int[] source1 = {1, 2, 3};
        int[] source2 = {10, 20, 30};

        int[] merged = merge(source1, source2);
        System.out.println(Arrays.toString(merged));

        System.out.println("\nFind Median");
        int[] array1 = {5, 17, 3, 9, 14, 2};
        int[] array2 = {5, 2, 18, 8, 3};

        double medianResult1 = findMedian(array1);
        double medianResult2 = findMedian(array2);

        System.out.println("Median Result1: " + medianResult1);
        System.out.println("Median Result2: " + medianResult2);

        System.out.println("\nRemove Duplicates");
        int[] arrayD1 = {1, 2, 2, 5, 6, 5, 1, 2, 1, 4, 2, 2, 2 };
        int[] resultRD = removeDuplicates(arrayD1);
        System.out.println(Arrays.toString(resultRD));

//        int[] resultRD2 = arrayWithoutDuplicate(arrayD1);
//        System.out.println(Arrays.toString(resultRD2));

    }

    public static int[] reverse() {
        int[] source = {1, 2, 3, 4, 5};
        int[] result = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            System.arraycopy(source, i, result, source.length - 1 - i, 1);
        }
        return result;
    }

    public static int[] merge(int[] source1, int[] source2) {
        int[] result = new int[source1.length + source2.length];

        System.arraycopy(source1, 0, result, 0, source1.length);
        System.arraycopy(source2, 0, result, source1.length, source2.length);

        return result;// {1, 2, 3, 10, 20, 30}
    }

    // Создайте отсортированный массив случайных чисел. Напишите программу, которая находит медиану этого массива с помощью бинарного поиска.
    // Медианой ряда чисел (или медианой числового ряда) называется число, стоящее посередине упорядоченного
    // по возрастанию ряда чисел — в случае, если количество чисел нечётное. Если же количество чисел в ряду чётно,
    // то медианой ряда является полусумма двух стоящих посередине чисел упорядоченного по возрастанию ряда.
    //
    //Пример 1. Найти медиану числового ряда 5, 17, 3, 9, 14, 2.
    //
    //Решение. Записываем все числа ряда в порядке возрастания: 2, 3, 5, 9, 14, 17. Количество чисел в ряду чётно,
    // поэтому медиана этого ряда будет равна полусумме двух средних чисел: (5 + 9) / 2 = 7.
    //Пример 2. Найти медиану числового ряда 5, 2, 18, 8, 3.
    //
    //Решение. записываем все числа ряда в порядке возрастания: 2, 3, 5, 8, 18. Количество чисел в ряду нечётно,
    // поэтому медиана этого ряда будет равна стоящему посередине числу, то есть равна 5.
    public static double findMedian(int[] source) {
//        Random random = new Random();
//        int[] randomNumbs = new int[6];
//        for (int i = 0; i < randomNumbs.length; i++) {
//            randomNumbs[i] = random.nextInt(15); // from 0 to 14
//        }

        Arrays.sort(source);
        double median;

        if (source.length % 2 == 0) {
            int mid1 = source[source.length / 2 - 1];
            int mid2 = source[source.length / 2];
            median = (double) (mid1 + mid2) / 2;
        } else {
            median = source[source.length / 2];
        }

        return median;
    }


    // Удаление дубликатов: Напишите программу, которая удаляет все дубликаты из отсортированного массива.
    // Снова используйте System.arraycopy() для сдвига элементов.
    public static int[] removeDuplicates(int[] source) {
        Arrays.sort(source);

        int j = 0;

        for (int i = 0; i < source.length - 1; i++) {
            if (source[i] != source[i + 1]) {
                source[j++] = source[i];
            }
        }

        source[j] = source[source.length - 1];

        int[] result = new int[j + 1];
        System.arraycopy(source, 0, result, 0, j + 1);

        return result;
    }


//    //todo fixit
//    public static int[] arrayWithoutDuplicate(int[] array) {
//        Arrays.sort(array);
//        for (int i = array.length - 1; i > 0; i--) {
//            if (array[i] == array[i - 1]) {
//                int[] result = new int [array.length - 1];
//                System.arraycopy(array, 0, result, 0, i);
//                System.arraycopy(array, i, result, i - 1, array.length - 1);
//                array = Arrays.copyOf(result, result.length);
//            }
//        }
//        return array;
//    }
}
