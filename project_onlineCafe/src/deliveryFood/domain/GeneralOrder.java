package deliveryFood.domain;

import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GeneralOrder implements Order {

    private int id;
    private int clientId;
    private LocalDateTime dateTime;
    private List<Dish> dishes = new ArrayList<>();

    public GeneralOrder() {
        dateTime = LocalDateTime.now();
    }

    @Override
    public int getOrderId() {
        return id;
    }

    @Override
    public int getClientId() {
        return clientId;
    }

    @Override
    public List<Dish> getDishesInOrder() {
        return dishes;
    }

    @Override
    public boolean addDishToOrder(Dish dish) {
        return dishes.add(dish);
    }

    @Override
    public boolean deleteDishById(int id) {
        Iterator<Dish> iterator = dishes.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public void clear() {
        dishes.clear();
    }

    @Override
    public double getTotalPrice() {
        return dishes.stream()
                .map(Dish::getPrice)
                .reduce((x, y) -> x + y)
                .orElse(0.0);
    }

    @Override
    public double getAveragePrice() {
        double averagePrice = dishes.stream()
                .map(Dish::getPrice)
                .mapToDouble(x -> x)
                .average()
                .orElse(0);
        return averagePrice;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GeneralOrder that = (GeneralOrder) object;

        if (id != that.id) return false;
        if (clientId != that.clientId) return false;
        if (!Objects.equals(dateTime, that.dateTime)) return false;
        return Objects.equals(dishes, that.dishes);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + clientId;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (dishes != null ? dishes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%tT\n", dateTime));
        for (int i = 0; i < dishes.size(); i++) {
            builder.append("N.").append(i+1).append(" ").append(dishes.get(i).toStringOrder()).append("\n");
        }
        builder.append("Total amount: " + getTotalPrice());
          return builder.toString();
    }
}