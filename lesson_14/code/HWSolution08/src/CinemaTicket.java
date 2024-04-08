/**
 * @author Andrej Reutow
 * created on 21.09.2023
 *
 * <p>
 * В кинотеатре есть разные типы билетов: стандартный, студенческий и для пенсионеров. Каждый тип билета имеет свою
 * стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета.
 * Требования:
 * Создать метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места.
 * Использовать if-else и & для определения стоимости билета.
 * </p>
 */
public class CinemaTicket {
    public static void main(String[] args) {
        System.out.println("Цена билета: " + calculateTicketPrice(25, false, true));
        System.out.println("Цена билета: " + calculateTicketPrice(17, false, false));
        System.out.println("Цена билета: " + calculateTicketPrice(65, false, false));
        System.out.println("Цена билета: " + calculateTicketPrice(20, true, false));
    }

    public static int calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        int price = 0;

        if (age < 18) {
            price = 100;
        } else if (age >= 18 && age <= 64) {
            if (isStudent) {
                price = 150;
            } else {
                price = 200;
            }
        } else {
            price = 150;
        }

        if (isVip) {
            price += 50;
        }

        return price;
    }
}

