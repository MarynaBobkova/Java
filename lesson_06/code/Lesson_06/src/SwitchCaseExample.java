/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class SwitchCaseExample {
    public static void main(String[] args) {
        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void exampleWithIf() {
        int day = 2;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
