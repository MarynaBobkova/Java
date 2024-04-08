package nested.static_nested_classes;

import tools.Id;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
// Здесь Operation является статическим вложенным классом в Calculator, который содержит методы для различных операций.
public class Calculator {

    // Operation - статический вложенным класс
    public static class Operation {

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }
    }
}
