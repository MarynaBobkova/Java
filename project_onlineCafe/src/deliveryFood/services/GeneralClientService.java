package deliveryFood.services;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.services.interfaces.ClientService;

import java.util.List;

public class GeneralClientService implements ClientService {
    @Override
    public void addClient(String name, double price) {

    }

    @Override
    public List<Client> getAllAvailableClients() {
        return null;
    }

    @Override
    public List<Order> getAllOrdersByClient() {
        return null;
    }

    @Override
    public void deleteClientById(int id) {

    }

    @Override
    public void deleteClientByName(String name) {

    }

    @Override
    public void restoreClientById(int id) {

    }

    @Override
    public void restoreClientByName(String name) {

    }

    @Override
    public Client changeName(int id, String newName) {
        return null;
    }

    @Override
    public int totalClientQuantity() {
        return 0;
    }

    @Override
    public int orderQuantity() {
        return 0;
    }
}
