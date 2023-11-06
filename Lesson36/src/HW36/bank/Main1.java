package HW36.bank;
//Описание:
//Создайте класс BankAccount, который имеет внутренний класс Transaction.
// Внутренний класс должен хранить информацию о транзакции (сумма, дата, тип транзакции).
//
//Дополнительные условия:
//
//В классе BankAccount создайте методы для внесения и снятия денег, которые также создают объекты транзакций.
//Добавьте возможность просмотра истории транзакций.

import HW36.bank.BankAccount;

public class Main1 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(new BankAccount.Transaction[10], 0, 0);
        account.deposit(200);
        account.withdraw(50);

        account.printTransactionHistory();
    }
}

