package HW36.bank;

import java.util.Date;

// создайте внутренний класс Transaction
public class BankAccount {

    private Transaction[] transactions = new Transaction[10];
    private int transactionCount = 0;
    private double balance = 0;

    public BankAccount(Transaction[] transactions, int transactionCount, double balance) {
        this.transactions = transactions;
        this.transactionCount = transactionCount;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        if (transactionCount < transactions.length - 1) {
            transactions[transactionCount++] = new Transaction(amount, "deposit", new Date());
        } else {
            System.out.println("error");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        }
        if (transactionCount < transactions.length - 1) {
            transactions[transactionCount++] = new Transaction(amount, "withdraw", new Date());
        } else {
            System.out.println("error");
        }

    }

    public void printTransactionHistory() {
        System.out.println("Transaction History: ");
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i]!= null) {
                System.out.println("Amount " + transactions[i].getAmmount()
                        + ", type of transaction " + transactions[i].getTypeTransaction()
                        + ", date " + transactions[i].getDate());
            }
        }
    }


    class Transaction {
        double ammount;
        Date date;
        String typeTransaction;

        public Transaction(double ammount, String typeTransaction, Date date) {
            this.ammount = ammount;
            this.date = date;
            this.typeTransaction = typeTransaction;
        }

        public double getAmmount() {
            return ammount;
        }

        public void setAmmount(double ammount) {
            this.ammount = ammount;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTypeTransaction() {
            return typeTransaction;
        }

        public void setTypeTransaction(String typeTransaction) {
            this.typeTransaction = typeTransaction;
        }

    }

}
