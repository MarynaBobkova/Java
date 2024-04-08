package task_01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 7, 1, 8, 0, 11, 14, 9, 7);

        // Получить из листа коллекцию нечётных чисел без дубликатов.

        String value = "Hello!";
        // 1 способ - при помощи цикла
        Set<Integer> set = new HashSet<>();
        for (Integer current : numbers) {
            if (current % 2 != 0) {
                set.add(current);
                System.out.println("В сет добавлен элемент " + current);
            }
        }

        System.out.println("Исходный лист - " + numbers);
        System.out.println("Получившийся сет - " + set);

        // 2 способ - при помощи стрима

        Set<Integer> result = numbers.stream() // стрим 2, 7, 1, 8, 0, 11, 14, 9, 7
                .filter(x -> x % 2 != 0) // стрим 7, 1, 11, 9, 7
                .collect(Collectors.toSet()); // сет 7, 1, 11, 9

        System.out.println("Результат - " + result);

        // Получить сумму всех нечётных элементов листа

        // 1 способ - при помощи цикла
        int sum = 0;
        for (Integer current : numbers) {
            if (current % 2 != 0) {
                sum += current;
            }
        }
        System.out.println("Сумма нечётных чисел - " + sum);

        // 2 способ - при помощи стрима
        int sum1 = numbers.stream()// стрим 2, 7, 1, 8, 0, 11, 14, 9, 7
                .filter(x -> x % 2 != 0)// стрим 7, 1, 11, 9, 7
                .reduce((x, y) -> x + y)
                // 7, 1, 11, 9, 7  ->  8, 11, 9, 7  ->  19, 9, 7  ->  28, 7  ->  35
                .orElse(-1);

        System.out.println("Сумма нечётных чисел - " + sum1);
    }
}