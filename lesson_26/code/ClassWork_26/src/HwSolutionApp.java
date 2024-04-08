/**
 * @author Andrej Reutow
 * created on 11.10.2023
 */
public class HwSolutionApp {

    public static void main(String[] args) {

        String result1 = HwSolution_25.reversedStrings("Easy come easy go");
        String expectedResult1 = "ysaE emoc ysae og";

        System.out.println(result1); //ysaE emoc ysae og
        System.out.println(expectedResult1.equals(result1)); // true
    }
}
