package task3;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 * <p>
 * Цель: Создать класс "Банковский счет" с использованием инкапсуляции и реализовать методы для внесения и снятия средств.
 * <p>
 * Создайте класс с именем "БанковскийСчет" (BankAccount) с приватными полями:
 * <p>
 * accountNumber (номер счета, строковое значение)
 * balance (баланс счета, десятичное число с двумя знаками после запятой)
 * Добавьте конструктор класса, который принимает параметры для номера счета и начального баланса и инициализирует объект при его создании.
 * <p>
 * Создайте геттеры и сеттеры для номера счета и баланса.
 * <p>
 * Создайте метод deposit, который принимает сумму для внесения и увеличивает баланс счета на эту сумму.
 * Создайте метод withdraw, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств. Если сумма для снятия больше баланса, выведите сообщение об ошибке.
 * В методе main создайте объекты класса "BankAccount", инициализируйте их с помощью конструктора и выведите информацию о счетах, балансах и произведите операции по внесению и снятию средств.
 * <p>
 * Попробуйте разные операции с внесением и снятием средств, включая случаи, когда на счету недостаточно средств.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("100", 150.58);
        System.out.println(bankAccount.getAccountNumber()); // 100
        bankAccount.setAccountNumber("5");
        System.out.println(bankAccount.getAccountNumber()); // 5

        System.out.println("Текущий баланс: " + bankAccount.getBalance());

        bankAccount.deposit(100.02);
        System.out.println("Текущий баланс после внесения суммы 100.2: " + bankAccount.getBalance()); // 250.60

        bankAccount.withdraw(250);
        System.out.println("Текущий баланс после снятия суммы 250.60: " + bankAccount.getBalance()); // 0.60

        bankAccount.withdraw(2000);
        System.out.println("Текущий баланс после снятия суммы 2000: " + bankAccount.getBalance()); // 0.60
    }
}