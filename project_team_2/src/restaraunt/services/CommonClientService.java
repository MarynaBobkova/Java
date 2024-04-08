package restaraunt.services;


import restaraunt.domain.interfaces.Client;
import restaraunt.domain.interfaces.Dish;
import restaraunt.repositories.interfaces.ClientRepository;
import restaraunt.repositories.interfaces.DishRepository;
import restaraunt.services.interfaces.ClientService;

import java.util.List;
import java.util.stream.Collectors;


public class CommonClientService implements ClientService {


    private ClientRepository clientRepository;
    private DishRepository dishRepository;


    public CommonClientService(ClientRepository clientRepository, DishRepository dishRepository) {
        this.clientRepository = clientRepository;
        this.dishRepository = dishRepository;

    }

    @Override
    public void addClient(String lastname) { // null   ""
        if (lastname == null) {
            throw new IllegalArgumentException("Lastname can't be null");

        }
        clientRepository.addClient(lastname);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.getAllClients();
    }

    @Override
    public void removeClient(int id) {
        if (id == 0 || id <= 0) {
            throw new IllegalArgumentException("Wrong id!");
        }
        clientRepository.removeClient(id);
    }


    @Override
    public List<Client> getClientsByLastName(String lastName) {

        return clientRepository.getAllClients()
                .stream()
                .filter(cl -> cl.getClientByLastname().equals(lastName))
                .collect(Collectors.toList());
    }


    @Override
    public boolean isClientExist(int id) {
        return clientRepository.getById(id) != null;
    }

    @Override
    public void addDishToOrder(String dishName, int clientId) {
        Dish dish = dishRepository.getDishByName(dishName);
        Client client = clientRepository.getById(clientId);

        if (dish == null || client == null) {
            throw new IllegalArgumentException("Dish or client doesn't exist");
        }
        client.getOrder().getListItems().add(dish);
    }

    @Override
    public void removeDishFromOrder(int dishId, int clientId) {
        Dish dish = dishRepository.getDishById(dishId);
        Client client = clientRepository.getById(clientId);

        if (dish == null || client == null) {
            throw new IllegalArgumentException("Dish or client doesn't exist");
        }
        client.getOrder().getListItems().remove(dish);
    }


    @Override
    public List<Dish> getOrder(int clientId) {
        Client client = clientRepository.getById(clientId);
        if (client != null) {
            return client.getOrder().getListItems();
        } else {
            throw new IllegalArgumentException("Invalid client ID.");
        }
    }
}