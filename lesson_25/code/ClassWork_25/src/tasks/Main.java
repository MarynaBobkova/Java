package tasks;

/**
 * @author Andrej Reutow
 * created on 09.10.2023
 */
public class Main {

    public static int compareTo(char char1, char char2) {
        if (char1 > char2) {
            return 1;
        } else if (char1 < char2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int findSymbol(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                System.out.println("Символ найден на позиции: " + i);
                return i;
            }
        }
        return -1;
    }

}
