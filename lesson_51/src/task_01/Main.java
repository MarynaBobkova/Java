package task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Сергей", 25, 3, 4.76, Degree.MASTER));
        students.add(new Student("Дмитрий", 32, 2, 4.23, Degree.BACHELOR));
        students.add(new Student("Надежда", 25, 3, 4.71, Degree.MASTER));
        students.add(new Student("Алексей", 21, 1, 4.12, Degree.BACHELOR));
        students.add(new Student("Александра", 23, 4, 4.94, Degree.BACHELOR));
        students.add(new Student("Макар", 29, 1, 4.51, Degree.MASTER));
        students.add(new Student("Степан", 31, 5, 3.98, Degree.MASTER));

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        // Фильтруем студентов: курс и балл
        // курс >= 3, балл >= 4.5

        System.out.println("Фильтруем студентов по курсу и баллу:");
        StudentService.printStudents(students, new FirstStudentFilter());
        System.out.println();

        // возраст и степень
        // старше 23 и магистр
        System.out.println("Фильтруем студентов по возрасту и степени:");
        Filter secondFilter = new SecondStudentFilter();
        StudentService.printStudents(students, secondFilter);
        System.out.println();

        // курс и имя
        // имя длиннее 6 символов и нечётный курс

        System.out.println("Фильтруем студентов по имени и курсу:");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() > 6 && student.getCourse() % 2 != 0;
            }
        });
        System.out.println();

        // имя начинается с А и возраст больше или равен 23
        System.out.println("Фильтруем студентов по имени и возрасту:");
        StudentService.printStudents(students, x -> x.getName().startsWith("А") && x.getAge() >= 23);
    }
}