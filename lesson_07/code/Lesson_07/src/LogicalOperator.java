/**
 * @author Andrej Reutow
 * created on 13.09.2023
 */
public class LogicalOperator {
    public static void main(String[] args) {
        // true && true
        if (checkAge(19) || checkTicket(true)) {
            System.out.println("Person is year old and has ticket true");
        }

        // false && false
        if (checkAge(10) || checkTicket(false)) {
            System.out.println("Person is 10 year old and has ticket false");
        }

        // false && true
        if (checkAge(10) || checkTicket(true)) {
            System.out.println("Person is 10 year old and has ticket true");
        }

        // true && false
        if (checkAge(30) || checkTicket(false)) {
            System.out.println("Person is 30 year old and has ticket false");
        }
    }

    public static boolean checkAge(int age) {
        System.out.println("Check age");
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTicket(boolean hasTicket) {
        System.out.println("Check ticket");
        if (hasTicket) {
            return true;
        } else {
            return false;
        }
    }
}
