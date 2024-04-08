package solution;

//Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 200 евро,
// то полагается дополнительная скидка 10%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.
public class DiscountCalculatorWithConstant {

    static final int DISCOUNT_SUM = 200;
    static final double DISCOUNT_AMOUNT = 0.1;

    public static void main(String[] args) {
        double priceA = 30.0;
        double priceB = 60.0;

        double discountA = 50.0;
        double discountB = 25.0;

        int quantityA = 3;
        int quantityB = 2;

        double totalCost = calculateTotalPrice(priceA, discountA, quantityA, priceB, discountB, quantityB);
        System.out.println("Итоговая стоимость покупки: " + totalCost + " евро"); // 152.6175

        double discountAmount = calculateDiscount(priceA, discountA, quantityA, priceB, discountB, quantityB);
        System.out.println("Размер полученной скидки: " + discountAmount + " евро");
    }

    // Метод для вычисления общей стоимости покупки
    public static double calculateTotalPrice(double priceA,
                                             double discountA,
                                             int quantityA,
                                             double priceB,
                                             double discountB,
                                             int quantityB) {
        double totalCost = (priceA * quantityA) + (priceB * quantityB);
//        totalCost = totalCost - (totalCost * (discountA / 100.0));
//        totalCost = totalCost - (totalCost * (discountB / 100.0));

        totalCost -= (totalCost * (discountA / 100.0));
        totalCost -= (totalCost * (discountB / 100.0));

        if (totalCost > DISCOUNT_SUM) {
//            totalCost = totalCost - (totalCost * 0.05);
            totalCost -= totalCost * DISCOUNT_AMOUNT;
        }

        return totalCost;
    }

    // Метод для вычисления размера полученной скидки
    public static double calculateDiscount(double priceA,
                                           double discountA,
                                           int quantityA,
                                           double priceB,
                                           double discountB,
                                           int quantityB) {
        double totalCost = (priceA * quantityA) + (priceB * quantityB);
        double discountAmount = (priceA * quantityA * (discountA / 100.0)) + (priceB * quantityB * (discountB / 100.0));

        if (totalCost > DISCOUNT_SUM) {
//            discountAmount = discountAmount + (totalCost * 0.05);
            discountAmount += totalCost * DISCOUNT_AMOUNT;
        }

        return discountAmount;
    }

}
