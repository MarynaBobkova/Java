package hw;

/**
 * @author Andrej Reutow
 * created on 18.09.2023
 */

// С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n
public class Hw09Task2 {

    public static void main(String[] args) {
        int fromNumber = 1; // 1 2 3 ... 3 ^ 3
        int toNumber = 4; // заданное число n

//        if (fromNumber <= toNumber) {
//            System.out.println("Number " + fromNumber + " in cube, result: " + (fromNumber * fromNumber * fromNumber)); // 1 итерация
//            fromNumber += 1; // 2
//        }
//
//        if (fromNumber <= toNumber) {
//            System.out.println("Number " + fromNumber + " in cube, result: " + (fromNumber * fromNumber * fromNumber)); // 2 итерация
//            fromNumber += 1; // 3
//        }
//
//        if (fromNumber <= toNumber) {
//            System.out.println("Number " + fromNumber + " in cube, result: " + (fromNumber * fromNumber * fromNumber)); // 2 итерация
//            fromNumber += 1;
//        }

        extracted(fromNumber, toNumber);
    }

    private static void extracted(int fromNumber, int toNumber) {
//        while (fromNumber <= toNumber) {
//            System.out.println("Number " + (fromNumber++) + " in cube, result: " + (fromNumber * fromNumber * fromNumber)); // 1 итерация
////            fromNumber += 1;
////            fromNumber++;
//        }
        System.out.println("#########################");

//        while (fromNumber < toNumber) {
//            System.out.println("Number " + (++fromNumber) + " in cube, result: " + (fromNumber * fromNumber * fromNumber)); // 1 итерация
////            fromNumber += 1;
////            fromNumber++;
//        }

        while (fromNumber <= toNumber) {
            System.out.println("Number " + fromNumber + " in cube, result: " + (fromNumber * fromNumber * fromNumber)); // 1 итерация
//          fromNumber += 1;
            fromNumber++;
        }
    }
}
