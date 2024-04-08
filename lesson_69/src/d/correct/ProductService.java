package d.correct;

import java.util.List;

public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product getByName(String name) {
        return repository.getByName(name);
    }
}