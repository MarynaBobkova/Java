package abstraction;

/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class Bicycle extends Transport {

    public Bicycle(int wheels, int speed) {
        super(wheels, speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед движется на скорости " + this.speed + " км/ч.");
    }

    public void ringBell() {
        System.out.println("Велосипед звонит в колокольчик");
    }
}
