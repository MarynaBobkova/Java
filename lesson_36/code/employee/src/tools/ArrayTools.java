package tools;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class ArrayTools {

    private ArrayTools() {
    }

    public static <T> void print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> T search(T[] source, T value) {
        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(value)) {
                return source[i];
            }
        }
        return null;
    }

    public static <T extends Id> T searchById(T[] source, long id) {
        for (int i = 0; i < source.length; i++) {
            if (id == source[i].getId()) {
                return source[i];
            }
        }
        return null;
    }

    public static <T extends Id> boolean removeById(T[] source, long id) {
        for (int i = 0; i < source.length; i++) {
            if (id == source[i].getId()) {
                for (int j = i; j < source.length - 1; j++) {
                    source[j] = source[j + 1];
                }
                source[source.length - 1] = null;
                return true;
            }
        }
        return false;
    }
}
