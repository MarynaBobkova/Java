package task2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = List.of("10", "20", "30", "10", "100", "50", "310");

        String result = numbers.stream()
                .reduce((x, y) -> x +y)
                .orElse("");

        System.out.println("Result - " + result);

        //Получить сумму чисел математически
        //Преобразовать строки в числа, сложить их математически
        // результат преобразовать в стринг

        String result1 = String.valueOf( //преобразуем число в строку
                numbers.stream()  //получаем стрим строк
                .map(x -> Integer.parseInt(x)) // получаем стрим чисел
                .reduce((x, y) -> x + y) // складываем числа
                .orElse(0));
        System.out.println("Result - " + result1);

        // Найти кол-во элементов, которые меньше 50 и посчитать их кол-во

        long result2 = numbers.stream() //получаем стрим строк
                .map(x -> Integer.parseInt(x))
                .filter(x -> x < 50) // получаем стрим чисел
                .count();
        System.out.println("Result - " + result2);

        // HOME WORK

        // 1. Подсчитать количество элементов, содержащих подстроку "10"
                System.out.println("количество элементов, содержащих подстроку 10");
        String result3 = String.valueOf(numbers.stream()
                .filter(x -> x.contains("10")).
                count());
        System.out.println(result3);

        // 2. Отсортировать лист в алфавитном порядке
        System.out.println("Отсортировать лист в алфавитном порядке");
        String result4 = numbers.stream()
                .sorted().collect(Collectors.toList()).toString();
        System.out.println(result4);

        //3. Отсортировать лист в математическом порядке по возрастанию
         System.out.println("Отсортировать лист в математическом порядке по возрастанию");
         String result5 = numbers.stream()
                 .map(x -> Integer.parseInt(x))
                 .sorted().collect(Collectors.toList()).toString();
         System.out.println(result5);

        // 4. Найти максимальное число
        System.out.println("Найти максимальное число");
        String result6 = numbers.stream()
                .map(x -> Integer.parseInt(x))
                .max(Integer::compareTo).get().toString();
        System.out.println(result6);

    }
}
