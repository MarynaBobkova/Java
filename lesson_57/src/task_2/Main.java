package task_2;

import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        File file = new File("hello.txt");

        try (FileInputStream in = new FileInputStream(file)) {

            System.out.printf("В файле осталось %d непрочитанных байт.%n", in.available());

            for (int i = 0; i < 5; i++) {
                System.out.print((char) in.read());
            }
            System.out.println();

            System.out.printf("В файле осталось %d непрочитанных байт.%n", in.available());

            System.out.println("Пропускаем 10 байт.");
            in.skip(10);

            System.out.printf("В файле осталось %d непрочитанных байт.%n", in.available());

            System.out.println("Считываем оставшиеся байты.");
            while (in.available() != 0) {
                System.out.print((char) in.read());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}