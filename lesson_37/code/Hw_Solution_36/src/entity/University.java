package entity;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class University {
    private Student[] students = new Student[5]; // храните студентов в этом массиве
    private int studentCount = 0; // счетчик студентов. При добавлении студента увеличить на 1
    //code...

    // напишите статический вложенный клас Student с полями name, age, grade и метод void printInfo()
    // для вывода информации о студенте: "Name: " + name + ", Age: " + age + ", Grade: " + grade

    public static class Student { // nested-class
        private final String name;
        private final int age;
        private int grade;

        public Student(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        public void printInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", grade=" + grade +
                    '}';
        }
    }

    /**
     * метод для добавления студентов в массив
     *
     * @param student
     */
    public void addStudent(Student student) {
        if (student == null) {
            System.out.println("ERROR: Student can not be null!");
            return;
        }

        if (studentCount != students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("ERROR: Student list is full");
        }
    }

    /**
     * метод, который выводит информацию о всех студентах с оценкой выше заданной
     *
     * @param minGrade
     */
    public void printStudentsWithGradeAbove(int minGrade) {
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null && students[i].getGrade() >= minGrade) {
//                System.out.println(students[i]);
//            }
//        }

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGrade() >= minGrade) {
                System.out.println(students[i]);
            }
        }
    }
}
