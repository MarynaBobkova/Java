package comparator.car_comparator;


import comparator.entity.Car;

import java.util.Comparator;


/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        String modelObj1 = o1.getModel();
        String modelObj2 = o2.getModel();
        return modelObj1.compareTo(modelObj2);
    }
}
