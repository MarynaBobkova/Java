package d.correct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryMap implements ProductRepository {

    private Map<String, Product> products = new HashMap<>();

    public ProductRepositoryMap() {
        products.put("Banana", new Product("Banana"));
        products.put("Apple", new Product("Apple"));
        products.put("Orange", new Product("Orange"));
    }

    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    public Product getByName(String name) {
        return products.get(name);
    }
}