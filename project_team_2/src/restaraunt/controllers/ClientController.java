package restaraunt.controllers;

import restaraunt.domain.interfaces.Client;
import restaraunt.domain.interfaces.Dish;
import restaraunt.services.interfaces.ClientService;

import java.util.List;
import java.util.Scanner;

public class ClientController {

    private ClientService clientService;



    public ClientController(ClientService clientService) {
        this.clientService = clientService;

    }



    public void addClient() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write client lastname:");
            String lastname = scanner.nextLine();

            clientService.addClient(lastname);
            System.out.println("Client is added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    public void removeClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Client ID to remove:");
        int idToRemove = scanner.nextInt();
        clientService.removeClient(idToRemove);
        System.out.println("Client is removed");
    }

    public List<Client> getClientByLastname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type client lastname:");
        String findByLastname = scanner.nextLine();
        return clientService.getClientsByLastName(findByLastname);

    }


    public void addDishToClientOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Client ID to add a dish to their order:");
        int clientId = scanner.nextInt();

        System.out.println("Enter dish name:");
        String dishName = scanner.nextLine();

        clientService.addDishToOrder(dishName, clientId);

        System.out.println("Dish added to the order for Client ID: " + clientId);
    }


    public void removeDishFromClientOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Client ID to remove dish from order:");
        int clienId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type dish name:");
        int dishId = scanner.nextInt();

        clientService.removeDishFromOrder(clienId, dishId);
        System.out.println("Dish is removed from client order:" + clienId);
    }

    public List<Dish> displayClientDishesFromOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Client ID:");
        int clientId = scanner.nextInt();
       return clientService.getOrder(clientId);


            }
        }
