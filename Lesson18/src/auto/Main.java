package auto;
/*Предположим, у нас есть класс "Автомобиль", который описывает общие характеристики автомобилей.
Мы создаем подклассы для разных типов автомобилей, таких как "Легковой автомобиль" и "Грузовик". Каждый подкласс может иметь свои уникальные свойства и методы, но также унаследует общие черты от суперкласса.
 */

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bus bus = new Bus();

        System.out.println();

        truck.setColor("black");
        bus.setYear(2023);

        truck.driveTrailer();
        bus.transportPassenger();

        truck.printDetails();
        bus.printDetails();
    }
}
