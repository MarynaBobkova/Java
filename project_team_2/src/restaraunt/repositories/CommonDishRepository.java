package restaraunt.repositories;

import restaraunt.domain.CommonDish;
import restaraunt.domain.interfaces.Dish;
import restaraunt.repositories.interfaces.DishRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonDishRepository implements DishRepository {

    private Map<Integer, Dish> dishe = new HashMap<>();
    private int currentId;

    public CommonDishRepository() {
        addDish("Pizza", 7.20);
        addDish("Burger", 5.40);
        addDish("Ramen", 3.90);
        addDish("Paella", 9.25);
        addDish("Pierogi", 4.15);
        addDish("Moussaka", 6);
        addDish("Boeuf Bourgignon", 11.10);
        addDish("Eisbein", 5.90);
        addDish("Tom Kha Gai", 7.25);
        addDish("Chicken Tikka Massala", 9.80);
    }

    @Override
    public Dish getDishById(int id) {
        return dishe.get(id);
    }

    @Override
    public List<Dish> getAllDishes() {
        return new ArrayList<>(dishe.values());
    }

    @Override
    public void addDish(String name, double price) {
        CommonDish dish = new CommonDish(name, price);
        dish.setId(++currentId);
        dishe.put(currentId, dish);
    }

    @Override
    public void removeDish(int id) {
        dishe.remove(id);
    }

    @Override
    public Dish getDishByName(String dishName) {
        for (Dish dish : dishe.values()) {
            if (dish.getDishName().equalsIgnoreCase(dishName)) {
                return dish;
            }
        }
        return null;
    }
}