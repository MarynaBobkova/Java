package task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 1, 8, 0, 11, 14, 9, 7);

        //Получить из листа коллекцию нечетных чисел без дубликатов

        // 1. при помощи цикла
        Set<Integer> set = new HashSet<>();
        for (Integer current: numbers){
            if(current % 2 != 0){
                set.add(current);
            }
        }
        System.out.println("Исходный лист - " + numbers);
        System.out.println("Получившийся сет - " + set);

        // 2. при помощи  stream
        Set<Integer> result = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toSet());
        System.out.println("Получившийся сет - " + result);


        // Получить сумму всех нечетных элементов листа
        // 1. при помощи цикла
        int sum = 0;
        for(Integer current : numbers){
            if(current % 2 != 0){
                sum += current;
            }
        }
        System.out.println("Сумма нечетных чисел - " + sum);

        //2. при помощи  stream
        int sum1 = numbers.stream().filter(x -> x % 2 != 0).reduce((x, y) -> x + y).orElse(-1);
        System.out.println("Сумма нечетных чисел - " + sum1);

    }
}
