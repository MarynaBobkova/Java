package HW36;
// Описание:
//Создайте класс University, внутри которого будет статический вложенный класс Student.
// ложенный класс должен иметь поля name, age и grade (оценка), а также методы для вывода информации о студенте и изменения его оценки.
//
//Дополнительные условия:
//
//Создайте во внешнем классе University метод для добавления студентов в массив.
//Создайте метод, который выводит информацию о всех студентах с оценкой выше заданной.


class University {
    private Student[] students = new Student[10]; // храните студентов в этом массиве
    private int studentCount = 0; // счетчик студентов. При добавлении студента увеличить на 1
    //code...

// напишите статический вложенный клас Student с полями name, age, grade и метод void printInfo() для вывода информации
// о студенте: "Name: " + name + ", Age: " + age + ", Grade: " + grade
    public static class Student{
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name:" + name +
                ", age " + age +
                ", grade: " + grade;
    }
}

    /**
     * метод для добавления студентов в массив
     * @param student
     */
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                studentCount++;
                return;
            }
        }
    }

    /**
     * метод, который выводит информацию о всех студентах с оценкой выше заданной
     * @param minGrade
     */
    public void printStudentsWithGradeAbove(int minGrade) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getGrade() > minGrade){
                System.out.println("Студент: " + students[i].getName() + ", оценка: " + students[i].getGrade());
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        University university = new University();
        University.Student student1 = new University.Student("Alex", 20, 85);
        University.Student student2 = new University.Student("Maria", 21, 90);
        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println("Students with grade above 80:");
        university.printStudentsWithGradeAbove(80);
    }
}




