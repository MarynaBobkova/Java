package d.incorrect;

public class Main {

    public static void main(String[] args) {

        ProductRepositoryList repository = new ProductRepositoryList();
        ProductService service = new ProductService(repository);

        System.out.println(service.getAll());
        System.out.println(service.getByName("Banana"));
    }
}