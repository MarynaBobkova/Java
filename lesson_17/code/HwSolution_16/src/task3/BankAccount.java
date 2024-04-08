package task3;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class BankAccount {
    private String accountNumber; // 100
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Создайте метод deposit, который принимает сумму для внесения и увеличивает баланс счета на эту сумму.
    // Создайте метод withdraw, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств.
    // Если сумма для снятия больше баланса, выведите сообщение об ошибке.

    public void deposit(double summ) {
        this.balance += summ;
    }

    public void withdraw(double summ) {
        if (this.balance >= summ) {
            this.balance -= summ;
            System.out.println("Сумма " + summ + " получена");
        } else {
            System.out.println("Не достаточно денег на вашем счету. Текуцщий баланс:" + this.balance);
        }
    }
}
