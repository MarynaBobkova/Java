package l.correct;

public class Main {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        System.out.println("Привилегированный клиент");
        Customer customer = new PrivilegedCustomer(22);
        service.buyProducts(customer);
        System.out.println();

        System.out.println("VIP клиент");
        Customer customer1 = new VipCustomer(22);
        service.buyProducts(customer1);
        System.out.println();

        System.out.println("Новый клиент");
        Customer customer2 = new NewCustomer(22);
        service.buyProducts(customer2);
    }
}
