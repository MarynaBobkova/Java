import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Andrej Reutow
 * created on 13.10.2023
 */
public class WrappersTest {

    @Test
    public void test_getDigits_validString_digitsString() {
        // Given
        String testString = "a17b8";
        // When
        String result = Wrappers.getDigits(testString);
        // Then
        String expectedResult = "178";
        Assertions.assertNotNull(result);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Тестирование метода getDigits на вход строка со значением null, ожидаемый результат null")
    public void test_getDigits_inputValueIsNull_resultIsNull() {
        // Given
        String testString = null;
        // When
        String result = Wrappers.getDigits(testString);
        // Then
        Assertions.assertNull(result);
    }

    @Test
    public void test_getDigits_valueIsEmptyString_emptyString() {
        // Given
        String testString = "";
        // When
        String result = Wrappers.getDigits(testString);
        // Then
        String expectedResult = "";
        Assertions.assertNotNull(result);
        Assertions.assertEquals(expectedResult, result);
    }
}
