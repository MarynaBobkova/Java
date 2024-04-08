package restaraunt.domain.interfaces;

public interface Table {

    int getId();
    int getTableSeatingCapacity();
    boolean isReserved();
    String getTablePosition();
    Client getClient();
}
