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

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        CommonProduct that = (CommonProduct) object;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (Double.compare(price, that.price) != 0) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("Продукт: идентификатор - %d, " +
                "наименование - %s, цена - %.2f, активен - %s.",
                id , name, price, isActive ? "да" : "нет");
    }
}
