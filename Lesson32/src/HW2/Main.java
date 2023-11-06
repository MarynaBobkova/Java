package HW2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student [] students = {
              new Student("Ivan", 4),
              new Student("Maria", 4),
              new Student("Gleb", 5),
              new Student("Nikolai", 3),

        };
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
