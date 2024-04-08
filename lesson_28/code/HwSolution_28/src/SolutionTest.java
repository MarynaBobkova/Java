import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Andrej Reutow
 * created on 15.10.2023
 */
class SolutionTest {


    @Test
    void test_compareVersions_verson1GraterThenVersion2_resultNegativeInt() {
        int result = Solution.compareVersions("1.2.3", "2.0.1");
        Assertions.assertEquals(-1, result);
    }


    @Test
    void test_compareVersions_verson1EqualsVersion2_result0() {
        int result = Solution.compareVersions("1.2.3", "1.2.3");
        Assertions.assertEquals(0, result);
    }


    @Test
    void test_compareVersions_verson1GraterThenVersion2_resultPositiveInt() {
        int result = Solution.compareVersions("2.0.1", "1.2.3");
        Assertions.assertEquals(1, result);
    }
}
