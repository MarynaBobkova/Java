package string;

/**
 * @author Andrej Reutow
 * created on 09.10.2023
 */
public class StringTasks {

    public static String reverse(String value) { // Hello
        String result = "";
        char[] valueChars = value.toCharArray(); // H,e,l,l,o
        // 0 "H"
        // 4 ...
        // 5 "o"

        for (int i = valueChars.length - 1; i >= 0; i--) {
            result = result + valueChars[i];
            // 1. result = o
            // 2. result = o + l = ol
            // 3. result = ol + l = oll
            // 4. result = oll + e = olle
            // 5. result = olle + H = olleH
        }

        return result;
    }
}
