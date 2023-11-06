package HW2;
/* Создайте класс Car с полями make, model, year, и vin (идентификационный номер автомобиля). Переопределите методы equals(), hashCode() и toString() для этого класса. Затем создайте несколько объектов класса Car и проверьте, как работают переопределенные методы.

Создайте несколько объектов класса Car с разными параметрами
Сравните объекты с использованием метода

 */

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("VW", "Polo", 1988, "von_001_2");
        Car car2 = new Car("VW", "Golf", 1988, "von_001_3");
        Auto car3 = new Car("Audi", "TT", 2022, "von_001_5");
        Auto car4 = new Car("VW", "Polo", 1988, "von_001_2");

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));

        System.out.println(car3.equals(car1));
        System.out.println(car3.equals(car2));

        System.out.println(car1.equals(car4));
    }
}
