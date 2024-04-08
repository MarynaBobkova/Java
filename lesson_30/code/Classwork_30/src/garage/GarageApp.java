package garage;

import garage.entity.Car;
import garage.entity.GarageService2;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class GarageApp {

    public static void main(String[] args) {
        IGarageService garageService = new GarageService();

        Car carM5 = new Car(1, "M5");
        Car carTT = new Car(2, "TT");
        Car carC200 = new Car(3, "C200");
        Car carS500 = new Car(4, "S500");

        garageService.addCar(carM5);
        garageService.addCar(carTT);
        garageService.addCar(carC200);
        garageService.addCar(carS500);

        IGarageService garageService2 = new GarageService2();
        garageService2.addCar(carM5);
        garageService2.addCar(carTT);
        garageService2.addCar(carC200);
        garageService2.addCar(carS500);
        garageService2.addCar(new Car(5, "A4"));
        garageService2.addCar(new Car(6, "A4"));
    }
}
