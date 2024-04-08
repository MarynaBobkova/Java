package test.incorrect;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<SecondProduct> products = new ArrayList<>();

    public void add(SecondProduct product) {
        products.add(product);
    }

    public List<SecondProduct> getAll() {
        return products;
    }

    public void printNameById(int id) {
        SecondProduct product = products.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (product != null) {
            System.out.println(product.getLabel());
        }
    }
}