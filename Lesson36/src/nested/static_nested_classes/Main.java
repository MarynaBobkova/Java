package nested.static_nested_classes;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class Main {

    public static void main(String[] args) {
        int add = Calculator.Operation.add(1, 2);
        int subtract = Calculator.Operation.subtract(2, 1);


        System.out.println(add);
        System.out.println(subtract);
    }
}
