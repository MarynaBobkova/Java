import java.util.Scanner;

//Комплексная задача: Управление складом
//Описание задачи:
//У вас есть склад с товарами. Каждый товар имеет свою стоимость и количество на складе. Студенты должны реализовать следующие функции:
//
//Добавление товара на склад: Пользователь вводит название, стоимость и количество.
//Удаление товара со склада: По названию товара.
//Поиск самого дорогого товара: Вывести название и стоимость.
//Общая стоимость товаров на складе: Подсчет и вывод.
//Сортировка товаров по стоимости: От наименьшей к наибольшей.
//Вывод информации о всех товарах: Название, стоимость, количество.
public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[50];
        int[] productPrices = new int[50];
        int[] productQuantities = new int[50];
        int productCount = 0;

        while (true) {
            System.out.println("1: Добавить товар");
            System.out.println("2: Удалить товар");
            System.out.println("3: Найти самый дорогой товар");
            System.out.println("4: Общая стоимость товаров");
            System.out.println("5: Сортировка товаров по стоимости");
            System.out.println("6: Вывод всех товаров");
            System.out.println("7: Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    // ... (прежний код)
                    break;

                case 2:
                    System.out.println("Введите название товара для удаления:");
                    String nameToDelete = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (productNames[i].equals(nameToDelete)) {
                            for (int j = i; j < productCount - 1; j++) {
                                productNames[j] = productNames[j + 1];
                                productPrices[j] = productPrices[j + 1];
                                productQuantities[j] = productQuantities[j + 1];
                            }
                            productCount--;
                            break;
                        }
                    }
                    break;

                case 3:
                    int maxPrice = Integer.MIN_VALUE;
                    String maxPriceName = "";
                    for (int i = 0; i < productCount; i++) {
                        if (productPrices[i] > maxPrice) {
                            maxPrice = productPrices[i];
                            maxPriceName = productNames[i];
                        }
                    }
                    System.out.println("Самый дорогой товар: " + maxPriceName + " со стоимостью " + maxPrice);
                    break;

                case 4:
                    int totalCost = 0;
                    for (int i = 0; i < productCount; i++) {
                        totalCost += productPrices[i] * productQuantities[i];
                    }
                    System.out.println("Общая стоимость товаров: " + totalCost);
                    break;

                case 5:
                    for (int i = 0; i < productCount; i++) {
                        for (int j = i + 1; j < productCount; j++) {
                            if (productPrices[i] > productPrices[j]) {
                                // Swap prices
                                int temp = productPrices[i];
                                productPrices[i] = productPrices[j];
                                productPrices[j] = temp;

                                // Swap names
                                String tempName = productNames[i];
                                productNames[i] = productNames[j];
                                productNames[j] = tempName;

                                // Swap quantities
                                int tempQuantity = productQuantities[i];
                                productQuantities[i] = productQuantities[j];
                                productQuantities[j] = tempQuantity;
                            }
                        }
                    }
                    break;

                case 6:
                    for (int i = 0; i < productCount; i++) {
                        System.out.println("Название: " + productNames[i] + ", Стоимость: " + productPrices[i] + ", Количество: " + productQuantities[i]);
                    }
                    break;

                case 7:
                    System.out.println("Выход из программы.");
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
