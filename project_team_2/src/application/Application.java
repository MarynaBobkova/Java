package application;

import restaraunt.controllers.ClientController;
import restaraunt.controllers.DishController;
import restaraunt.controllers.MainController;
import restaraunt.repositories.CommonClientRepository;
import restaraunt.repositories.CommonDishRepository;
import restaraunt.repositories.interfaces.ClientRepository;
import restaraunt.repositories.interfaces.DishRepository;
import restaraunt.services.CommonClientService;
import restaraunt.services.CommonDishService;
import restaraunt.services.interfaces.ClientService;
import restaraunt.services.interfaces.DishService;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        ClientRepository clientRepository = new CommonClientRepository();
        DishRepository dishRepository = new CommonDishRepository();
//        TablesRepository tablesRepository = new CommonTablesRepository();

        ClientService clientService = new CommonClientService(clientRepository, dishRepository);
        DishService dishService = new CommonDishService(dishRepository);
//        TableService tableService = new CommonTabbleService(tablesRepository);

        ClientController clientController = new ClientController(clientService);
        DishController dishController = new DishController(dishService);
        MainController mainController = new MainController(clientController, dishController);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option:\n" +
                    "1. Client.\n" +
                    "2. Dish.\n" +
                    "0. Exit programm.");

            try {
                int objectNum = Integer.parseInt(scanner.nextLine());

                switch (objectNum) {
                    case 1:
                        System.out.println("Choose option:\n" +
                                "1. Add new client.\n" +
                                "2. Get list all clients.\n" +
                                "3. Remove client.\n" +
                                "4. Get client by lastname.\n" +
                                "5. Add Dish to client order.\n" +
                                "6. Remove Dish from client order.\n" +
                                "7. Display all dishe from client order.");

                        String firstOperationNum = scanner.nextLine();
                        mainController.sendRequest(objectNum + " " + firstOperationNum)
                                .forEach(System.out::println);

                        break;

                    case 2:
                        System.out.println("Choose option:\n" +
                                "1. Add new dish.\n" +
                                "2. Get list of all dishes.\n" +
                                "3. Remove dish.\n" +
                                "4. Set new price");

                        String secondOperationNum = scanner.nextLine();
                        mainController.sendRequest(objectNum + " " + secondOperationNum)
                                .forEach(System.out::println);

                        break;
                    case 0:
                        System.out.println("You have successfully completed the program");
                        return;
                    default:
                        System.err.println("Incorect input!");
                        break;
                }
            }catch (Exception e) {
                System.err.println("Incorect input!");

            }
        }
    }
}
