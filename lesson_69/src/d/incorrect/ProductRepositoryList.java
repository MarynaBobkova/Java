package d.incorrect;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryList {

    private List<Product> products = new ArrayList<>();

    public ProductRepositoryList() {
        products.add(new Product("Banana"));
        products.add(new Product("Apple"));
        products.add(new Product("Orange"));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findByName(String name) {
        return products.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}