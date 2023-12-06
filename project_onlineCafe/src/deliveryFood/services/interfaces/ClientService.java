package deliveryFood.services.interfaces;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;

import java.util.List;

public interface ClientService {
    void addClient(String name, String adress);
    List<Client> getAllAvailableClients();
    List<Client> getAllClients();
    List<Order> getAllOrdersByClientById(int id);
    Client getClientByName(String name);
    void deleteClientById(int id);
    void deleteClientByName(String name);
    void restoreClientById(int id);
    void restoreClientByName(String name);
    void changeName(int id, String newName);
    void changeAdress(int id, String newAdress);
    int totalClientQuantity();
    int totalOrderQuantity();
    int orderQuantityByClient(int id);
}