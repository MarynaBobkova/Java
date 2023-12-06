package deliveryFood.services.interfaces;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface DishService {
    void addDish(String name, double price);
    List<Dish> getAllAvailableDishes();
    void deleteDishById(int id);
    void deleteDishByName(String name);
    void restoreDishById(int id);
    void restoreDishByName(String name);
    Dish changePrice(int id, double newPrice);
    Dish changeName(int id, String newName);
    int totalDishesQuantity();
}
