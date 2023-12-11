package deliveryFood.services;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.repositories.interfaces.ClientRepository;
import deliveryFood.repositories.interfaces.DishRepository;
import deliveryFood.services.interfaces.ClientService;

import java.util.List;
import java.util.stream.Collectors;

public class GeneralClientService implements ClientService {
    private ClientRepository repository;
    private DishRepository dishRepository;

    public GeneralClientService(ClientRepository repository, DishRepository dishRepository) {
        this.repository = repository;
        this.dishRepository = dishRepository;
    }

    @Override
    public void addClient(String name, String adress) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        if (adress == null || adress.isEmpty()) {
            throw new IllegalArgumentException("Address can't be empty");
        }
        repository.addClient(name, adress);
    }
    public Client getClientByName(String name) {
        return repository.getClientByName(name);
    }

    public Order getLastOrder(int clientId) {
        List<Order> orders = repository.getClientById(clientId).getOrders();
        return orders.get(orders.size()-1);
    }

    @Override
    public List<Client> getAllAvailableClients() {
        return repository.getAllClients()
                .stream()
                .filter(x -> x.isAvailable())
                .collect(Collectors.toList());
    }

    @Override
    public List<Client> getAllClients() {
        return repository.getAllClients();
    }

    @Override
    public List<Order> getAllOrdersByClientById(int id) {
        Client client = repository.getClientById(id);
        if (client != null) {
            return client.getOrders();
        }
        throw new IllegalArgumentException("Client by id not found");
    }
    public void deleteDishFromLastOrderByPosition(int clientId, int position) {
        List<Order> orders = repository.getClientById(clientId).getOrders();
        orders.get(orders.size()-1).getDishesInOrder().remove(position-1);
    }

    @Override
    public void deleteClientById(int id) {
        Client client = repository.getClientById(id);
        if (client != null){
            client.setAvailable(false);
        }
    }

    @Override
    public void deleteClientByName(String name) {
        Client client = repository.getClientByName(name);
        if (client != null){
            client.setAvailable(false);
        }
    }

    @Override
    public void restoreClientById(int id) {
        Client client = repository.getClientById(id);
        if (client != null){
            client.setAvailable(true);
        }
    }

    @Override
    public void restoreClientByName(String name) {
        Client client = repository.getClientByName(name);
        if (client != null){
            client.setAvailable(true);
        }
    }

    @Override
    public void changeName(int id, String newName) {
        Client client = repository.getClientById(id);
        if (client != null){
            client.setName(newName);
        }
    }
    @Override
    public void changeAddress(int id, String newAddress) {
        Client client = repository.getClientById(id);
        if (client != null){
            client.setAddress(newAddress);
        }
    }
    @Override
    public int totalClientQuantity() {
        return repository.getAllClients().size();
    }
    @Override
    public int totalOrderQuantity() {
        return repository.getAllClients().stream()
                .mapToInt(x -> x.getOrders().size())
                .sum();
    }
    @Override
    public int orderQuantityByClient(int id) {
        return getAllOrdersByClientById(id).size();
    }

    @Override
    public List<Dish> makeOrder(int clientId) {
        return repository.getClientById(clientId).makeOrder();
    }

}
