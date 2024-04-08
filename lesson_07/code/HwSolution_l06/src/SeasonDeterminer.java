// Напишите программу, которая принимает месяц и выводит соответствующий сезон
public class SeasonDeterminer {
    public static void main(String[] args) {
        String result = determineSeason(1);
        System.out.println(result); // Зима

        result = determineSeason(6);
        System.out.println(result); // Лето

        result = determineSeason(0);
        System.out.println(result); // Такого месяца не существует

        result = determineSeason(13);
        System.out.println(result); // Такого месяца не существует
    }

    // Метод для определения сезона по номеру месяца
    public static String determineSeason(int month) {
        String result;

        switch (month) {
            case 1:
            case 2:
            case 3:
            case 10:
            case 11:
            case 12:
                result = "Зима";
                break;
            case 4:
            case 5:
                result = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                result = "Лето";
                break;
            case 9:
                result = "Осень";
                break;
            default:
                result = "Такого месяца не существует";
        }

        return result;
    }
}
