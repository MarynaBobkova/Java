package array_tool;

import static_mod.Car;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class ArrayToolApp {

    public static void main(String[] args) {
        Car car1 = new Car("VW", "POLO", 1988, "von_001_2");
        Car car2 = new Car("VW", "Golf", 1988, "von_001_3");
        Car car3 = new Car("Audi", "TT", 2022, "von_001_5");
        Car car4 = new Car("VW", "POLO", 1988, "von_001_2");

        Object target = new Object();

        Car[] cars = {car1, car2, car3, car4};

        ArrayTools.printArray(cars);

        Integer[] ints = {1, 2, 3, 4, 5, 6};
        ArrayTools.printArray(ints);

        System.out.println(ArrayTools.findElement(car4, cars));
        System.out.println(ArrayTools.findElement(target, cars));
    }
}
