package deliveryFood.services;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.repositories.interfaces.ClientRepository;
import deliveryFood.services.interfaces.ClientService;

import java.util.List;
import java.util.stream.Collectors;

public class GeneralClientService implements ClientService {
    private ClientRepository repository;
    public GeneralClientService (ClientRepository repository) {
        this.repository = repository;
    }
    @Override
    public void addClient(String name, String adress) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        if (adress == null || adress.isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым");
        }
        repository.addClient(name, adress);
    }
    public Client getClientByName(String name) {
        return repository.getClientByName(name);
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
    public void changeAdress(int id, String newAdress) {
        Client client = repository.getClientById(id);
        if (client != null){
            client.setName(newAdress);
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
}
