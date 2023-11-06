package HW3;
/* В методе main создайте объекты класса "BankAccount",
инициализируйте их с помощью конструктора и выведите информацию о счетах, балансах и произведите операции по внесению и снятию средств.
Попробуйте разные операции с внесением и снятием средств, включая случаи, когда на счету недостаточно средств.

 */

public class Application {
    public static void main(String[] args) {
        BankAccount number1 = new BankAccount("12345", 50200);
        BankAccount number2 = new BankAccount("3545", 378.56);

        number1.print();
        number2.print();
        System.out.println();

        number1.deposit(68);
        number1.print();
        System.out.println();

        number2.withdraw(400);
        System.out.println();

        number2.setBalance(588.60);
        number2.print();

    }
}
