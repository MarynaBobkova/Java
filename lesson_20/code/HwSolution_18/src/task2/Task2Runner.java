package task2;

/**
 * @author Andrej Reutow
 * created on 01.10.2023
 * Создайте иерархию классов для компьютерных устройств: ноутбуки и стационарные компьютеры. Каждое устройство имеет атрибуты марка и объем памяти.
 * <p>
 * Создайте методы для вывода информации о каждом устройстве, включая его тип (ноутбук или стационарный компьютер), марку и объем памяти.
 * <p>
 * Создайте объекты разных типов компьютерных устройств и выведите информацию о каждом из них.
 */
public class Task2Runner {

    public static void main(String[] args) {
        Handy handy = new Handy("amd", "6gb", "a4", "100gb", null);
        TowerPc towerPc = new TowerPc("amd", "6gb", "a4", "100gb", true);
        Laptop laptop = new Laptop("amd", "6gb", "a4", "100gb", "logitech");

//        Device handy = new Handy("amd", "6gb", "a4", "100gb", null);
//        Device towerPc = new TowerPc("amd", "6gb", "a4", "100gb", true);
//        Device laptop = new Laptop("amd", "6gb", "a4", "100gb", "logitech");
//
//        Device[] devices = new Device[3];
//        devices[0] = handy;
//        devices[1] = towerPc;
//        devices[2] = laptop;

        System.out.println();
    }
}
