package abstraction;

/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class Lesson29Runner {

    public static void main(String[] args) {
        Transport transportCar = new Car(4, 250);
        Transport transportBicycle = new Bicycle(2, 45);

        if (transportCar instanceof Car) { // проверка, является ли transportCar фактическим объектом класса Car
            ((Car) transportCar).honk(); // downCasting до Car
        }
        transportCar.move();

        transportBicycle.move();
    }
}
