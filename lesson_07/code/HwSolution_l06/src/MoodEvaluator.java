//Напишите программу, которая принимает день недели и выводит ваше настроение в этот день.
public class MoodEvaluator {
    public static void main(String[] args) {
        String result = evaluateMood("понедельник");
        System.out.println(result); // Фиговое

        result = evaluateMood("Вторник");
        System.out.println(result); // Чуть лучше чем в понедельник


        result = evaluateMood("вторник");
        System.out.println(result); // Такого дня недели не существует

        result = evaluateMood("пятница");
        System.out.println(result); // Такого дня недели не существует

    }

    // Метод для оценки настроения в зависимости от дня недели
    public static String evaluateMood(String dayOfWeek) {
        String result;

        switch (dayOfWeek) {
            case "понедельник":
                result = "Фиговое";
                break;
            case "Вторник":
                result = "Чуть лучше чем в понедельник";
                break;
            default:
                result = "Такого дня недели не существует";
        }

        return result;
    }
}
