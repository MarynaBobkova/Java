package task_1;

import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        File file = new File("hello.txt");

        // Блок try с ресурсами.
        // Он позволяет не заботиться о том, чтобы закрыть ресурс вручную.
        // При использовании такого блока ресурс будет закрыт автоматически.
        try (FileInputStream in = new FileInputStream(file)) {

            System.out.println((char) in.read());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}