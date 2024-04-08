package linked_list;

public class Main {

    public static void main(String[] args) {

        MyList<String> list = new MyLinkedList<>();

        System.out.println("Лист пустой? - " + list.isEmpty());
        System.out.println("Размер листа - " + list.size());
        System.out.println(list);

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        System.out.println("Лист пустой? - " + list.isEmpty());
        System.out.println("Размер листа - " + list.size());
        System.out.println(list);

        list.add("DDD");
        list.add("EEE");

        System.out.println(list);

        System.out.println(list.get(3));

        list.set(3, "FFF");

        System.out.println(list);

        System.out.println("Есть ли в листе элемент EEE? - " + list.contains("EEE"));
        System.out.println("Есть ли в листе элемент GGG? - " + list.contains("GGG"));

        String deletedElement = list.remove(0);
        System.out.println("Удалённое значение - " + deletedElement);
        System.out.println(list);

        System.out.println("Размер листа - " + list.size());
    }
}