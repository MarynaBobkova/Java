package HW3;
/* здать класс "Банковский счет" с использованием инкапсуляции и реализовать методы для внесения и снятия средств.
Создайте класс с именем "БанковскийСчет" (BankAccount) с приватными полями:
accountNumber (номер счета, строковое значение)
balance (баланс счета, десятичное число с двумя знаками после запятой)
Добавьте конструктор класса, который принимает параметры для номера счета и начального баланса и инициализирует объект при его создании.
Создайте геттеры и сеттеры для номера счета и баланса.
Создайте метод deposit, который принимает сумму для внесения и увеличивает баланс счета на эту сумму.
Создайте метод withdraw, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств.
Если сумма для снятия больше баланса, выведите сообщение об ошибке.
 */

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return  accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    // Создайте метод deposit, который принимает сумму для внесения и увеличивает баланс счета на эту сумму
    public void deposit(double amount) {
        balance += amount;
    }
    // Создайте метод withdraw, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств.
    //Если сумма для снятия больше баланса, выведите сообщение об ошибке.
    public void withdraw(double amount) {
       if(amount <= balance) {
           balance -= amount;
       } else {
           System.out.println("Error");
       }
    }
    public void print(){
        System.out.println("Account " + accountNumber + ", balance: " + balance);
    }
}
