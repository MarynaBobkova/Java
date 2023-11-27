package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Вывести всe элементы массива в одну строку , кроме b

        String[][] array = {{"a", "b"},
                            {"c", "d", "e", "f"},
                            {"g", "h", "i"}};

        List<String> result = Arrays.stream(array) //Stream String[]
                .flatMap(x -> Arrays.stream(x)) // stream "a" , "b" ...
                .filter(x -> !x.equals("b")) // deleted "b"
                .collect(Collectors.toList()); // added to List
        System.out.println("Result - " + result);

    }
}
