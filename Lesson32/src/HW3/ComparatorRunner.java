package HW3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class ComparatorRunner {
    public static void main(String[] args) {
        Product[] products = {
                new Product(01, "Milk", 1.20),
                new Product(05, "Apple", 2),
                new Product(02, "Banane", 1.5),
                new Product(12, "Butter", 3)
        };
        Comparator<Product> productIdComparator = new ProductIdComparator();
        Arrays.sort(products, productIdComparator);
        System.out.println("Sort by ID: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.println();

        Comparator<Product> productPriceComparator = new ProductPriceComparator();
        Arrays.sort(products, productPriceComparator);
        System.out.println("Sort by Price: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
