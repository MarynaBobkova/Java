package garage;

import garage.entity.Car;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public interface IGarageService {

    Car addCar(Car car);

    Car removeCar(Car car);

    Car findCarById(int id);

    Car[] findByModel(String modelName);
}
