package student;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int id;
    private String name;
    private double GPA;

    // Конструктор
    public Student(int id, String name, double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // Метод для сортировки массива студентов по GPA и выборки топ-5
    // Реализуйте метод, который сортирует массив студентов по GPA и использует System.arraycopy() для создания нового массива с топ-5 студентами.
    public static Student[] getTopStudents(Student[] students) {
        Arrays.sort(students, Comparator.comparingDouble((Student student) -> student.getGPA()).reversed());
        Student[] topStudents = new Student[5];
        System.arraycopy(students, 0, topStudents, 0, 5);
        return topStudents;
    }

    // Метод для поиска студента с ближайшим GPA
    // Напишите метод, который принимает средний балл и находит студента с ближайшим средним баллом к данному, используя бинарный поиск.
    public static Student findClosestGPA(Student[] students, double targetGPA) {
        // отсортируем массив студентов по GPA
        Arrays.sort(students, Comparator.comparingDouble((Student student) -> student.getGPA()));


        Student template = new Student(0, null, targetGPA);
        int index = Arrays.binarySearch(students, template);

        if (index >= 0) {
            return students[index];
        }

        index = Math.abs(index - 1);

        if (index == students.length) {
            return students[students.length - 1]; // Если нашли точное совпадение GPA
        }
        // Сравнить соседние GPA
        /*
            получает индекс элемента, который находится непосредственно перед позицией, где должен был бы находиться targetGPA,
            если бы он был в массиве. Студент, которого мы получаем на этой позиции (left),
            имеет GPA меньше или равный targetGPA.
         */
        Student left = students[index - 1];
        /*
            позиция, на которую должен был бы вставиться targetGPA. Студент, которого мы получаем на этой позиции (right),
            имеет GPA больше targetGPA.
         */
        Student right = students[index];
        double leftGPA = left.getGPA();
        double rigthGPA = right.getGPA();

        /*
        Выполняется проверка: если абсолютное значение разности между GPA студента с меньшим баллом (left) и targetGPA
        меньше или равно абсолютному значению разности между GPA студента с большим баллом (right) и targetGPA,
        то метод возвращает left. Это означает, что GPA left студента находится ближе к искомому targetGPA
         */
        if (Math.abs(leftGPA - targetGPA) <= Math.abs(rigthGPA - targetGPA)) {
            return left; // Вернуть студента с ближайшим GPA
            /*
            Если условие выше не выполняется, то это означает, что GPA студента right ближе к targetGPA,
             и метод возвращает этого студента.
             */
        } else {
            return right; // Вернуть студента с ближайшим GPA
        }
    }

    // Для удобства вывода информации о студенте
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
