package deliveryFood.repositories.interfaces;

import deliveryFood.domain.interfaces.Client;

import java.util.List;

public interface ClientRepository {
    List<Client> getAllClients();
    void addClient(String name, String adress);
    Client getClientById(int clientId);
    void setClientById(Client client, int clientId);

}
