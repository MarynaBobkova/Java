package inheritance.auto;

import inheritance.auto.child.Bus;
import inheritance.auto.child.Truck;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 * <p>
 * Предположим, у нас есть класс "Автомобиль", который описывает общие характеристики автомобилей.
 * Мы создаем подклассы для разных типов автомобилей, таких как "Легковой автомобиль" и "Грузовик".
 * Каждый подкласс может иметь свои уникальные свойства и методы, но также унаследует общие черты от суперкласса.
 */
public class Main {

    public static void main(String[] args) {
        Truck truck = new Truck();
        Bus bus = new Bus();

        System.out.println();

        truck.setColor("Black");
        bus.setYear(2023);

        truck.driveTrailer();
        bus.transportPassengers();

        truck.printDetails();
        bus.printDetails();

        System.out.println();
    }
}
