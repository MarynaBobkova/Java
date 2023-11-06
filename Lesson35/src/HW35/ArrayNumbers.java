package HW35;
//Создайте массив целых чисел (например, [1, 2, 3, 4, 5, 6]).
//Определите предикат Predicate<Integer>, который будет проверять, является ли число четным.
//Пройдите по массиву и используйте предикат для фильтрации, чтобы оставить только четные числа.
//Выведите отфильтрованные числа на экран.

import java.util.function.Predicate;

public class ArrayNumbers {
    public static void main(String[] args) {
        Integer[] arrayNumbers = {1, 2, 3, 4, 5, 6};
        Predicate <Integer> isEven = n ->  n % 2 == 0;

        for (int i = 0; i <arrayNumbers.length; i++) {
            if (isEven.test(arrayNumbers[i])) {
                System.out.println(arrayNumbers[i]);
            }
        }
    }
}
