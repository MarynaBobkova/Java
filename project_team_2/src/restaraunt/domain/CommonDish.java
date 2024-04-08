package restaraunt.domain;

import restaraunt.domain.interfaces.Dish;

import java.util.Objects;

public class CommonDish implements Dish {

    private int id;
    private String dishName;
    private double price;
    private boolean isActive;

    public CommonDish(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
        this.isActive = true;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDish that = (CommonDish) o;

        if (id != that.id) return false;
        if (Double.compare(price, that.price) != 0) return false;
        if (isActive != that.isActive) return false;
        return Objects.equals(dishName, that.dishName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (dishName != null ? dishName.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Dish: ID - %d, name - %s, price - %.2f, is active? - %s.",  id, dishName, price, isActive ? "Yes" : "No");
    }
}
