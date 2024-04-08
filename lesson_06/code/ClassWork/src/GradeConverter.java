public class GradeConverter {
    public static void main(String[] args) {
        int points = 85; // Замените на количество баллов, которые хотите проверить

        String letterGrade = getLetterGrade(points);

        System.out.println("Оценка: " + letterGrade);
    }

    // Метод для определения буквенной оценки
    public static String getLetterGrade(int points) {
        if (points >= 90 && points <= 100) {
            return "A";
        } else if (points >= 80 && points < 90) {
            return "B";
        } else if (points >= 70 && points < 80) {
            return "C";
        } else if (points < 70 && points >= 0) {
            return "F";
        } else {
            return "Недопустимое количество баллов"; // Если введены некорректные баллы
        }
    }
}
