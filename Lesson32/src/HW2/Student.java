package HW2;
// Создайте класс Student с полями name и grade. Реализуйте для него интерфейс Comparable так, чтобы студенты сортировались по оценкам.
//
//создайте массив студентов и отсортируйте используя Arrays.sort()
//Напоминалка
//       // Сортируем массив студентов, для сортировки используется имлементация интерфейса в классе Student
//        Arrays.sort(studends);

public class Student implements java.lang.Comparable <Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {

        return this.grade - other.grade;
    }

    @Override
    public String toString() {
        return "Student " +
                "name= " + name +
                ", grade= " + grade;
    }
}
