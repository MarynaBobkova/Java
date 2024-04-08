public class MonthDays {
    public static void main(String[] args) {
        int month = 2; // Пример: февраль

        int daysInMonth = getDaysInMonth(month);

        if (daysInMonth != -1) {
            System.out.println("В этом месяце " + daysInMonth + " дней.");
        } else {
            System.out.println("Недопустимый номер месяца.");
        }
    }

    // Метод для определения количества дней в месяце
    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28; // В феврале обычно 28 дней
            default:
                return -1; // Недопустимый номер месяца
        }
    }
}
