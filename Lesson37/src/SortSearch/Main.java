package SortSearch;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[7];
        students[0] = new Student(1, "Ivanov",4.5);
        students[1] = new Student(2, "Ivanova",3.2);
        students[2] = new Student(3, "Petrov",5);
        students[3] = new Student(4, "Petrova",3.5);
        students[4] = new Student(5, "Kozlov",4.5);
        students[5] = new Student(6, "Kozlova",4);
        students[6] = new Student(7, "Nosov",3);

        Arrays.sort(students);
        System.out.println("Список студентов: " + Arrays.toString(students));
        System.out.println();

        Student[] studentsTop = new Student[5];
        System.arraycopy(students,0,studentsTop,0,studentsTop.length);
        System.out.println("Список Top-студентов: " + Arrays.toString(studentsTop));

        double gpaSearch = 3.25;
        Student searchResult = students[0];
        for (int i = 0; i < students.length ; i++) {
           double currentStudentsGpaDifference = abs(gpaSearch - students[i].getGpa());
           double searchResultGpaDifference = abs(gpaSearch - searchResult.getGpa());
            if (currentStudentsGpaDifference < searchResultGpaDifference) {
               searchResult = students[i];
            }
        }
        System.out.println(searchResult);
    }
}
