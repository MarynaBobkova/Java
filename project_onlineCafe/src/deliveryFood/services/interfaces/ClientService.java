package deliveryFood.services.interfaces;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;

import java.util.List;

public interface ClientService {
    void addClient(String name, double price);
    List<Client> getAllAvailableClients();
    List<Order> getAllOrdersByClient();
    void deleteClientById(int id);
    void deleteClientByName(String name);
    void restoreClientById(int id);
    void restoreClientByName(String name);
    Client changeName(int id, String newName);
    int totalClientQuantity();
    int orderQuantity();
}
