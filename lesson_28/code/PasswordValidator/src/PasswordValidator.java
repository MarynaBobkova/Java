/**
 * @author Andrej Reutow
 * created on 09.10.2023
 * <p>
 * Класс для проверки пароля на соответствие заданным требованиям.
 */
public class PasswordValidator {

//    private final int minLowerCase;
//    private final int minUpperCase;
//    private final int minDigits;
//    private final int minLength;
//    private final String symbolList;
//    private final int minSymbolCount;

    /**
     * Конструктор класса PasswordValidator для инициализации параметров проверки пароля.
     *
     * @param minLowerCase   Минимальное количество букв нижнего регистра.
     * @param minUpperCase   Минимальное количество букв верхнего регистра.
     * @param minDigits      Минимальное количество цифр.
     * @param minLength      Минимальная длина пароля.
     * @param symbolList     Список символов, которые должны быть в пароле.
     * @param minSymbolCount Минимальное количество символов из списка.
     */
    public PasswordValidator(int minLowerCase,
                             int minUpperCase,
                             int minDigits,
                             int minLength,
                             String symbolList,
                             int minSymbolCount) {
    }

    /**
     * Проверяет, соответствует ли заданный пароль требованиям.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль соответствует требованиям, и false в противном случае.
     */
    public boolean isValid(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество цифр.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество цифр, и false в противном случае.
     */
    public boolean isDigitsContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданные символы из списка.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов из списка, и false в противном случае.
     */
    public boolean isSymbolsContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов верхнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов верхнего регистра, и false в противном случае.
     */
    public boolean isUpperCaseContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов нижнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов нижнего регистра, и false в противном случае.
     */
    public boolean isLowerCaseContains(String password) {

        return false;
    }

    /**
     * Проверяет, является ли длина пароля достаточной.
     *
     * @param password Пароль для проверки.
     * @return true, если длина пароля больше или равна минимальной длине, и false в противном случае.
     */
    public boolean isLengthValid(String password) {
        return false;
    }
}
