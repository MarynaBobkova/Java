package deliveryFood.domain.interfaces;
import java.util.List;

public interface Client {
    int getClientId();
    boolean isAvailable();
    void setAvailable(boolean available);
    String getName();
    List <Order> getOrders();
    List <Dish> makeOrder();
    void setAddress(String adress);
    void setName(String name);
    void addDishToOrder(Dish dish);
    Order getCurrentOrder();

}
