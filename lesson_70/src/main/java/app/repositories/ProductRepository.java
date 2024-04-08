package main.java.app.repositories;

import app.domain.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements Repository<Product> {

    private Map<Integer, Product> products = new HashMap<>();
    private int currentId;

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getById(int id) {
        return products.get(id);
    }

    @Override
    public Product save(Product product) {
        product.setId(++currentId);
        products.put(currentId, product);
        return product;
    }

    @Override
    public void deleteById(int id) {
        products.remove(id);
    }
}