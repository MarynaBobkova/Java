/**
 * @author Andrej Reutow
 * created on 08.10.2023
 */
public class StringSubstring {

    public static String reverceString(String value) {

        if (value == null) {
            return null;
        }

        String result = "";
        char[] charArray = value.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
    }

    // Задача 2: Извлечение доменного имени
    // Допустим, у вас есть электронный адрес в формате "username@example.com". Напишите метод, который извлекает доменное имя (то, что идет после @).
    public static String getDomain(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex != -1) {
            return email.substring(atIndex + 1);
        } else {
            return "Invalid email";
        }
    }

    // Задача 1: Извлечение первого слова
    // Напишите метод, который извлекает и возвращает первое слово из строки.
    public static String getLastName(String str) {
        int spaceIndex = str.indexOf(" ");
        if (spaceIndex != -1) {
            return str.substring(0, spaceIndex);
        } else {
            return str;
        }
    }

    // Задача 3: Извлечение подстроки между символами
    // Напишите метод, который извлекает и возвращает подстроку между двумя заданными символами.
    public static String getSubstringBetweenChars(String str, char start, char end) {
        int startIndex = str.indexOf(start);
        int endIndex = str.indexOf(end);
        if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
            return str.substring(startIndex + 1, endIndex);
        } else {
            return "Invalid input";
        }
    }
}
