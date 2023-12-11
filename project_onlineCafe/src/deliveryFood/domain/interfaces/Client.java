package deliveryFood.domain.interfaces;

import java.util.List;

public interface Client {
    int getClientId();
    boolean isAvailable();
    void setAvailable(boolean available);
    String getName();
    String getAdress();
    List <Order> getOrders();
    void addOrder(Order currentOrder);
    List <Dish> makeOrder();
    void setAdress(String adress);
    void setName(String name);
    void addDishToOrder(Dish dish);
    Order getCurrentOrder();

}
