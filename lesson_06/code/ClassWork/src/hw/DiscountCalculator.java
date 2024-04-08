package hw;

/**
 * Задача 2: Расчет покупки товаров со скидками
 * Задача: Сделайте расчет покупки товаров со скидками.
 * Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
 * Клиент взял N товаров A и M товаров B.
 * Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
 * Вычислите итоговую стоимость покупки и величину полученной скидки.
 */
public class DiscountCalculator {
    public static void main(String[] args) {
        double priceA = 30.0;
        double discountA = 10.0;
        double priceB = 40.0;
        double discountB = 15.0;
        int quantityA = 3;
        int quantityB = 2;

        double totalCost = calculateTotalCost(priceA, discountA, priceB, discountB, quantityA, quantityB);

        System.out.println("Итоговая стоимость покупки: " + totalCost + " евро");
        double discountAmount = calculateDiscount(priceA, discountA, priceB, discountB, quantityA, quantityB);
        System.out.println("Размер полученной скидки: " + discountAmount + " евро");
    }

    // Метод для вычисления общей стоимости покупки
    public static double calculateTotalCost(double priceA, double discountA, double priceB, double discountB, int quantityA, int quantityB) {
        double totalCost = (priceA * quantityA) + (priceB * quantityB);
        totalCost -= (totalCost * (discountA / 100.0));
        totalCost -= (totalCost * (discountB / 100.0));

        if (totalCost > 100.0) {
            totalCost -= (totalCost * 0.05);
        }

        return totalCost;
    }

    // Метод для вычисления размера полученной скидки
    public static double calculateDiscount(double priceA, double discountA, double priceB, double discountB, int quantityA, int quantityB) {
        double totalCost = (priceA * quantityA) + (priceB * quantityB);
        double discountAmount = (priceA * quantityA * (discountA / 100.0)) + (priceB * quantityB * (discountB / 100.0));

        if (totalCost > 100.0) {
            discountAmount += (totalCost * 0.05);
        }

        return discountAmount;
    }
}


