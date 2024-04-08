public class Car extends Transport2 {
    public Car(int speed) {
        super(4, speed);
    }

    @Override
    public void move() {
        System.out.println("Автомобиль движется на скорости " + speed + " км/ч.");
    }

    public void honk() {
        System.out.println("Автомобиль сигналит.");
    }
}
