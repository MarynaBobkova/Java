package array_tool;

import constants.AppConstants;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class ArrayTools {

    private ArrayTools() {
    }

    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString() + "\t");
        }
    }

    public static boolean findElement(Object target, Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return true;
            }
        }

        System.out.println(AppConstants.ELEMENT_NOT_FOUND_MSG);
        return false;
    }
}
