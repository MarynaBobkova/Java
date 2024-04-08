package restaraunt.repositories;

import restaraunt.domain.CommonClient;
import restaraunt.domain.interfaces.Client;
import restaraunt.repositories.interfaces.ClientRepository;

import java.util.*;

public class CommonClientRepository implements ClientRepository {
    private Map<Integer, Client> clients = new HashMap<>();
    private int currentId;


    public CommonClientRepository() {
        addClient("Gates");
        addClient("Petrovich");
        addClient("Jakubovich");
        addClient("Bilstein");
        addClient("Vejonis");
        addClient("Groza");
        addClient("Odinaeva");
        addClient("Buchner");
    }

    @Override
    public Client getById(int id) {
        return clients.get(id);
    }

    @Override
    public void addClient(String lastname) {
        CommonClient commonClient = new CommonClient(lastname);
        commonClient.setId(++currentId);
        clients.put(currentId, commonClient);
    }

    @Override
    public void removeClient(int id) {
        clients.remove(id);
    }

    @Override
    public List<Client> getAllClients() {
        return new ArrayList<>(clients.values());
    }

    @Override
    public Client getClientByLastname(String clientLastname) {
        Optional<Client> matchingClient = clients.values()
                .stream()
                .filter(client -> client.getClientByLastname().equals(clientLastname))
                .findFirst();

        return matchingClient.orElse(null);
    }

}