package comparator.car_comparator;

import comparator.entity.Car;

import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class CarPowerComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // Сравнение объектов происходит по одному из их полей. В нашем примере по полю id
        // если o1 объект больше o2 то вернуть положительное число
        // если o1 объект меньше o2 то вернуть отрицательное число
        // если объект равны то вернуть 0
        return o1.getPower() - o2.getPower();
    }
}
