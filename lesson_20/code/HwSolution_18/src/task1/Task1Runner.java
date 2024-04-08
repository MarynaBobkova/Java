package task1;

/**
 * @author Andrej Reutow
 * created on 01.10.2023
 * <p>
 * Создайте базовый класс Student (Студент) с атрибутами имя, возраст и средний балл. Затем создайте два подкласса: HighSchoolStudent (Старшеклассник) и CollegeStudent (Студент колледжа).
 * <p>
 * Добавьте методы в базовый класс для вычисления статуса студента на основе среднего балла.
 * Например, если средний балл больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.
 * <p>
 * Создайте несколько объектов разных классов студентов и вызовите методы для определения их статуса.
 */
public class Task1Runner {
    public static void main(String[] args) {
        // Создаем объекты разных классов студентов
        Student student1 = new Student("Иван", 17, 4.8);
        HighSchoolStudent student2 = new HighSchoolStudent("Мария", 18, 3.5);
        CollegeStudent student3 = new CollegeStudent("Петр", 20, 4.0);

        // Определяем статус каждого студента
        student1.determineStudentStatus();
        student2.determineStudentStatus();
        student3.determineStudentStatus();
    }
}
