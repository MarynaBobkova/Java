package task_1;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        // Tomato -> 90
        // int -> Integer
        // byte -> Byte
        // short -> Short
        // long -> Long
        // float -> Float
        // double -> Double
        // boolean -> Boolean
        // char -> Character

        Map<String, Integer> products = new HashMap<>();

        products.put("Banana", 120);
        products.put("Apple", 90);
        products.put("Orange", 200);
        products.put("Pear", 150);
        products.put("Banana", 130);
        products.put("Orange", 210);

        System.out.println("Цена на апельсин - " + products.get("Orange"));
        System.out.println("Цена на банан - " + products.get("Banana"));
        System.out.println("Цена на кокос - " + products.get("Coconut"));

        System.out.println(products);

        // Название - Banana, цена - 130.

        List<String> words = new ArrayList<>();

        for (String currentWord : words) {

        }

        System.out.println("Вывод списка всех продуктов:");
        for (Map.Entry<String, Integer> pair : products.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            String forPrint = String.format("Название - %s, цена - %d.", key, value);
            System.out.println(forPrint);
        }

        // %s - строка
        // %d - целое число
        // %b - boolean значение
        // %f - дробное число
        // %.2f - дробное число с двумя знаками после запятой
        // %c - символы
        // %t - объект, содержащий дату-время

        System.out.println("Список продуктов без цен:");
        for (String currentProduct : products.keySet()) {
            System.out.println(currentProduct);
        }

        System.out.println("Средняя цена товара в магазине:");
        int sum = 0;
        for (int currentPrice : products.values()) {
//            sum = sum + currentPrice;
            sum += currentPrice;
        }
        System.out.println(sum / products.size());

        System.out.println("Удаляем из списка все товары, которые дешевле 150.");

        Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 150) {
                iterator.remove();
            }
        }

        System.out.println(products);
    }
}