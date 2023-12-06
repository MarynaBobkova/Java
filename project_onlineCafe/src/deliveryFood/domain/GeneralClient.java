package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;

import java.util.List;

public class GeneralClient implements Client {
    private int clientId;
    private boolean isAvailable;
    private String name;
    private String adress;
    private List<Order> orders;


    public GeneralClient(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.isAvailable = true;
    }

    @Override
    public int getClientId() {
        return clientId;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
