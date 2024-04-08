package d.correct;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryList implements ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepositoryList() {
        products.add(new Product("Banana"));
        products.add(new Product("Apple"));
        products.add(new Product("Orange"));
    }

    public List<Product> getAll() {
        return products;
    }

    public Product getByName(String name) {
        return products.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}