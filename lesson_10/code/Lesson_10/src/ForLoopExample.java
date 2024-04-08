/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */
public class ForLoopExample {
    public static void main(String[] args) {
//        task1(5);
//        task1For(5);

//        task2For(20);

//        task3(3);
        task4(5);
    }

    // вывести числа от 0 до numberMax
    public static void task1(int numberMax) {
        int counter = 0;
        while (counter <= numberMax) {
            System.out.println(counter);
            counter++;
        }
    }

    // вывести числа от 0 до numberMax
    public static void task1For(int numberMax) {
        for (int counter = 0; counter <= numberMax; counter++) {
            System.out.println(counter);
        }

        // int counter = 0;
        //  while (counter <= numberMax) {
        //      System.out.println(counter);
        //      counter++;
        //  }
    }

    // вывести числа от numberMax до 0
    // 5 4 3 2 1 0
    public static void task2For(int numberMax) {
        for (int counter = numberMax; counter >= 0; counter--) {
            System.out.println(counter);
        }
    }

    //вывести на экран таблицу умножения на n:
    //  Если n = 3
    //    3*1=3
    //    3*2=6
    //    3*3=9
    //    3*4=12
    //    3*5=15
    //    3*6=18
    //    3*7=21
    //    3*8=24
    //    3*9=27
    //    3*10=30
    public static void task3(int a) { // a = 3
//        for (int counter = 1; counter <= 10; counter++) {
//            System.out.println(a * counter);
//        }
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Таблица умножения для числа " + a);
            int result = a * counter;
            System.out.println(a + " * " + counter + " = " + result);
        }
    }

    //Напишите программу, где пользователь вводит любое целое положительное число.
    //А программа суммирует все числа от 1 до введенного пользователем числа.
    //Например:
    //если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
    //если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.
    public static void task4(int numberMax) { //  numberMax - до введенного пользователем числа = 3
        int result = 0;

        // counter = 1, numberMax = 3
        // 1 <= 3 - true
        // 1 + 0 = 1; (result = counter + result )

        // counter = 2, numberMax = 3
        // 2 <= 3 - true
        // 2 + 1 = 3; (result = counter + result )

        // counter = 3, numberMax = 3
        // 3 <= 3 - true
        // 3 + 3 = 6; (result = counter + result )

        // counter = 4, numberMax = 3
        // 4 <= 3 - false
        // выход

        for (int counter = 1; counter <= numberMax; counter++) {
            System.out.println("Итерация: " + counter);
            System.out.println("Результат до вычисления: " + result);
            result += counter;
            System.out.println("Результат после вычисления: " + result);
        }
        System.out.println("Общий результат вычисления: " + result);
    }
}
