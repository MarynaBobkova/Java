package solution;

//Напишите программу, которая принимает день недели и выводит ваше настроение в этот день.
public class MoodEvaluator {
    public static void main(String[] args) {
        String dayOfWeek = "Понедельник";

        String mood = evaluateMood(dayOfWeek);

        System.out.println("Ваше настроение в " + dayOfWeek + ": " + mood);
    }

    // Метод для оценки настроения в зависимости от дня недели
    public static String evaluateMood(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Понедельник":
                return "Не очень радостный";
            case "Вторник":
                return "Нейтральный";
            case "Среда":
                return "Средний";
            case "Четверг":
                return "Почти пятница!";
            case "Пятница":
                return "Отличное настроение!";
            case "Суббота":
            case "Воскресенье":
                return "Ура, выходной!";
            default:
                return "Неизвестный день";
        }
    }
}
