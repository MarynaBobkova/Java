package main.java.example_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CatLoad {

    public static void main(String[] args) {

        File file = new File("cat");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            Cat cat = (Cat) in.readObject();
            System.out.println(cat);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}