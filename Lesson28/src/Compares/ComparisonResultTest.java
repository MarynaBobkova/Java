package Compares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Compares.ComparisonResult.compareVersions;

public class ComparisonResultTest {

    @Test
    public void test_compareVersions_return1 () {
        String version1 = "1.2.3";
        String version2 = "1.0.1";

        Assertions.assertEquals(1, compareVersions(version1, version2));
    }

    @Test
    public void test_compareVersions_return0 () {
        String version1 = "1.20.2";
        String version2 = "1.20.2";

        Assertions.assertEquals(0, compareVersions(version1, version2));
    }

    @Test
    public void test_compareVersions_return () {
        String version1 = "1.2.2";
        String version2 = "1.2.5";

        Assertions.assertEquals(-1, compareVersions(version1, version2));
    }

}
