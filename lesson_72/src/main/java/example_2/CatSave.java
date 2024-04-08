package main.java.example_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class CatSave {

    public static void main(String[] args) {

        try {

            Owner owner = new Owner("Джон", "+1(656) 111-111-12");
            List<Food> foodList = List.of(
                    new Food("Hills", 4),
                    new Food("Purina", 5)
            );
            Cat cat = new Cat(3, "чёрный", 4.56, owner, foodList);
            System.out.println(cat);

            File file = new File("cat1.json");
            file.createNewFile();

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, cat);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}