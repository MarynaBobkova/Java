package restaraunt.domain.interfaces;

import java.util.List;

public interface Order {

    int getOrderId();

    List<Dish> getListItems();


}
