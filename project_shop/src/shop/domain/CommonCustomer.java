package shop.domain;

import shop.domain.interfaces.Cart;
import shop.domain.interfaces.Customer;

import java.util.Objects;

public class CommonCustomer implements Customer {
    private int id;
    private boolean isActive;
    private String name;
    private Cart cart;

    public CommonCustomer( String name, Cart cart) {
        this.name = name;
        this.cart = cart;
        this.isActive = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Cart getCart() {
        return cart;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        CommonCustomer that = (CommonCustomer) object;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(cart, that.cart);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cart != null ? cart.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Покупатель: идентификатор - %d, имя - %s, " +
                "активен - %s, содержимое корзины - %s.",
                id, name, isActive ? "да" : "нет",cart);
    }
}
