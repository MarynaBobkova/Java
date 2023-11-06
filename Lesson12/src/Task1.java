/* Создайте массив из 5 элементов для хранения оценок студента.
Заполните массив оценками и вычислите средний балл студента.
используйте Scanner для заполнения массива.
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] grades = new int[5];
        double sum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите оценку: ");
            int grade = scanner.nextInt();
            grades[i] += grade;
        }
        double avarage = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            avarage = sum/ grades.length;
        }
        System.out.println("Avarage grades: " + avarage);
    }
}
