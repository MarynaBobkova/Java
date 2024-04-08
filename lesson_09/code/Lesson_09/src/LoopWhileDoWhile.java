import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 15.09.2023
 */
public class LoopWhileDoWhile {
    public static void main(String[] args) {

        System.out.println("START");
        int counter = 6;

//        while (counter <= 5) {
//            counter += 1;
//            System.out.println("Привет, я while");
//            System.out.println(counter);
//        }

//        do {
//            System.out.println("Привет, я while");
//            System.out.println(counter);
//        } while (counter <= 5);

        int menuPoint = 0;
        Scanner scanner = new Scanner(System.in);
        while (menuPoint != 4) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4 - выйти");
            menuPoint = scanner.nextInt();
            if (menuPoint == 1) {
                System.out.println("Menu point 1");
            }
            if (menuPoint == 2) {
                System.out.println("Menu point 2");
            }
            if (menuPoint == 3) {
                System.out.println("Menu point 3");
            }
            if (menuPoint == 4) {
                System.out.println("вы вышли из меню");
            }
            if (menuPoint > 4) {
                System.out.println("Error!");
            }
        }

        System.out.println("END");
    }
}
