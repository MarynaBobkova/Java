package solution;

// Напишите программу, которая принимает месяц и выводит соответствующий сезон
public class SeasonDeterminer {
    public static void main(String[] args) {
        int month = 7;

        String season = determineSeason(month);

        System.out.println("Месяц номер " + month + " соответствует сезону: " + season);
    }

    // Метод для определения сезона по номеру месяца
    public static String determineSeason(int month) {
        if (month < 1 || month > 12) {
            return "Некорректный месяц";
        } else if (month >= 3 && month <= 5) {
            return "Весна";
        } else if (month >= 6 && month <= 8) {
            return "Лето";
        } else if (month >= 9 && month <= 11) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}
