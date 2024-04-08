package restaraunt.repositories.interfaces;

import restaraunt.domain.interfaces.Client;

import java.util.List;

public interface ClientRepository {
    Client getById(int id);

    void addClient(String lastname);

    void removeClient(int id);

    List<Client> getAllClients();

    Client getClientByLastname(String clientLastname);
}
