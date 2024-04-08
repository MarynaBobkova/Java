package l.incorrect;

public class CustomerService {

    public void buyProducts(Customer customer) {
        customer.applyDiscount();
        customer.getProducts().clear();
        System.out.println("Покупка успешна!");
    }
}