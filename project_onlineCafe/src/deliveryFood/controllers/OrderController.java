package deliveryFood.controllers;


import deliveryFood.domain.GeneralOrder;
import deliveryFood.domain.interfaces.Client;
import deliveryFood.services.interfaces.ClientService;
import deliveryFood.services.interfaces.DishService;

import java.util.Scanner;
//"1. Create new order \n" +
//                            "2. Add dish to order \n" +
//                            "3. Delete dish from order \n"+
//                            "4. Get list all dishes \n"+
public class OrderController {
    private ClientService serviceClient;
    private DishService serviceDish;

    public OrderController(ClientService serviceClient, DishService serviceDish) {
        this.serviceClient = serviceClient;
        this.serviceDish = serviceDish;
    }

    public void addOrder() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();

            Client client = serviceClient.getClientByName(name);

            if (client == null) {
                System.out.println("Input client adress:");
                String adress = scanner.nextLine();
                serviceClient.addClient(name, adress);

                client = serviceClient.getClientByName(name);
            }

            GeneralOrder order = new GeneralOrder();

            while (true) {
                //print dishes list:
                //1 ...
                //2 ..
                //3...
                //0 - закончить заказ

                System.out.println("Type dish id:");
                int dishid = scanner.nextInt();

                if (dishid == 0) {
                    break;
                } else {
                    System.out.println("Type dish amount:");
                    int dishAmount = scanner.nextInt();

                    //order.addDish(..)
                }
            }

            client.addOrder(order);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
