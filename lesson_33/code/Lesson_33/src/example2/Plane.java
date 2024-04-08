package example2;

/**
 * @author Andrej Reutow
 * created on 20.10.2023
 */
public class Plane extends Transport {

    @Override
    public void move() {
        System.out.println("Plane is moving");
    }

    public void fly() {
        System.out.println("Plane is flying");
        move();
    }
}
