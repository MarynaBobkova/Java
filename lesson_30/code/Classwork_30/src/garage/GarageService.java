package garage;

import garage.entity.Car;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class GarageService implements IGarageService {

    private final Car[] CARS = new Car[3];

    @Override
    public Car addCar(Car car) {
        boolean isCarAdded = false;
        for (int i = 0; i < CARS.length; i++) {
            // установить машину в пустую ячейку (пустая ячепйка это ячейка, которая хранить значение null) в массиве CARS
            if (CARS[i] == null) {
                CARS[i] = car; // установка машины в ячейку, значение которой null
                isCarAdded = true; // изменяем значение на true, если машина установленна в гараж
                break; // выход из цикла
            }
        }
        // вывести сообщение если машина не добавлена
        if (!isCarAdded) {
            System.out.println("Garage is full");
        }
        // если машина не добавленна в гараж (isCarAdded == false), тогда вернуть null. В притовном случаее вернуть добавденную машину
        return isCarAdded ? car : null;
    }

    @Override
    public Car removeCar(Car car) {
        return null;
    }

    @Override
    public Car findCarById(int id) {
        return null;
    }

    @Override
    public Car[] findByModel(String modelName) {
        return new Car[0];
    }
}
