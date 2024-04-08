import java.util.Random;
import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 12.10.2023
 */

/*
### Задание 2* Программа кодирования и декодирования пароля

### Техническое задание

#### Цель:

Разработать программу на Java для кодирования и декодирования пароля с использованием следующих условий:

- Каждый четный индекс символа пароля сдвигается на 1000 символов вправо в Unicode.
- Каждый нечетный индекс символа пароля сдвигается на 10 символов влево в Unicode.
- В закодированный пароль добавляются 6 случайных символов из таблицы Unicode.

### Функциональные требования:

1. Программа должна иметь два основных метода: `encodePassword` для кодирования пароля и `decodePassword` для
   декодирования пароля.
2. Метод `encodePassword` должен принимать строку с паролем в качестве входных данных и возвращать закодированный пароль
   в виде строки.
3. Метод `decodePassword` должен принимать закодированный пароль в виде строки и возвращать исходный пароль в виде
   строки.
4. Программа должна добавлять 6 случайных символов из Unicode в закодированный пароль при каждой кодировке пароля.

### Нефункциональные требования:

1. Программа должна быть простой в использовании через текстовый интерфейс в консоли.
2. Программа должна быть легко читаемой и поддерживаемой.
3. Программа должна быть протестирована (smoke test - https://ru.wikipedia.org/wiki/Smoke_test).
 */
public class PasswordEncoderDecoder {

    public static final int N = 6;

    /**
     * для кодирования пароля
     */
    public static String encodePassword(String password) {
        if (password == null) {
            return null;
        }

        String encodedPassword = ""; // переменная в которую запишем зашифрованный пароль

        for (int i = 0; i < password.length(); i++) {
            char originalChar = password.charAt(i);

            if (i % 2 == 0) {
                encodedPassword += (char) (originalChar + 1000);
            } else {
                encodedPassword += (char) (originalChar - 10);
            }
        }

        Random random = new Random();
        for (int i = 0; i < N; i++) {
            char randomChar = (char) random.nextInt(Character.MAX_CODE_POINT);
            encodedPassword += randomChar;
        }

        return encodedPassword;
    }

    public static String decodePassword(String encodedPassword) {
        String result = "";

        for (int i = 0; i < encodedPassword.length() - N; i++) {
            char encodedChar = encodedPassword.charAt(i);

            if (i % 2 == 0) {
                result += (char) (encodedChar - 1000);
            } else {
                result += (char) (encodedChar + 10);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1 - encode password");
        System.out.println("2 - decode password");

        String action = consoleInput.nextLine();
        int selectedAction = Integer.valueOf(action);

        if (selectedAction == 1) {
            System.out.println("Please enter your password to encode:");
            String userPassword = consoleInput.nextLine();
            String encodedUserPassword = encodePassword(userPassword);
            System.out.println("Your encoded password:");
            System.out.println(encodedUserPassword);
        } else if (selectedAction == 2) {
            System.out.println("Please enter your password to decode:");
            String decodedUserPassword = consoleInput.nextLine();
            String encodedUserPassword = decodePassword(decodedUserPassword);
            System.out.println("Your decoded password:");
            System.out.println(encodedUserPassword);
        } else {
            System.out.println("Error, this action not present");
        }
    }

}
