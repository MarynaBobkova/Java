package hw10;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Вычисление конечной суммы вклада с учетом процентов (используя цикл while)
 */
public class DepositWhileLoop {
    public static void main(String[] args) {
        float initialDeposit = 100;
        int months = 1;
        float interestRate = 12;
        int currentMonth = 1;

        while (currentMonth <= months) {
            initialDeposit += initialDeposit * (interestRate / 100);
            currentMonth++;
        }

        System.out.println("Final deposit after 1 month: " + initialDeposit);
    }
}

