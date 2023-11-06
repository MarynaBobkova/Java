package HW3;
//Создайте массив из 20 случайных целых чисел в интервале от -10 до 10.
//
//Напишите методы, которые ответят на вопросы:
//
//сколько положительных чисел;
//сколько отрицательных чисел;
//сколько четных чисел;
//какая сумма всех элементов массива
//Оформите решение данной задачи методами и напишите для каждого метода тесты.

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] intArray = generateArray(20,10,10);
        System.out.println(Arrays.toString(intArray));

    }

    public static int [] generateArray (int elements, int minNumber, int maxNumber) {
        Random random = new Random();
        int[] result = new int [elements];
        for (int i = 0; i < result.length; i++) {
            int randomNumber = random.nextInt((maxNumber - minNumber)+ 1) + minNumber;
            result [i] = randomNumber;
        }
        return  result;

    }
    public static int countPositive (int[] array) {
        int positiveCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCounter ++;
            }
        }
        return positiveCounter;
    }

    public static int countEven(int[] array) {
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 ) {
                evenCounter++;
            }

        }
        return  evenCounter;
    }

    public static int summArray (int [] array) {
        int summArray = 0;
        for (int i = 0; i < array.length; i++) {
            summArray += array[i];
        }
        return summArray;
    }
}
