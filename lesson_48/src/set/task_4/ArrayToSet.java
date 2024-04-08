package set.task_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {

    public static void main(String[] args) {

        String[] array = {"AAA", "BBB", "CCC", "DDD", "EEE", "BBB"};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        Set<String> set1 = new HashSet<>();
        for (String currentValue : array) {
            set1.add(currentValue);
        }
        System.out.println("Способ 1: " + set1);

        Set<String> set2 = new HashSet<>(Arrays.asList(array));
        System.out.println("Способ 2: " + set2);

        Set<String> set3 = new HashSet<>();
        Collections.addAll(set3, array);
        System.out.println("Способ 3: " + set3);

        Set<String> set4 = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println("Способ 4: " + set4);

        array[5] = "FFF";
        Set<String> set5 = Set.of(array);
        System.out.println("Способ 5: " + set5);
    }
}