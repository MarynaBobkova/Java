package application;

import shop.controllers.MainContoller;
import shop.controllers.ProductController;
import shop.repositoriers.CommonProductRepository;
import shop.repositoriers.interfaces.ProductRepository;
import shop.services.CommonProductService;
import shop.services.interfaces.ProductService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 2слой - репозитории
        ProductRepository repository = new CommonProductRepository();
        //3 слой - сервисы
        ProductService service = new CommonProductService(repository);
        //4 слой - контроллеры
        ProductController productController = new ProductController(service);
        MainContoller mainContoller = new MainContoller(productController);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите объект: \n" +
                    "1. Продукт.\n" +
                    "2. Покупатель.\n" +
                    "0. Завершение работы.");
            int objectNum = Integer.parseInt(scanner.nextLine());

            switch (objectNum) {
                case 1:
                    System.out.println("Выберете опцию:\n" +
                            "1. Сохранение нового продукта\n" +
                            "2. Получение списка всех продуктов.");
                    int operationNum = Integer.parseInt(scanner.nextLine());
                    mainContoller.sendRequest(objectNum + " " + operationNum)
                            .forEach(System.out::println);
                    break;
                case 2:
                case 0:
                    return;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }

    }
}
