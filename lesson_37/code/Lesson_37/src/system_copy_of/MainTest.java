package system_copy_of;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
class MainTest {

    @Test
    public void test_SystemCopy() {
        int[] source1 = {1, 2, -3, 4, -5};
        int[] target1 = new int[source1.length * 2];

        int[] source2 = {1, 2, -3, 4, -5};
        int[] target2 = new int[source1.length * 2];

        System.arraycopy(source1, 2, target1, 2, 3);
        Main.copySystem(source2, 2, target2, 2, 3);

        assertArrayEquals(target1, target2);
    }

}
