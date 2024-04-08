package task2;

public class TextAnalysis {

    public static void main(String[] args) {
        String sentence = "Что такое технология Java и каково ее применение? Java представляет собой язык программирования и платформу вычислений, которая была впервые выпущена компанией Sun Microsystems в 1995 г. Технология эволюционировала из скромной разработки до инструмента, который играет серьезную роль в современном цифровом мире, предоставляя надежную платформу для множества сервисов и приложений. Инновационные продукты и цифровые услуги, разрабатываемые для будущего, также будут создаваться на основе Java. Несмотря на то что большинство современных приложений Java объединяет в себе среду и приложение Java, все еще существует множество приложений и даже некоторые веб-сайты, которые не будут работать, если на компьютере не установлена настольная версия Java. Java.com — это веб-сайт, предназначенный для пользователей, которым, возможно, Java по-прежнему требуется для настольных приложений, в частности для приложений на Java 8. Более подробную информацию для разработчиков и пользователей, которые хотели бы научиться программированию на Java, см. на веб-сайте dev.java, для бизнес-пользователей — на веб-странице oracle.com/java.";

        // 1. Метод для подсчета символов в предложении
        int charCount = countCharacters(sentence);
        System.out.println("Количество символов в предложении: " + charCount);

        // 2. Метод для подсчета букв латинского алфавита
        int latinLetterCount = countLatinLetters(sentence);
        System.out.println("Количество букв латинского алфавита: " + latinLetterCount);

        // 3. Метод для подсчета букв кирилического алфавита
        int cyrillicLetterCount = countCyrillicLetters(sentence);
        System.out.println("Количество букв кирилического алфавита: " + cyrillicLetterCount);

        // 4. Метод для подсчета букв (не символов) в предложении
        int letterCount = countLetters(sentence);
        System.out.println("Количество букв в предложении: " + letterCount);
    }

    // Метод для подсчета символов в предложении
    public static int countCharacters(String text) {
        return text.length();
    }

    // Метод для подсчета букв латинского алфавита
    public static int countLatinLetters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета букв кирилического алфавита
    public static int countCyrillicLetters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if ((c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я')) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета букв (не символов) в предложении
    public static int countLetters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}

