package interface_generic;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class GenericsExample {

    public static void main(String[] args) {
        ICalculator<String, String> concatStrings = new ConcatStrings();
        System.out.println(concatStrings.add("Hello", "Worlds"));

        ICalculator<Double, Integer> doubleCalculator = new DoubleCalculator();
        System.out.println(doubleCalculator.add(0.57, 0.01));

        ICalculator<Integer, String> concatIntegerAsString = new ConcatIntegerAsString();
        System.out.println(concatIntegerAsString.add(29, 2));
    }
}
