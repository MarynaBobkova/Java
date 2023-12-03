package task_4;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("C:\\AIT\\Lessons\\Lesson56\\src\\test.txt");

            System.out.println((char) in.read());
            int data = in.read();
            while (data != -1) {
                System.out.print((char) data);
                data = in.read();
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
