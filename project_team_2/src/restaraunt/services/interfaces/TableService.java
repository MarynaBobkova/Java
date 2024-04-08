package restaraunt.services.interfaces;

public interface TableService {


    void addTable(int seatsCapacity, String tablePosition);

    void removeTableByLastname(String clientLastname);

    boolean isTableReserved(String tablePosition);

    boolean isValidTablePosition(String tablePosition);
}
