package task_3;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Скопировать содержимое файла hello.txt в другой файл.
        try {
            copyFile("hello.txt", "target.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void copyFile(String source, String target) throws FileNotFoundException {

        File sourceFile = new File(source);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Указанный файл-источник не существует!");
        }

        File targetFile = new File(target);

        try (FileInputStream in = new FileInputStream(sourceFile);
             FileWriter out = new FileWriter(targetFile, true)) {

            targetFile.createNewFile();

            while (in.available() != 0) {
                out.write(in.read());
            }

            out.write("\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}