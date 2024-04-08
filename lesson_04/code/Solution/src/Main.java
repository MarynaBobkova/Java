/**
 * @author Andrej Reutow
 * created on 08.09.2023
 */
public class Main {

    public static void main(String[] args) {
        room1();

//
//        System.out.println("Hello World from room 1"); // 1 - 4
//        System.out.println("Hello World from room 2"); // 2 - 3
//        System.out.println("Hello World from room 3"); // 3 - 2
//        System.out.println("Hello World 2 from room 1"); // 4 - 1
    }

    public static void room1() {
        System.out.println("Hello World from room 1");
        room2();
        System.out.println("Hello World 2 from room 1");
    }

    public static void room2() {
        System.out.println("Hello World from room 2");
    }

    public static void room3() {
        System.out.println("Hello World from room 3");
    }

    public static void noUsedMth() {
        // блок кода
    }
}
