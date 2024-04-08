package task_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CatLoad {

    public static void main(String[] args) {

        File file = new File("cat.txt");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            Cat cat1 = (Cat) in.readObject();
            Cat cat2 = (Cat) in.readObject();

            System.out.println("Прочитанные из файла коты:");
            System.out.println(cat1);
            System.out.println(cat2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}