package d.incorrect;

import java.util.List;

public class ProductService {

    private ProductRepositoryList repository;

    public ProductService(ProductRepositoryList repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product getByName(String name) {
        return repository.findByName(name);
    }
}