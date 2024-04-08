/**
 * @author Andrej Reutow
 * created on 11.09.2023
 */
public class TaskSolutions {
    // Задача 1: Проверка возраста для покупки алкоголя
    public static void ageVerification(int age) {
        if (age >= 18) {
            System.out.println("You can buy alcohol.");
        } else {
            System.out.println("You cannot buy alcohol.");
        }
    }

    // Задача 2: Подбор одежды в зависимости от температуры
    public static void weatherClothing(int temperature) {
        String clothing = (temperature > 25) ? "Wear light clothes" : "Wear warm clothes";
        System.out.println(clothing);
    }

    // Задача 3: Проверка возраста и наличия билета для просмотра фильма
    public static void movieTicketCheck(int age, boolean hasTicket) {
        if (age >= 18 || hasTicket) {
            System.out.println("You can watch the movie.");
        } else {
            System.out.println("You cannot watch the movie.");
        }
    }

    // Задача 4: Расчет скидки на товары в корзине
    public static void shoppingCartDiscount(double cartTotal, boolean hasCoupon) {
        if (hasCoupon) {
            cartTotal *= 0.95;
        }
        System.out.println("Your total after discount is: " + cartTotal);
    }

    // Задача 5: Проверка возможности посещения вечеринки
    public static void partyAccess(int age, boolean hasInvitation, boolean withFriend) {
        if (age > 18 && (hasInvitation || withFriend)) {
            System.out.println("You can go to the party.");
        } else {
            System.out.println("You cannot go to the party.");
        }
    }

    public static void main(String[] args) {
        // Вызов методов для демонстрации
        ageVerification(25);
        weatherClothing(30);
        movieTicketCheck(16, true);
        partyAccess(19, false, true);
        shoppingCartDiscount(100.0, true);
    }}
