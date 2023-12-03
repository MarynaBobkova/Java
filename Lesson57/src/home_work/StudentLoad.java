package home_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentLoad {
    public static void main(String[] args) {

        File file = new File("student.txt");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            Student student1 = (Student) in.readObject();
            Student student2 = (Student) in.readObject();
            Student student3 = (Student) in.readObject();

            System.out.println("Readed out file students");
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
