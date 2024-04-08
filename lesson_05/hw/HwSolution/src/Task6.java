public class Task6 {
    /*
    Практика
! В каждой задаче все значения могут меняться, и расчет должен быть произведен в любом случае.
Задача 6*: Калькулятор криптовалюты для Васи (CryptoCalculator)
Описание:
У Васи есть 12350 монет криптовалюты. Все монеты он купил по цене 0.27 евро. Сегодня монета стоит 16.38 евро.

Вопросы:
На какую сумму Вася может рассчитывать, если продаст все свои монеты?
Имя метода: calculateTotalValue
Какая прибыль будет у Васи, если он продаст монеты сейчас?
Имя метода: calculateProfit
Сколько монет нужно продать, чтобы получить x прибыль?
Имя метода: coinsForXProfit
Какая стоимость монеты должна быть, чтобы получить x прибыль?
Имя метода: priceForXProfit
Сколько монет нужно по текущему курсу, чтобы получить x сумму?
Имя метода: coinsForXAmount
Cо звёздочкой *:
Всё то же самое, только любой доход облагается налогом. Налог 23%.
Метод: applyTax
Ожидаемый вывод:
Программа должна быть готова к тому, что все значения могут меняться, и расчёт должен быть произведён в любом случае.

Подсказки:
double calculateTotalValue(double initialCoins, double currentPrice)
double calculateProfit(double initialCoins, double initialPrice, double currentPrice)
double coinsForXProfit(double initialCoins, double initialPrice, double currentPrice, double desiredProfit)
double priceForXProfit(double initialCoins, double initialPrice, double desiredProfit)
double coinsForXAmount(double currentPrice, double desiredAmount)
double applyTax(double income)
     */
    public static void main(String[] args) {
        double result = calculateTotalValue(12350, 16.38);
        System.out.println("Если Вася сейчас продаст все свои монеты криптовалюты, то у него получится  " + result + " евро");
        result = calculateProfit(12350, 0.27, 16.38);
        System.out.println("Если Вася сейчас продаст все свои монеты криптовалюты, то получит " + result + " евро прибыли");
        result = coinsForXProfit(12350, 0.27, 16.38, 2000);
        System.out.println("Чтобы получить x прибыли, Васе необходимо продать " + result + " монет");
        result = priceForXProfit(12350, 0.27, 2000);
        System.out.println("Чтобы получить x прибыли, текущая стоимость монеты должна быть " + result + " евро");
        result = coinsForXAmount(16.38, 2000);
        System.out.println("Чтобы получить x сумму, по текущему курсу нужно " + result + " монет");
        result = applyTax(2000);
        System.out.println("Доход, за вычетом налога 23%, составит " + result + " евро");
    }

    public static double calculateTotalValue(double initialNumberOfCoins, double currentPriceOfCoins) {
        return initialNumberOfCoins * currentPriceOfCoins;
    }

    public static double calculateProfit(double initialNumberOfCoins, double initialPriceOfCoins, double currentPriceOfCoins) {
        return (currentPriceOfCoins - initialPriceOfCoins) * initialNumberOfCoins;
    }

    public static double coinsForXProfit(double initialNumberOfCoins, double initialPriceOfCoins, double currentPriceOfCoins, double desiredProfit) {
        double res = calculateProfit(initialNumberOfCoins, initialPriceOfCoins, currentPriceOfCoins);
        return desiredProfit * initialNumberOfCoins / res;
    }

    public static double priceForXProfit(double initialNumberOfCoins, double initialPriceOfCoins, double desiredProfit) {
        return desiredProfit / initialNumberOfCoins + initialPriceOfCoins;
    }

    public static double coinsForXAmount(double currentPriceOfCoins, double desiredAmount) {
        return desiredAmount / currentPriceOfCoins;
    }

    public static double applyTax(double income) {
        return income / 1.23;
    }

}
