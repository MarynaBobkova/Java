package task4;

import java.util.Random;
import java.util.Scanner;

public class PasswordEncoderDecoder {

    public static String encodePassword(String password) {
        String encodedPassword = "";

        Random random = new Random();

        for (int i = 0; i < password.length(); i++) {
            char originalChar = password.charAt(i);
            char encodedChar;

            if (i % 2 == 0) {
                encodedChar = (char) (originalChar + 1000);
            } else {
                encodedChar = (char) (originalChar - 10);
            }

            encodedPassword += encodedChar;
        }

        // Добавляем 6 случайных символов из Unicode
        for (int i = 0; i < 6; i++) {
            char randomChar = (char) (random.nextInt(Character.MAX_CODE_POINT)); // Генерируем случайный символ Unicode
            encodedPassword += randomChar;
        }

        return encodedPassword;
    }

    public static String decodePassword(String encodedPassword) {
        String decodedPassword = "";

        for (int i = 0; i < encodedPassword.length() - 6; i++) {
            char encodedChar = encodedPassword.charAt(i);
            char originalChar;

            if (i % 2 == 0) {
                originalChar = (char) (encodedChar - 1000);
            } else {
                originalChar = (char) (encodedChar + 10);
            }

            decodedPassword += originalChar;
        }

        return decodedPassword;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select action:");
        System.out.println("1: encode password");
        System.out.println("2: decode password");

        String action = scanner.nextLine();
        int selectedAction = Integer.parseInt(action);
        if (selectedAction == 1) {
            System.out.println("Enter yor password to encode");
            String password = scanner.nextLine();
            String encodedPassword = encodePassword(password);
            System.out.println("Your encoded password:");
            System.out.println(encodedPassword);
        } else if (selectedAction == 2) {
            System.out.println("Enter yor password to decode");
            String encodedPassword = scanner.nextLine();
            String decodedPassword = decodePassword(encodedPassword);
            System.out.println("Decoded Password: " + decodedPassword);
        } else {
            System.out.println("This action is not available");
        }
    }
}
