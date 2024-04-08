package task1;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public abstract class Car {

    protected String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    abstract void drive();
}
