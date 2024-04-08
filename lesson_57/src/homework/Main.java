package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

//        1. Создать файл (при помощи кода, не вручную).
//        2. Записать в файл строку - "Hello, World! I *** study ***** Java!".
//        3. Читать из файла информацию и выводить в консоль.
//        4. После слова Hello пропустить нужное число байт, чтобы подстрока ", World" не была выведена.
//        5. Продолжить вывод так, чтобы выводилось в консоль всё, кроме звёздочек (не при помощи skip).
//        6. Итоговый вывод в консоль должен быть - "Hello! I study Java!".

        try {

            // 1.
            File file = new File("hello.txt");
            file.createNewFile();

            // 2.
            FileWriter writer = new FileWriter(file);
            writer.append("Hello, World! I *** study ***** Java!");
            writer.flush();
            writer.close();

            // 3. 4.
            FileInputStream in = new FileInputStream(file);
            int data = in.read();

            while (true) {
                char output = (char) data;
                System.out.print(output);
                if (output == 'o') {
                    in.skip(7);
                    break;
                }
                data = in.read();
            }

            data = in.read();
            int spaceCounter = 0;

            // 5.
            while (data != -1) {
                char output = (char) data;
                if (output != '*') {
                    if (output == ' ') {
                       if (spaceCounter == 0) {
                           System.out.print(output);
                           spaceCounter++;
                       }
                    } else {
                        System.out.print(output);
                        spaceCounter = 0;
                    }
                }
                data = in.read();
            }

            in.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}