/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class LogicalOperator {

    public static void main(String[] args) {
        int age = 19;
        boolean hasTicket = false;

        if (checkAge(age) || checkTicket(false)) {
            System.out.println("Person is " + age + " year old and has ticket " + hasTicket);
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
