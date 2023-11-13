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





    }
}
