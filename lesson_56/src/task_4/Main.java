package task_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("C:\\Users\\Андрей\\IdeaProjects\\cohort34.2\\basic_programming\\lesson_56\\src\\test.txt");

//            System.out.println((char) in.read());

            int data = in.read();
            while (data != -1) {
                System.out.print((char) data);
                data = in.read();
            }
            // skip позволяет пропустить определённое количество байт в файле
//            in.skip(5); пропустит пять байт информации в файле

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}