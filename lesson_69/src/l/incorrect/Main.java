package l.incorrect;

public class Main {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        Customer customer = new Customer(25);
        service.buyProducts(customer);

        Customer customer1 = new PrivilegedCustomer(25);
        service.buyProducts(customer1);

        Customer customer2 = new NewCustomer(25);
        service.buyProducts(customer2);
    }
}