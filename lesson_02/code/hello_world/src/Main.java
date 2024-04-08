// однострочный комментарий
/*

 */

public class Main {

    public static void main(String... args) {

       /*
        room1();
        room2();
        room3();
        room1();
        room1();
        room2();
        room3();
        */

        /*
        Тут я могу писать комментарий на несколько строк.
        Вот к примеру строка 2
        Вот к примеру строка 3
       */
        System.out.println();

        // Тут выводы в консоль
        System.out.println("I am in room 1"); // тут будет печать в консоль
        System.out.println("I am in room 2"); // Маша, что тут происходит?
        System.out.println("I am in room 3");
        //  System.out.println("I am in room 1");
        //  System.out.println("I am in room 1");
        //  System.out.println("I am in room 2");
        //  System.out.println("I am in room 3");
    }

    public static void room1() {
        System.out.println("I am in room 1");
    }



    public static void room3() {
        System.out.println("I am in room 3");
    }

    public static void room2() {
        System.out.println("I am in room 2");
    }
}
