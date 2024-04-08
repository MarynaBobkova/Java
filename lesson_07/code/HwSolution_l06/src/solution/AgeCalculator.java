package solution;

// Напишите программу, которая принимает возраст и выводит соответствующую категорию (ребенок, подросток, взрослый)
public class AgeCalculator {
    public static void main(String[] args) {
        int age = 25;

        String category = calculateAgeCategory(age);

        System.out.println("Ваш возраст: " + age + " лет, вы относитесь к категории: " + category);
    }

    // Метод для определения категории возраста
    public static String calculateAgeCategory(int age) {
        if (age < 0) {
            return "Некорректный возраст";
        } else if (age < 18) {
            return "Ребенок";
        } else if (age < 30) {
            return "Подросток";
        } else {
            return "Взрослый";
        }
    }
}
