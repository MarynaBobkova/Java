package main.java.example_1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;

public class CatSave {

    public static void main(String[] args) {

        File file = new File("cat.json");

        try (FileWriter writer = new FileWriter(file)) {

            file.createNewFile();

            Cat cat = new Cat(3, "чёрный", 4.56);
            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(writer, cat);
//            mapper.writeValue(file, cat);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}