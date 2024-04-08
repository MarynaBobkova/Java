package shop.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    private ProductController productController;
    // Здесь ещё был бы контроллер покупателей

    public MainController(ProductController productController) {
        this.productController = productController;
    }

    public List<Object> sendRequest(String query) {

        try {
            // "2 3"

            String[] parts = query.split(" "); // "2 3" -> ["2", "3"]
            int objectNum = Integer.parseInt(parts[0]); // ["2", "3"] -> "2" -> 2
            int operationNum = Integer.parseInt(parts[1]); // ["2", "3"] -> "3" -> 3

            List<Object> result = new ArrayList<>();

            switch (objectNum) {
                case 1: // Эта ветка для работы с продуктами
                    switch (operationNum) {
                        case 1: // Эта ветка для операции сохранения
                            productController.addProduct();
                            break;
                        case 2: // Эта ветка для операции возврата всех продуктов из БД
                            result.addAll(productController.getAllProducts());
                            break;
                        default:
                            System.out.println("Некорректный ввод!");
                            break;
                    }
                case 2: // Эта ветка для работы с покупателями
                    // Здесь мы бы вызывали контроллер покупателя
                    break;
            }
            return result;
        } catch (Exception e) {
            System.out.println("Произошла ошибка в главном контроллере!");
            throw new RuntimeException(e);
        }
    }
}