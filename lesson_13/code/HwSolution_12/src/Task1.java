import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 20.09.2023
 */
//Создайте массив из 5 элементов для хранения оценок студента.
// Заполните массив оценками и вычислите средний балл студента.
//- используйте Scanner для заполнения массива.
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какое количество оценок вы желаете ввести?");
        int length = scanner.nextInt();

        int[] grades = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Введите оценку " + (i + 1));
            int grade = scanner.nextInt();
            grades[i] = grade;
        }

        int sum = calculateSum(grades);

        double average = sum / length;

        System.out.println("Средняя оценка: " + average);
    }

    public static int calculateSum(int[] source) {
        int result = 0;
        for (int i = 0; i < source.length; i++) {
            result += source[i];
        }
        return result;
    }

}
