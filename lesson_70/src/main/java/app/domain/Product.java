package main.java.app.domain;

import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private String article;
    private double price;
    private String supplier;
    private boolean isActive;

    public Product(String name, double price, String supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        isActive = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && isActive == product.isActive && Objects.equals(name, product.name) && Objects.equals(article, product.article) && Objects.equals(supplier, product.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, article, price, supplier, isActive);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}