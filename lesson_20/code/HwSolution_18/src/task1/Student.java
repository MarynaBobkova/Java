package task1;

/**
 * @author Andrej Reutow
 * created on 01.10.2023
 */
// Базовый класс Student (Студент)
class Student {
    String name;
    int age;
    double averageGrade;

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void determineStudentStatus() {
        if (averageGrade >= 4.5) {
            System.out.println(name + " - отличник");
        } else if (averageGrade >= 3.0) {
            System.out.println(name + " - хорошист");
        } else {
            System.out.println(name + " - обычный студент");
        }
    }
}


