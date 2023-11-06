package HW35;
// Создайте массив целых чисел (например, [1, 4, 5, 12, 15, 22]).
//Определите два предиката: один для фильтрации четных чисел и один для чисел, больших 10.
//Создайте композицию этих предикатов, используя методы and(), or() и negate().
//Пройдите по массиву и примените каждую композицию предикатов.
//Выведите числа, которые удовлетворяют каждой композиции предикатов, на экран.

import java.util.function.Predicate;

public class Composition {
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 5, 12, 15, 22};
        Predicate <Integer> even = num -> num % 2 == 0;
        Predicate<Integer> moreThanTen = num -> num > 10;

        Predicate<Integer> evenAndMoreThanTen = even.and(moreThanTen);
        for (int i = 0; i < numbers.length; i++) {
            if (evenAndMoreThanTen.test(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println();

        Predicate<Integer> evenOrMoreThanTen = even.or(moreThanTen);
        for (int i = 0; i < numbers.length; i++) {
            if (evenOrMoreThanTen.test(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println();

        Predicate<Integer> notEven = even.negate();
        for (int i = 0; i < numbers.length; i++) {
            if (notEven.test(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }

    }
}
