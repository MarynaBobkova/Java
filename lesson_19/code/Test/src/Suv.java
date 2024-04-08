/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Suv extends Auto {

    private int power;

    public Suv(String model, String color, int power) {
        super(model, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
