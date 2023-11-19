package set.task1;

import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        set.add("CCC");
        set.add("AAA");
        set.add("DDD");
        set.add("BBB");

        set.add("CCC");

        // Множество не может содержать ноль - set.add(null);
        System.out.println(set);

        boolean result = set.add("EEE");
        if(result){
            System.out.println("Element added");
        } else {
            System.out.println("Element did not add");
        }
        System.out.println(set);

        result = set.add("BBB");
        if(result){
            System.out.println("Element added");
        } else {
            System.out.println("Element did not add");
        }
        System.out.println(set);

        System.out.println("Выводим все элементы сета: ");
        int lineNumber = 1;
        for (String currentValue: set) {
            System.out.println(lineNumber++ + ". " + currentValue);
        }

        System.out.println("Содержит ли сет элемент CCC - " + set.contains("CCC"));
        System.out.println("Содержит ли сет элемент GGG - " + set.contains("GGG"));

        System.out.println("First element - " + set.first());
        System.out.println("Last element - " + set.last());

        result = set.remove("BBB");
        System.out.println("Был ли удален элемент ? - " + result);
        System.out.println(set);


    }
}
