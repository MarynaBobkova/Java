package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sergey", 25, 3, 4.76, Degree.MASTER));
        students.add(new Student("Dmitriy", 32, 2, 4.23, Degree.BACHELOR));
        students.add(new Student("Nadia", 25, 3, 4.71, Degree.MASTER));
        students.add(new Student("Alex", 21, 1, 4.12, Degree.BACHELOR));
        students.add(new Student("Alexandra", 23, 4, 4.94, Degree.BACHELOR));
        students.add(new Student("Makar", 29, 1, 4.51, Degree.MASTER));
        students.add(new Student("Stepan", 31, 5, 3.98, Degree.MASTER));
        students.add(new Student("Maria", 18, 1, 4.20, Degree.BACHELOR));
        students.add(new Student("Mark", 30, 5, 3.00, Degree.MASTER));

        System.out.println("Список всех студентов: ");
        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println();

        // Фильтр студентов по курсу и баллу
        // курс >= 3 балл >=4.5
        System.out.println("Фильтруем студентов по курсу и баллу:");
        StudentService.printStudents(students, new FirstStudentFilter());
        System.out.println();

        // возраст и степень
        // > 23 Master
        System.out.println("Фильтруем студентов по возрасту и степени:");
        StudentService.printStudents(students, new SecondStudentFilter());
        System.out.println();

        // курс и имя
        // имя диннее 5 и нечетный курс
        System.out.println("Фильтруем студентов по имени и курсу: ");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() > 5 && student.getCourse() % 2 != 0;
            }
        });
        System.out.println();


        // имя с А и возраст >=23
        System.out.println("Фильтруем студентов по имени и возрасту: ");
        StudentService.printStudents(students, x -> x.getName().startsWith("A") && x.getAge() >= 23);
        System.out.println();

        //HOME WORK

        // 1 курс и возраст до 25
        System.out.println("Фильтруем студентов по курсу и возрасту:");
        StudentService.printStudents(students, new ThirdStudentFilter());
        System.out.println();

        // курс 1-4 степень бакалавр
        System.out.println("Фильтруем студентов 1-4 курсов по степени бакалавр: ");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() < 5 && student.getDegree().equals(Degree.BACHELOR);
            }
        });
        System.out.println();

        // курс 5 курс -  степень магистр
        System.out.println("Фильтруем студентов 5 курсов по степени магистр: ");
        StudentService.printStudents(students, x -> x.getCourse() == 5 && x.getDegree().equals(Degree.MASTER));
    }
}
