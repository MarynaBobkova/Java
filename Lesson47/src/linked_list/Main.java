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
    }
}
