package task_1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three!");

        System.out.println();

        System.out.println("One!");
        System.out.println("Two!");
        System.out.println("Three!");

        System.out.println();

        System.out.println("One!\nTwo!\nThree!");

        System.out.println();

        System.out.printf("One!\nTwo!\nThree!\n");

        System.out.println();

        System.out.printf("One!%nTwo!%nThree!%n");

        System.out.println();

        System.out.println("One!%nTwo!%nThree!%n");

        System.out.println();

        int a = 4;
        int b = 7;
        // Сумма чисел 3 и 5 равна 8.
        System.out.printf("Сумма чисел %d и %d равна %d.%n", a, b, a + b);

        System.out.println();

        String hello = "Привет всем!";

        System.out.printf("Подставляем строку - %s - строка подставлена.%n", hello);

        System.out.println();

        System.out.printf("Подставляем строку - %.8s - строка подставлена.%n", hello);

        System.out.println();

        double pi = Math.PI;
        System.out.printf("Число ПИ равно %f.%n", pi);
        System.out.printf("Число ПИ округлённое равно %.3f.%n", pi);

        System.out.println();

        boolean bool = true;
        System.out.printf("Логическое значение равно %b.%n", bool);
        System.out.printf("Переменная а больше, чем переменная b? - %b.%n", a > b);
        System.out.printf("Переменная а меньше, чем переменная b? - %B.%n", a < b);

        System.out.println();

        char ch = 'w';
        System.out.printf("Подставляем символ - %c - символ подставлен.%n", ch);
        System.out.printf("Подставляем символ - %C - символ подставлен.%n", ch);

        System.out.println();

        double d1 = 123.456;
        double d2 = 123456.7890123;
        System.out.printf("%50.3f%n",d1);
        System.out.printf("%50.7f%n", d2);
        System.out.printf("%50.5f%n", d2);

        System.out.println();

        Date date = new Date();
        System.out.println(date);
        System.out.printf("Отформатированная дата - %tT.%n", date);
        System.out.printf("Отформатированная дата - %tH.%n", date);
        System.out.printf("Отформатированная дата - %tB.%n", date);

        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS.%n", date, date, date);
        System.out.printf("Сегодня %td %tB %tY года, время - %tH часов, %tM минут.%n",
                date, date, date, date, date);

        System.out.printf("Сегодня %1$td %1$tB %1$tY года, время - %1$tH часов, %1$tM минут.%n",
                date);
    }
}