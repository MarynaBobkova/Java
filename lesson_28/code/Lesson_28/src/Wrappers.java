import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 13.10.2023
 */
public class Wrappers {

    public static void main(String[] args) {
        int intNumber = 10; // нет методов у примитивных типов
        Integer integerNumber = intNumber;


        String stringNumber = String.valueOf(true); // "true"

        Integer parsedInteger = Integer.parseInt("2023");
        Double parsedDouble = Double.parseDouble("2023");


        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String stringValueOfChars = String.valueOf(chars); // "hello"
        System.out.println(stringValueOfChars);

        int value = Integer.valueOf(integerNumber);

        boolean b = true;
        Boolean parsedBoolean = Boolean.parseBoolean("true");


        int x = 1; // true
        int y = 0; // false


        String line = "158949 #65+8198Max150000.99$";

        String col1 = "158949658198";
        String col2 = "Max";
        String col3 = "150000.99";

        long id = Long.parseLong(col1);
        String name = col2;
        Double sum = Double.parseDouble(col3);

//        Scanner scanner = new Scanner(System.in);
//        String action = scanner.nextLine();
//        Integer selectedActionAsNumber = Integer.parseInt(action);
//
//        if (selectedActionAsNumber == 1) {
//            System.out.println("Вы выбрали пункт 1");
//        }

        System.out.println(getDigits(line));
    }

    public static String getDigits(String source) { // вернуть из входящей строки только числа от 0 до 9.
        if (source == null){
            return null;
        }

        String res = "";
        for (int i = 0; i < source.length(); i++) {
            char currentChar = source.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') { // 0 1 2 3 ... 9
//                res += currentChar;
                res = res + currentChar;
            }
        }
        return res;
    }
}
