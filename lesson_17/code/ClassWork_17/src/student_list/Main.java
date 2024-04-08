package student_list;

import java.util.Random;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Main {

    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = new Student[10];
        students[0] = new Student("Анна");
        students[1] = new Student("Иван");
        students[2] = new Student("Мария");
        students[3] = new Student("Петр");
        students[4] = new Student("Елена");
        students[5] = new Student("Алексей");
        students[6] = new Student("Ольга");
        students[7] = new Student("Дмитрий");
        students[8] = new Student("София");
        students[9] = new Student("Артем");

        // Устанавливаем флаги присутствия
        students[1].setPresent(false);
        students[3].setPresent(false);
        students[5].setPresent(false);
        students[7].setPresent(false);
        students[9].setPresent(false);


        Student randomStudent = getRandomStudent(students);
        System.out.println("Случайный студент для ответа: " + randomStudent.getName());

        // Студент отвечает
        randomStudent.giveAnswer();

        // Выводим количество ответов студента
        System.out.println("Студент " + randomStudent.getName() + " ответил " + randomStudent.getAnswerCount() + " раз.");
    }

    public static Student getRandomStudent(Student[] students) {

        // Выбираем случайного студента для ответа
        Random random = new Random();
        Student randomStudent;
        randomStudent = students[random.nextInt(students.length)];

        return randomStudent;
    }

    public static void printStudentsNotPresent(Student[] students){
        // Выводим имена студентов, которые не присутствовали
        System.out.println("Список студентов, которые не присутствовали:");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (!student.isPresent()) {
                System.out.println(student.getName());
            }
        }
    }
}
