package d.correct;

public class Main {

    public static void main(String[] args) {

        ProductRepositoryList repository = new ProductRepositoryList();
//        ProductRepositoryMap repository = new ProductRepositoryMap();

        ProductService service = new ProductService(repository);

        System.out.println(service.getAll());
        System.out.println(service.getByName("Banana"));
    }
}