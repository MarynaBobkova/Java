package comparator;

import comparator.car_comparator.CarIdComparator;
import comparator.car_comparator.CarModelComparator;
import comparator.car_comparator.CarPowerComparator;
import comparator.entity.Car;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class ComparatorRunner {

    public static void main(String[] args) {
        Car[] cars = {
                new Car(4, "Mondeo", 124),
                new Car(3, "Vesta", 120),
                new Car(1, "S-500", 500),
                new Car(5, "TT", 221),
                new Car(2, "ID-4", 345)
        };

        Comparator<Car> carIdComparator = new CarIdComparator();
        Arrays.sort(cars, carIdComparator);

        System.out.println("Sort Car Array by ID:");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();

        Arrays.sort(cars, new CarPowerComparator());
        System.out.println("Sort Car Array by Power:");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();


        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);
        System.out.println("Sort Car Array by Model:");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();
    }
}
