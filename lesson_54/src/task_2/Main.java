package task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Вывести все элементы массива в одну строку, кроме b

        String[][] array = {{"a", "b"},
                            {"c", "d", "e", "f"},
                            {"g", "h", "i"}};

        List<String> result = Arrays.stream(array) // стрим String[]
                .flatMap(x -> Arrays.stream(x)) // стрим строк "a", "b".....
                .filter(x -> !x.equals("b")) // фильтруем. Нас устраивает всё, кроме b
                .collect(Collectors.toList()); // собираем стрим в лист

        System.out.println("Результат - " + result);
    }
}