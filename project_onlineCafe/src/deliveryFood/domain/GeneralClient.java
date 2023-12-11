package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeneralClient implements Client {
    private int clientId;
    private boolean isAvailable;
    private String name;
    private String adress;
    private Order currentOrder;
    private List<Order> orders = new ArrayList<>();


    public GeneralClient(String name, String adress) {
        currentOrder = new GeneralOrder();
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

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String adress) {
        this.adress = adress;
    }

    @Override
   public void addDishToOrder(Dish dish) {
   currentOrder.addDishToOrder(dish);
   }

    @Override
    public List<Dish> makeOrder() {
        orders.add(currentOrder);
        List<Dish> dishes = currentOrder.getDishesInOrder();
        currentOrder = new GeneralOrder();
        return dishes;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GeneralClient client = (GeneralClient) object;

        if (clientId != client.clientId) return false;
        if (isAvailable != client.isAvailable) return false;
        if (!Objects.equals(name, client.name)) return false;
        if (!Objects.equals(adress, client.adress)) return false;
        if (!Objects.equals(currentOrder, client.currentOrder))
            return false;
        return Objects.equals(orders, client.orders);
    }

    @Override
    public int hashCode() {
        int result = clientId;
        result = 31 * result + (isAvailable ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (currentOrder != null ? currentOrder.hashCode() : 0);
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("id - %d, " +
                        "name - %s, adress - %s, available - %s.",
                clientId , name, adress, isAvailable ? "yes" : "no");
    }
}
