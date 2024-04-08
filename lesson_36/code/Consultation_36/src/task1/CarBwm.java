package task1;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class CarBwm extends Car {
    public CarBwm(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println("I drive " + brand);
    }
}
