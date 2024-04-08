import java.util.Scanner;
// Задача 2: Оценка дня с вводом
public class MoodOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели (1 - Понедельник, 2 - Вторник, ..., 7 - Воскресенье): ");
        int dayOfWeek = scanner.nextInt();

        String mood;

        switch (dayOfWeek) {
            case 1:
                mood = "Понедельник - не самый веселый день";
                break;
            case 2:
                mood = "Вторник - еще далеко до выходных";
                break;
            case 3:
                mood = "Среда - половина недели пройдена";
                break;
            case 4:
                mood = "Четверг - можно начать планировать выходные";
                break;
            case 5:
                mood = "Пятница - последний рабочий день недели";
                break;
            case 6:
                mood = "Суббота - выходной, радость!";
                break;
            case 7:
                mood = "Воскресенье - отдыхайте и наслаждайтесь";
                break;
            default:
                mood = "Недопустимый день недели";
        }

        System.out.println(mood);
    }
}
