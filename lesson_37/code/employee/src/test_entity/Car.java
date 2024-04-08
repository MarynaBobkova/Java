package test_entity;

import tools.Id;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class Car implements Id {

    private final int id;
    private String brand;

    public Car(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public long getId() {
        return this.id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Car car = (Car) object;

        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return brand != null ? brand.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }


}
