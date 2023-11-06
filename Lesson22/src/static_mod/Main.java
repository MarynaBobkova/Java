package static_mod;

import static_mod.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println(Car.getCounter()); // вызов статичного метода класса
        Car car1 = new Car("VW", "Polo", 1988, "von_001_2");

        System.out.println(Car.getCounter()); // вызов статичного метода класса
        Car car2 = new Car("VW", "Golf", 1988, "von_001_3");

        System.out.println(Car.getCounter()); // вызов статичного метода класса
        Car car3 = new Car("Audi", "TT", 2022, "von_001_5");

        System.out.println(Car.getCounter()); // вызов статичного метода класса
        Car car4 = new Car("VW", "Polo", 1988, "von_001_2");
        System.out.println();

        System.out.println(car1.getId());
        System.out.println(car2.getId());
        System.out.println(car3.getId());
        System.out.println(car4.getId());

    }
}

