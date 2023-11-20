package task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        //Tomato -> 90

        Map<String, Integer> products = new HashMap<>();

        products.put("Banana", 120);
        products.put("Apple", 90);
        products.put("Orange", 210);
        products.put("Pear", 150);
        products.put("Banana", 130);

        System.out.println("Цена на  апельсин - " + products.get("Orange"));
        System.out.println("Цена на  Banana - " + products.get("Banana"));
        System.out.println("Цена на  Coconut - " + products.get("Coconut"));

        System.out.println(products);

        System.out.println("Вывод списка всех продуктов: ");
        for (Map.Entry<String, Integer> pair: products.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            String forPrint = String.format("Название - %s, цена - %d", key, value);
            System.out.println(forPrint);
        }

        // %s - строка
        // %d - целое число
        // %b - boolean значение
        // %f - дробное число
        // %.2f - дробное число с двумя знаками после запятой
        // %c - символы
        // %t - объект, содержащий дату-время

        System.out.println("Список продуктов без цен: ");
        for (String currentProduct : products.keySet()){
            System.out.println(currentProduct);
        }

        System.out.println("Средняя цена товара в магазине: ");
        int sum = 0;
        for (int currentPrice : products.values()) {
            sum += currentPrice;
        }
        System.out.println(sum/products.size());

        System.out.println("Удаляем из списка товары, которые дешевле 150");

        Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if(pair.getValue() < 150) {
                iterator.remove();
            }
        }
        System.out.println(products);
    }
}
