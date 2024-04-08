package test.correct;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<OurProduct> products = new ArrayList<>();

    public void add(OurProduct product) {
        products.add(product);
    }

    public List<OurProduct> getAll() {
        return products;
    }

    public void printNameById(int id) {
        OurProduct product = products.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (product != null) {
            System.out.println(product.getName());
        }
    }
}