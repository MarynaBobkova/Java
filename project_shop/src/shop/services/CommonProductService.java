package shop.services;

import shop.domain.interfaces.Product;
import shop.repositories.interfaces.ProductRepository;
import shop.services.interfaces.ProductService;

import java.util.List;
import java.util.stream.Collectors;

public class CommonProductService implements ProductService {

    private ProductRepository repository;

    public CommonProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addProduct(String name, double price) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Наименование продукта не может быть пустым!");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной и равняться нулю!");
        }

        repository.addProduct(name, price);
    }

    @Override
    public List<Product> getAllActiveProducts() {
        return repository.getAllProducts()
                .stream()
                .filter(x -> x.isActive())
                .collect(Collectors.toList());
    }
}