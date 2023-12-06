package shop.domain.interfaces;

import java.util.List;

public interface Cart {
    int getId();
    List<Product> getProducts();
    boolean addProduct(Product product);
    boolean deleteProdactById(int id);
    void clear();
    double getTotalPrice();
    double getAveragePrice();


}
