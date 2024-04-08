package array_list;

public class Main {

    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        System.out.println("Лист пустой? - " + list.isEmpty());
        System.out.println("Размер листа - " + list.size());

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        System.out.println("Лист пустой? - " + list.isEmpty());
        System.out.println("Размер листа - " + list.size());

        System.out.println(list);

        list.add("DDD");
        list.add("EEE");

        System.out.println("Элемент листа по индексу 2 - " + list.get(2));

        list.add("FFF");
        list.add("GGG");
        list.add("HHH");
        list.add("III");
        list.add("JJJ");

        System.out.println("Лист пустой? - " + list.isEmpty());
        System.out.println("Размер листа - " + list.size());

        System.out.println(list);

        list.add("KKK");

        System.out.println("Лист пустой? - " + list.isEmpty());
        System.out.println("Размер листа - " + list.size());

        System.out.println(list);

        list.set(3, "LLL");

        System.out.println(list);

        System.out.println("Есть ли в листе FFF? - " + list.contains("FFF"));
        System.out.println("Есть ли в листе MMM? - " + list.contains("MMM"));
        System.out.println("Есть ли в листе null? - " + list.contains(null));

        list.set(4, null);

        System.out.println(list);

        System.out.println("Есть ли в листе FFF? - " + list.contains("FFF"));
        System.out.println("Есть ли в листе MMM? - " + list.contains("MMM"));
        System.out.println("Есть ли в листе null? - " + list.contains(null));

        System.out.println("Размер листа - " + list.size());
        String deletedElement = list.remove(2);

        System.out.println("Удалённый элемент - " + deletedElement);
        System.out.println("Размер листа - " + list.size());
        System.out.println(list);
    }
}