package comparator.entity;

import java.util.Comparator;
import java.util.concurrent.Callable;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class Car {

    private final int id;
    private final String model;
    private final int power;


    public Car(int id, String model, int power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }

    public int getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
