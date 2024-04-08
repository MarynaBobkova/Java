package restaraunt.repositories.interfaces;

import restaraunt.domain.interfaces.Dish;

import java.util.List;

public interface DishRepository {

    Dish getDishById(int id);

    List<Dish> getAllDishes();

    void addDish(String name, double price);

    void removeDish(int id);

    Dish getDishByName(String dishName);
}
