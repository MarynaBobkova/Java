package task1;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class BoxSimpleCar {

    private Car value;

    public BoxSimpleCar(Car value) {
        this.value = value;
    }

    public Car getContent() {
        return this.value;
    }
}
