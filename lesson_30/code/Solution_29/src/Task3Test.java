import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class Task3Test {

    @Test
    public void test_countPositive_withPositiveAndNegativeNumbers_positiveCounted() {
        // Дано
        int[] array = {1, 2, -3};
        // Когда
        int result = Task3.countPositive(array);
        // Тогда
        Assertions.assertEquals(2, result);
    }

    @Test
    public void test_countPositive_withNegativeNumbers_counted0() {
        // Дано
        int[] array = {-1, -2, -3};
        // Когда
        int result = Task3.countPositive(array);
        // Тогда
        Assertions.assertEquals(0, result);
    }

    @Test
    public void test_countPositive_withEmptyArray_counted0() {
        // Дано
        int[] array = {};
        // Когда
        int result = Task3.countPositive(array);
        // Тогда
        Assertions.assertEquals(0, result);
    }

    @Test
    public void test_generateArray_with10Elements_arrayLength10() {
        // Когда
        int[] result = Task3.generateArray(10, 0, 0);
        // Тогда
        Assertions.assertNotNull(result);
        Assertions.assertEquals(10, result.length);
    }

    @Test
    public void test_generateArray_with10ElementsAndMax100AndMin1000_arrayLength10() {
        // Когда
        int[] result = Task3.generateArray(10, 100, 1000);
        //Тогда
        Assertions.assertNotNull(result);
        Assertions.assertEquals(10, result.length);
    }

//    @Test
//    public void test_testAssertionsArrayEquals() {
//        String[] arry1 = {"ABC", "kjg", "klgA1"};
//        String[] arry2 = {"ABC", "kjg", "klgA1"};
//
//        Assertions.assertArrayEquals(arry1, arry2);
//    }

}
