package home_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSave {
    public static void main(String[] args) {
        File file = new File("student.txt");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true))){
            Student student1 = new Student("Maria", 20, 001);
            Student student2 = new Student("Marko", 17, 002);
            Student student3 = new Student("Marly", 28, 003);

            System.out.println("Created students: ");
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);

            file.createNewFile();

            out.writeObject(student1);
            out.writeObject(student2);
            out.writeObject(student3);

        } catch (Exception e){

        }
    }
}
