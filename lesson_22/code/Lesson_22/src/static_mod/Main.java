package static_mod;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println(Car.getCounter()); // вызов статичного метода класса Car
        Car car1 = new Car("VW", "POLO", 1988, "von_001_2");
        
//        System.out.println(Car.getCounter()); // 2
        Car car2 = new Car("VW", "Golf", 1988, "von_001_3");

//        System.out.println(Car.getCounter()); // 3
        Car car3 = new Car("Audi", "TT", 2022, "von_001_5");

//        System.out.println(Car.getCounter()); // 4
        Car car4 = new Car("VW", "POLO", 1988, "von_001_2");

        System.out.println();
        System.out.println(car1.getId()); // 2
        System.out.println(car2.getId()); // 3
        System.out.println(car3.getId()); // 4
        System.out.println(car4.getId()); // 5
    }
}
