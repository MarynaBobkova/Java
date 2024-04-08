import java.util.Arrays;
import java.util.Random;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 * <p>
 * Создайте массив из 20 случайных целых чисел в интервале от -10 до 10.
 * <p>
 * Напишите методы, которые ответят на вопросы:
 * <p>
 * сколько положительных чисел;
 * сколько отрицательных чисел;
 * сколько четных чисел;
 * какая сумма всех элементов массива
 * Оформите решение данной задачи методами и напишите для каждого метода тесты.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] intArray = generateArray(20, -10, 10);
        System.out.println(Arrays.toString(intArray));
        System.out.println(countEven(intArray));
    }

    /**
     * Метод создания и заполнения массива случайными числами
     *
     * @param elements  количесвто элементов в массиве
     * @param minNumber минимальное число
     * @param maxNumber максимальное число
     * @return заполненный int массив размером elements и случайными значениями от minNumber до maxNumber
     */
    public static int[] generateArray(int elements, int minNumber, int maxNumber) {
        Random random = new Random();
        int[] result = new int[elements];

        for (int i = 0; i < result.length; i++) {
            int randomNumber = random.nextInt((maxNumber - minNumber) + 1) + minNumber;
            result[i] = randomNumber;
        }

        return result;
    }

    //сколько положительных чисел;
    public static int countPositive(int[] array) {
        int positiveCounter = 0; // количесвто позитивных чисел

        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] > 0) {
                positiveCounter++;
            }
        }
        return positiveCounter;
    }

    // сколько четных чисел;
    public static int countEven(int[] array) {
        int eventCounter = 0;

        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] % 2 == 0) {
                eventCounter++;
            }
        }

        return eventCounter;
    }

    // какая сумма всех элементов массива
    public static int summArray(int[] array) {
        int sumArray = 0; // переманная которая хранит сумму всех элементов массива
        // {1, 10, -5, 6}
        // 0 + 1 = 1
        // 1 + 10 = 11
        // 11 + (-5) = 6
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            sumArray += array[arrayIndex];
        }

        return sumArray;
    }
}
