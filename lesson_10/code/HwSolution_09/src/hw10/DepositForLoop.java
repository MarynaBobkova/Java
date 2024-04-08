package hw10;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Вычисление конечной суммы вклада с учетом процентов (используя цикл for)
 */
public class DepositForLoop {
    public static void main(String[] args) {
        float initialDeposit = 100;
        int months = 1;
        float interestRate = 12;

        for (int month = 1; month <= months; month++) {
            initialDeposit += initialDeposit * (interestRate / 100);
        }

        System.out.println("Final deposit after 1 month: " + initialDeposit);
    }
}

