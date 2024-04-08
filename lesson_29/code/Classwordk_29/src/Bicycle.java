public class Bicycle extends Transport2 {
    public  Bicycle(int speed) {
        super(2, speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед движется на скорости " + speed + " км/ч.");
    }

    public  void ringBell() {
        System.out.println("Велосипед звонит в колокольчик.");
    }
}
