package restaraunt.services.interfaces;

import restaraunt.domain.interfaces.Client;
import restaraunt.domain.interfaces.Dish;

import java.util.List;

public interface ClientService {

    void addClient(String lastname);

    List<Client> getAllClients();

    void removeClient(int id);

    List<Client> getClientsByLastName(String lastName);

    boolean isClientExist(int id);

    void addDishToOrder(String dishName, int clientId);


    void removeDishFromOrder(int dishId, int clientId);



    List<Dish> getOrder(int clientId);
}

