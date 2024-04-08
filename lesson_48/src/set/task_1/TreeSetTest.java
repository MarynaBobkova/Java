package set.task_1;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        // Добавляем элементы в множество (set)
        System.out.println("Добавим несколько элементов в сет:");
        set.add("CCC");
        set.add("AAA");
        set.add("DDD");
        set.add("BBB");

        // Пытаемся добавить дубликат в наше множество
        set.add("CCC");

        // Множество (сет) не может содержать null
//        set.add(null);

        // Элементы сета будут выведены в отсортированном порядке,
        // при этом сет не будет содержать дубликатов
        System.out.println(set);

        System.out.println("Пытаемся добавить в сет элемент EEE");
        boolean result = set.add("EEE");

        if (result) {
            System.out.println("Элемент был успешно добавлен");
        } else {
            System.out.println("Элемент не был добавлен!");
        }

        System.out.println(set);

        System.out.println("Пытаемся добавить в сет элемент BBB");
        result = set.add("BBB");

        if (result) {
            System.out.println("Элемент был успешно добавлен");
        } else {
            System.out.println("Элемент не был добавлен!");
        }

        System.out.println(set);

        // 1. AAA
        // 2. BBB

        System.out.println("Выводим все элементы сета:");
        int lineNumber = 1;
        for (String currentValue : set) {
            System.out.println(lineNumber + ". " + currentValue);
            lineNumber++;
        }

        System.out.println("Содержит ли сет элемент CCC? - " + set.contains("CCC"));
        System.out.println("Содержит ли сет элемент GGG? - " + set.contains("GGG"));

        System.out.println("Первый элемент - " + set.first());
        System.out.println("Последний элемент - " + set.last());

        result = set.remove("BBB");
        System.out.println("Был ли удалён элемент? - " + result);
        System.out.println(set);
    }
}