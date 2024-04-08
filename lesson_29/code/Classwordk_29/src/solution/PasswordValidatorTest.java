package solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void test_isValid_isMinLowerCase_isMinUpperCase_isMinDigits_isMinLength_isMinSymbolCount() {
        String password = "MyP@ssword123";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertTrue(validator.isValid(password));
        Assertions.assertTrue(validator.isDigitsContains(password));
        Assertions.assertTrue(validator.isLengthValid(password));
        Assertions.assertTrue(validator.isUpperCaseContains(password));
        Assertions.assertTrue(validator.isLowerCaseContains(password));
        Assertions.assertTrue(validator.isSymbolsContains(password));
        Assertions.assertNotNull(password);


    }

    @Test
    public void test_isDigitsContains_validPassword_resultTrue() {
        String password = "MyP@ssword123";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertTrue(validator.isDigitsContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isDigitsContains_invalidPassword_resultFalse() {
        String password = "MyP@ssword";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertFalse(validator.isDigitsContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isDigitsContains_invalidPasswordWith1Digits_resultFalse() {
        String password = "MyP@ssword12";
        PasswordValidator validator = new PasswordValidator(2, 2, 3, 12, "!@#$%^", 2);

        Assertions.assertFalse(validator.isDigitsContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isDigitsContains_emptyPassword_resultFalse() {
        String password = "";
        PasswordValidator validator = new PasswordValidator(2, 2, 3, 12, "!@#$%^", 2);

        Assertions.assertFalse(validator.isDigitsContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isSymbolsContains() {
        String password = "MyP@ssword123";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertTrue(validator.isSymbolsContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isUpperCaseContains() {
        String password = "MyP@ssword123";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertTrue(validator.isUpperCaseContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isLowerCaseContains() {
        String password = "MyP@ssword123";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertTrue(validator.isLowerCaseContains(password));
        Assertions.assertNotNull(password);
    }

    @Test
    public void test_isLengthValid() {
        String password = "MyP@ssword123";
        PasswordValidator validator = new PasswordValidator(2, 2, 1, 12, "!@#$%^", 2);

        Assertions.assertTrue(validator.isLengthValid(password));
        Assertions.assertNotNull(password);
    }
}
