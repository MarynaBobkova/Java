package restaraunt.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {

    private ClientController clientController;
    private DishController dishController;
    Scanner scanner = new Scanner(System.in);

    public MainController(ClientController clientController, DishController dishController) {
        this.clientController = clientController;
        this.dishController = dishController;
    }

    public List<Object> sendRequest(String query) {
        try {

            String[] parts = query.split(" ");
            int objectNumber = Integer.parseInt(parts[0]);
            int operationNumber = Integer.parseInt(parts[1]);

            List<Object> result = new ArrayList<>();

            switch (objectNumber) {
                case 1:
                    switch (operationNumber) {
                        case 1:
                            clientController.addClient();
                            break;
                        case 2:
                            result.addAll(clientController.getAllClients());
                            break;
                        case 3:
                            clientController.removeClient();
                            break;
                        case 4:
                            result.addAll(clientController.getClientByLastname());
                            break;
                        case 5: // not working
                            clientController.addDishToClientOrder();
                            break;
                        case 6:
                            clientController.removeDishFromClientOrder();
                        case  7:
                           result.addAll(clientController.displayClientDishesFromOrder()) ;
                            break;

                        default:
                            System.err.println("Incorect input!");
                            break;
                    }
                    break;
                case 2:
                    switch (operationNumber) {
                        case 1:
                            dishController.addDish();
                            break;
                        case 2:
                            result.addAll(dishController.getAllDishe());
                            break;
                        case 3:
                            dishController.removeDish();
                            break;
                        case 4:
                            dishController.setPrice();
                            break;

                        default:
                            System.err.println("Incorect input!");
                            break;

                    }
            }
            return result;
        } catch (Exception e) {
            System.err.println("Main controller data error!");
            System.err.println(e.getMessage());
            throw new RuntimeException(e);

        }
    }
}
