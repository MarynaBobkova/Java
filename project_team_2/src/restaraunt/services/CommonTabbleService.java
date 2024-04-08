package restaraunt.services;


import restaraunt.domain.interfaces.Client;
import restaraunt.repositories.interfaces.ClientRepository;
import restaraunt.repositories.interfaces.TablesRepository;
import restaraunt.services.interfaces.TableService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonTabbleService implements TableService {

    private TablesRepository tableRepository;
    private ClientRepository clientRepository;
    private Map<String, Boolean> tableReservedMap = new HashMap<>();


    @Override
    public void addTable(int seatsCapacity, String tablePosition) {
        int maxSeats = 4;

        if (seatsCapacity > 0 && seatsCapacity <= maxSeats && isValidTablePosition(tablePosition)) {
            if (!isTableReserved(tablePosition)) {
                tableRepository.addTable(seatsCapacity, tablePosition);
            }
        }
    }

    public boolean isTableReserved(String tablePosition) {
        return tableReservedMap.getOrDefault(tablePosition, false);
    }

    public boolean isValidTablePosition(String tablePosition) {
        List<String> allowedTablePositions = Arrays.asList("window", "middle", "exit", "toilet");
        return tablePosition != null && !tablePosition.isEmpty() && allowedTablePositions.contains(tablePosition);
    }

    @Override
    public void removeTableByLastname(String clientLastname) {
        Client client = clientRepository.getClientByLastname(clientLastname);
        if (client != null) {
            tableReservedMap.remove(clientLastname);
        }else {
            throw new IllegalArgumentException("Client with last name " + clientLastname + " doesn't exist.");
        }
    }
}
