package restaraunt.services.interfaces;

import restaraunt.domain.interfaces.Dish;

import java.util.List;

public interface DishService {

    void addDish(String name, double price);

    List<Dish> getAllDishe();

    void removeDish(int id);

    int getTotalNumberOfDishes();

    boolean isDishExist(int id);

    void setPrice(int id, double newPrice);

}
