package task_1;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        // Блок трай с ресурсами
        // он позволяет не заботиться о том, чтобы закрыть ресурс вручную
        // при использовании такого блока ресурс будет закрыт автоматически

        File file = new File("homework.txt");
        try (FileInputStream in = new FileInputStream(file)) {

            System.out.println((char) in.read());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
