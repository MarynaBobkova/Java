package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 90));
        products.add(new Product("Banana", 150));
        products.add(new Product("Bread", 70));
        products.add(new Product("Bonbon", 60));
        products.add(new Product("Orange", 210));
        products.add(new Product("Coconut", 300));
        products.add(new Product("Ice cream", 85));
        products.add(new Product("Pear", 120));
        products.add(new Product("Banana", 120));
        products.add(new Product("Pear", 120));
        products.add(new Product("Bread", 65));
        products.add(new Product("Orange", 230));

        // Создать лист уникальных наименований продуктов дороже 100

        List<String> result = products.stream() // стрим продуктов
                .filter(x -> x.getPrice() > 100) // стрим отфильтрованных продуктов
                .map(x -> x.getName()) // стрим стрингов (наименований)
                .distinct() // убираем дубликаты из стрима
                .collect(Collectors.toList()); // собираем стрим в лист

        System.out.println(result);
    }
}
