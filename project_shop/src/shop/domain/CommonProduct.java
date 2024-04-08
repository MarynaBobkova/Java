package shop.domain;

import shop.domain.interfaces.Product;

import java.util.Objects;

public class CommonProduct implements Product {

    private int id;
    private boolean isActive;
    private String name;
    private double price;

    public CommonProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.isActive = true;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonProduct that = (CommonProduct) o;
        return id == that.id && isActive == that.isActive && Double.compare(that.price, price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, price);
    }

    @Override
    public String toString() {
        return String.format("Продукт: идентификатор - %d, " +
                        "наименование - %s, цена - %.2f, активен - %s.",
                id, name, price, isActive ? "да" : "нет");
    }
}