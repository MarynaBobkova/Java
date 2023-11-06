package HW1;

public class SolutionApp {
    public static void main(String[] args) {
        String result1 = Solution_25.reversedStrings("Easy come easy go");
        String expectedResult1 = "ysaE emoc ysae og";

        System.out.println(result1);
        System.out.println(expectedResult1.equals(result1));
    }
}
