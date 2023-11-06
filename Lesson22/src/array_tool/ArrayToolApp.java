package array_tool;

import HW2.Car;

public class ArrayToolApp {
    public static void main(String[] args) {
        Car car1 = new Car("VW", "Polo", 1988, "von_001_2");
        Car car2 = new Car("VW", "Golf", 1988, "von_001_3");
        Car car3 = new Car("Audi", "TT", 2022, "von_001_5");
        Car car4 = new Car("VW", "Polo", 1988, "von_001_2");

        Car[] cars = {car1, car2, car3, car4};
        ArrayTools.printArray(cars);

        Object target = new Object();

        Integer [] ints = {1, 2, 3, 4, 5, 6};
        Integer a = 1;
        a.toString();
        ArrayTools.printArray(ints);

        System.out.println(ArrayTools.findElement(car4, cars));
        System.out.println(ArrayTools.findElement(target, cars ));

    }
}
