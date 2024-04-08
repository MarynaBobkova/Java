// Создаем класс BankCard
public class BankCard {
    private int cardNumber;
    private double balance;
    private String firstName;
    private String lastName;

    // Конструктор для создания карты
    public BankCard(String firstName, String lastName) {
        this.cardNumber = 0; // Номер карты при создании пустой
        this.balance = 0.0;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Метод для установки номера карты на основе имени и фамилии владельца
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Метод для сравнения карт по балансу, имени и фамилии владельца
    public boolean equals(BankCard otherCard) {
        return this.balance == otherCard.balance &&
                this.firstName.equals(otherCard.firstName) &&
                this.lastName.equals(otherCard.lastName);
    }

    public int getCardNumber() {
        return cardNumber;
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
}
