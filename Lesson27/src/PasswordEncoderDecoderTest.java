import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Andrej Reutow
 * created on 12.10.2023
 */
public class PasswordEncoderDecoderTest {


    public void testDecodePasswordPasswordDecoded() {

    }

    @Test
    public void test_decodePassword_passwordDecoded() {
        // Дано:
        String password = "QWERTZ123";

        // Когда
        String encodedPassword = PasswordEncoderDecoder.encodePassword(password);
        String decodedPassword = PasswordEncoderDecoder.decodePassword(encodedPassword);

        // Тогда

        Assertions.assertEquals(password, decodedPassword);
    }

    @Test
    public void test_encodePassword_encodedPassword() {
        String password = "qWerty123456";

        String encodedPassword = PasswordEncoderDecoder.encodePassword(password);

        Assertions.assertNotNull(encodedPassword);
        Assertions.assertNotEquals(password, encodedPassword);
        Assertions.assertEquals(password.length() + 6, encodedPassword.length());
    }

    @Test
    public void test_encodePassword_emptyString_encodedPassword() {
        String password = "";

        String encodedPassword = PasswordEncoderDecoder.encodePassword(password);

        Assertions.assertNotNull(encodedPassword);
        Assertions.assertNotEquals(password, encodedPassword);
        Assertions.assertEquals(6, encodedPassword.length());
    }


    @Test
    public void test_encodePassword_passIsNull_resultNull() {
        String password = null;

        String encodedPassword = PasswordEncoderDecoder.encodePassword(password);

        Assertions.assertNull(encodedPassword);
    }
}
