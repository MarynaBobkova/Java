import entity.University;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */

/*
Задача 1: Использование статического вложенного класса
Описание:
Создайте класс University, внутри которого будет статический вложенный класс Student.
Вложенный класс должен иметь поля name, age и grade (оценка), а также методы для вывода информации о студенте и изменения его оценки.

Дополнительные условия:

Создайте во внешнем классе University метод для добавления студентов в массив.
Создайте метод, который выводит информацию о всех студентах с оценкой выше заданной.
 */
public class Task1 {

    public static void main(String[] args) {
        University.Student studentAndrej = new University.Student("Andrej", 35, 5);
        University.Student studentPetja = new University.Student("Petja", 33, 3);
        University.Student studentVasja = null;

        University university = new University();

        university.addStudent(studentAndrej);
        university.addStudent(studentPetja);
        university.addStudent(studentVasja);
        university.addStudent(null);

        studentAndrej.printInfo();
        studentPetja.printInfo();
        studentVasja.printInfo();


        System.out.println();
        university.printStudentsWithGradeAbove(3);

        System.out.println();
        university.printStudentsWithGradeAbove(4);

        System.out.println();
        university.printStudentsWithGradeAbove(5);
    }

}
