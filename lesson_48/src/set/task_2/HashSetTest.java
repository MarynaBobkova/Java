package set.task_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("DDD");
        set.add("EEE");
        set.add("FFF");
        set.add("BBB");

        // Элементы будут выведены в непредсказуемом порядке,
        // т.к. HashSet не гарантирует порядок добавления элементов,
        // при этом в множестве не будет содержаться дубликатов
        System.out.println(set);
    }
}