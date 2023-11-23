package Task4;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class IdentityTest {
    public static void main(String[] args) {
        Function<String, String> function = x -> x;
        System.out.println(function.apply("Hello!"));

        Function<String, String> function1 = Function.identity();
        System.out.println(function1.apply("Hello!"));
    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {

        Set<String> result = new HashSet<>();
        for (String currentValue : array) {
            String processedValue = function.apply(currentValue);
            result.add(processedValue);
        }
        return result;
    }
}
