package scileton;

import java.util.Objects;

/**
 * Класс для представления банковской карты.
 */
public class BankCard {
    private int cardNumber;
    private double balance;
    private String firstName;
    private String lastName;

    // Конструкторы и геттеры/сеттеры

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
