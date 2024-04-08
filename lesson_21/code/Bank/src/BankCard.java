/**
 * Класс для представления банковской карты.
 */
public class BankCard {
    private String cardNumber;
    private double balance;
    private String firstName;
    private String lastName;

    public BankCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // Конструкторы и геттеры/сеттеры


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Метод для сравнения карт по балансу, имени и фамилии владельца.
     *
     * @param otherCard Карта, с которой сравниваем текущую карту.
     * @return true, если карты равны по балансу, имени и фамилии; в противном случае - false.
     */
    @Override
    public boolean equals(Object otherCard) {
        // Реализация метода
        return false;
    }
}
