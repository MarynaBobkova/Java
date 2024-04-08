// Напишите программу, которая принимает возраст
// и выводит соответствующую категорию (ребенок, подросток, взрослый)
public class AgeCalculator {
    public static void main(String[] args) {
        String result = calculateAgeCategory(7);
        System.out.println("Указан возраст 7 " + result);

        result = calculateAgeCategory(15);
        System.out.println("Указан возраст 15 " + result);

        result = calculateAgeCategory(150);
        System.out.println("Указан возраст 150 " + result);

        result = calculateAgeCategory(-1);
        System.out.println("Указан возраст -1 " + result);

        result = calculateAgeCategory(151);
        System.out.println("Указан возраст 151 " + result);
    }


    // Метод для определения категории возраста
    public static String calculateAgeCategory(int age) {
        String result; // ребенок 0 - 14, подросток 15 - 20, взрослый 21 - 150;
        boolean isKind = age >= 0 & age <= 14;

        if (isKind) {
            result = "ребенок";
        } else if (age >= 15 && age <= 20) {
            result = "подросток";
        } else if (age >= 21 && age <= 150) {
            result = "взрослый";
        } else {
            result = "Такого возраста не существует";
        }

        return result;
    }
}
