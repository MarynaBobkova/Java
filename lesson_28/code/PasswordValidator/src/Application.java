/**
 * @author Andrej Reutow
 * created on 13.10.2023
 */
public class Application {

    public static void main(String[] args) {
        int minLowerCase = 2;
        int minUpperCase = 2;
        int minDigits = 1;
        int minLength = 12;
        String symbolList = "!@#$%^";
        int minSymbolCount = 2;

        PasswordValidator validator1 = new PasswordValidator(minLowerCase, minUpperCase, minDigits, minLength, symbolList, minSymbolCount);

        PasswordValidator validator2 = new PasswordValidator(5, 1, 2, 10, symbolList, 3);


        String password = "MyP@ssword123!";
        boolean isValid1 = validator1.isValid(password);            // true
        boolean isValid2 = validator2.isValid(password);            // false, количесвто спец сиволов меньше 3

        if (isValid1) {
            System.out.println("Пароль верный.");
        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }
}
