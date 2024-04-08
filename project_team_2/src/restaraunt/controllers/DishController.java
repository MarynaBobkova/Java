package restaraunt.controllers;

import restaraunt.domain.interfaces.Dish;
import restaraunt.services.interfaces.DishService;

import java.util.List;
import java.util.Scanner;

public class DishController {

    private DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }
    public  void addDish() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Type dish name:");
            String name = scanner.nextLine();

            System.out.println("Type dish price:");
            double price = scanner.nextDouble();

            dishService.addDish(name, price);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Dish> getAllDishe() {
        return dishService.getAllDishe();
    }
    public  void removeDish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type ID to remove dish");
        int idToRemove = scanner.nextInt();
        dishService.removeDish(idToRemove);
    }
    public void setPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type dish ID:");
        int dishId = scanner.nextInt();
        System.out.println("Type new dish price:");
        double newPrice = Double.parseDouble(scanner.next());
        dishService.setPrice(dishId, newPrice);
        System.out.println("Price is updated");
    }
}
