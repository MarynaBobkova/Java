package restaraunt.domain;

import restaraunt.domain.interfaces.Dish;
import restaraunt.domain.interfaces.Order;

import java.util.List;
import java.util.Objects;

public class CommonOrder implements Order {

    private int orderId;

    private List<Dish> listItems;

    public CommonOrder(List<Dish> listItems) {
        this.listItems = listItems;
    }

    @Override
    public int getOrderId() {
        return orderId;
    }

    @Override
    public List<Dish> getListItems() {
        return listItems;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonOrder that = (CommonOrder) o;

        if (orderId != that.orderId) return false;
        return Objects.equals(listItems, that.listItems);
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (listItems != null ? listItems.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommonOrder{" + "orderId=" + orderId + ", listItems=" + listItems + '}';
    }
}


