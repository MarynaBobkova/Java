public class CryptoCalculator {

    public static double calculateTotalValue(double coinCount, double currentPrice) {
        return coinCount * currentPrice;
    }

    public static double calculateProfit(double coinCount, double currentPrice, double purchasePrice) {
        return calculateTotalValue(coinCount, currentPrice) - (coinCount * purchasePrice);
    }

    public static void main(String[] args) {
        double coinCount = 12350;
        double purchasePrice = 0.27;
        double currentPrice = 16.38;

        double totalValue = calculateTotalValue(coinCount, currentPrice);
        double profit = calculateProfit(coinCount, currentPrice, purchasePrice);

        System.out.println("Total Value: " + totalValue);
        System.out.println("Profit: " + profit);
    }
}
