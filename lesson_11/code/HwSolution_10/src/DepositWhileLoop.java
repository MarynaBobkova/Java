/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Вычисление конечной суммы вклада с учетом процентов (используя цикл while)
 */
public class DepositWhileLoop {
    public static void main(String[] args) {
        float initialDeposit = 100;
        int months = 10;
        float interestRate = 12;
        int currentMonth = 1;

        calculateLoop(initialDeposit, months, interestRate, currentMonth);
        System.out.print("\n-----------------------------------------------\n\n");
        calculateWithoutLoop(initialDeposit, months, interestRate, currentMonth);
    }

    public static void calculateLoop(float initialDeposit,
                                     int months,
                                     float interestRate,
                                     int currentMonth) {

        while (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        System.out.println("Final deposit after " + months + " month: " + initialDeposit);
    }

    public static void calculateWithoutLoop(float initialDeposit,
                                            int months,
                                            float interestRate,
                                            int currentMonth) {

        // 1 месяц
        if (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        // 2 месяц
        if (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        // 3 месяц
        if (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        // 4 месяц
        if (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        // 5 месяц
        if (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        // 6 месяц
        if (currentMonth <= months) {
            System.out.println(currentMonth + " месяц");

            float summ = initialDeposit * (interestRate / 100);
            System.out.println("Сумма начисления " + summ);

            initialDeposit += summ;
            System.out.println("Текущий депозит " + initialDeposit);
            currentMonth++;
        }

        System.out.println("Final deposit after " + months + " month: " + initialDeposit);
    }
}

