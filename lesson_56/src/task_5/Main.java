package task_5;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("test_file.txt");
            System.out.println("Существует ли указанный файл? - " + file.exists());
            file.createNewFile();
            System.out.println("Существует ли указанный файл? - " + file.exists());

            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(file);

            out.write('w');

            FileWriter writer = new FileWriter(file);
            writer.append("This is a test information!");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}