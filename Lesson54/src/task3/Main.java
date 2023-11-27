package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jack");
        Student student3 = new Student(3, "Bob");

        student1.addBooks("Java basic");
        student1.addBooks("Java pro");
        student1.addBooks("Spring");
        student1.addBooks("Python");

        student2.addBooks("HTML");
        student2.addBooks("CSS");
        student2.addBooks("JavaScript");
        student2.addBooks("Spring");

        student3.addBooks("Python");
        student3.addBooks("C++");
        student3.addBooks("C#");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Вывести список всех книг, прочитанных студентами,
        // и не содержащих подстроку "Java".

        Set<String> books = students.stream() // стрим студентов
                .flatMap(x -> x.getBooks().stream()) // стрим Стрингов (книг)
                .filter(x -> !x.contains("Java")) //
                .collect(Collectors.toSet());

        System.out.println(books);


    }


}
