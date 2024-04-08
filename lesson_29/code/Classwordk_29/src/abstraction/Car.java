package abstraction;

/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class Car extends Transport {

    public Car(int wheels, int speed) {
        super(wheels, speed);
    }

    @Override
    public void move() {
        System.out.println("Автомобиль движется на скорости " + this.speed + " км/ч.");
        // System.out.println("Автомобиль движется на скорости " + speed + " км/ч."); // тоже самое что и с верху, только без явного указания
    }

    public void honk(){
        System.out.println("Автомобиль сигналит");
    }
}
