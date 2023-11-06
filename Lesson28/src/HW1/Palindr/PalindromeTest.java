package HW1.Palindr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static HW1.Palindr.Palindrome.isPalindrome;

public class PalindromeTest {

    @Test
    public void test_isPalindrome () {
       String str = "Anna Anna";
       Assertions.assertTrue(isPalindrome(str));

       String str1 = " Anna Marie";
       Assertions.assertFalse(isPalindrome(str1));

    }
}
