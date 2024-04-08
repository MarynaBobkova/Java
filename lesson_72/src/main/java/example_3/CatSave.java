package main.java.example_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CatSave {

    public static void main(String[] args) {

        File file = new File("cat");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {

            Cat cat = new Cat(3, "чёрный", 4.56);
            out.writeObject(cat);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}