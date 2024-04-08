package restaraunt.domain;

import restaraunt.domain.interfaces.Client;
import restaraunt.domain.interfaces.Order;

import java.util.Objects;

public class CommonClient implements Client {

    private int id;
    private String lastname;

    private Order order;

    public CommonClient(String lastname) {
        this.lastname = lastname;

    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getClientByLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonClient that = (CommonClient) o;

        if (id != that.id) return false;
        return Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Client: ID - %d, Lastname - %s.", id, lastname);
    }
}