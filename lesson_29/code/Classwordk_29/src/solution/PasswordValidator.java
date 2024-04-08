package solution;

import java.util.Scanner;
public class PasswordValidator {
    private final int minLowerCase;
    private final int minUpperCase;
    private final int minDigits;
    private final int minLength;
    private final String symbolList;
    private final int minSymbolCount;


    public PasswordValidator(int minLowerCase, int minUpperCase, int minDigits, int minLength, String symbolList, int minSymbolCount) {
        this.minLowerCase = minLowerCase;
        this.minUpperCase = minUpperCase;
        this.minDigits = minDigits;
        this.minLength = minLength;
        this.symbolList = symbolList;
        this.minSymbolCount = minSymbolCount;
    }


    public boolean isValid(String password) {
        if (password.length() < minLength) {
            return false;
        }

        int countLowerCase = 0;
        int countUpperCase = 0;
        int countDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                countLowerCase++;
            } else if (Character.isUpperCase(currentChar)) {
                countUpperCase++;
            } else if (Character.isDigit(currentChar)) {
                countDigits++;
            }
        }

        if (countLowerCase >= minLowerCase && countUpperCase >= minUpperCase && countDigits >= minDigits) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDigitsContains(String password) {

        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                countDigits++;
            }
        }

        return countDigits >= minDigits;
    }


    public boolean isSymbolsContains(String password) {

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (symbolList.contains(String.valueOf(currentChar))) {
                return true;
            }
        }
        return false;
    }

    public boolean isUpperCaseContains(String password) {
        int countUpperCase = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                countUpperCase++;
            }
        }

        return countUpperCase >= minUpperCase;
    }

    public boolean isLowerCaseContains(String password) {

        int countLoweCase = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                countLoweCase++;
            }
        }

        return countLoweCase >= minLowerCase;
    }

    public boolean isLengthValid(String password) {
        if (password.length() >= minLength) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int minLowerCase = 2;
        int minUpperCase = 2;
        int minDigits = 1;
        int minLength = 12;
        String symbolList = "!@#$%^";
        int minSymbolCount = 2;

        PasswordValidator validator = new PasswordValidator(minLowerCase, minUpperCase, minDigits, minLength, symbolList, minSymbolCount);
        String password = "MyP@ssword123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your option");
        System.out.println("1 - Password isValid");
        System.out.println("2 - Password isDigitsContains");
        System.out.println("3 - Password isSymbolsContains");
        System.out.println("4 - Password isUpperCaseContains");
        System.out.println("5 - Password isLowerCaseContains");
        System.out.println("6 - Password isLengthValid");

        String action = scan.nextLine();
        int selectedAction = Integer.valueOf(action);
        if (selectedAction == 1) {
            if (validator.isValid(password)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        } else if (selectedAction == 2) {
            if (validator.isDigitsContains(password)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        } else if (selectedAction == 3) {
            if (validator.isSymbolsContains(password)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        } else if (selectedAction == 4) {
            if (validator.isUpperCaseContains(password)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        } else if (selectedAction == 5) {
            if (validator.isLowerCaseContains(password)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        } else if (selectedAction == 6) {
            if (validator.isLengthValid(password)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }

            boolean isValid = validator.isValid(password);
            boolean isDigitsContains = validator.isDigitsContains(password);
            boolean isSymbolsContains = validator.isSymbolsContains(password);
            boolean isUpperCaseContains = validator.isUpperCaseContains(password);
            boolean isLowerCaseContains = validator.isLowerCaseContains(password);
            boolean isLengthValid = validator.isLengthValid(password);
        }
    }
}

