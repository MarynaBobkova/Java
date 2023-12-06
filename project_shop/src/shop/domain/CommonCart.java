package shop.domain;

import shop.domain.interfaces.Cart;
import shop.domain.interfaces.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CommonCart implements Cart {
    private int id;
    private List<Product> products = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean addProduct(Product product) {

        return products.add(product);
    }

    @Override
    public boolean deleteProdactById(int id) {
       // return products.removeIf(x -> x.getId() == id);
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getAveragePrice() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        CommonCart that = (CommonCart) object;

        if (id != that.id) return false;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
