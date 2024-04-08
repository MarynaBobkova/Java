package restaraunt.domain.interfaces;

public interface Client {

    int getId();
    String getClientByLastname();

    Order getOrder();


    void setOrder(Order order);
}
