package task_3;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // На входе имеется число, но записанное в типе String. Требуется:
        // 1. Преобразовать строку в число. "4.25" -> 4.25
        // 2. Округлить это число по математическим правилам. 4.25 -> 4
        // 3. Результат возвести в квадрат. 4 -> 16

        Function<String, Long> function = x -> {
            double result1 = Double.parseDouble(x);
            long result2 = Math.round(result1);
            long result3 = result2 * result2;
            return result3;
        };

        // "4,25" -> 16
        // "5,76" -> 36

        System.out.println(function.apply("4.25"));
        System.out.println(function.apply("5.76"));

        Function<String, Long> function1 = x -> (long) Math.pow(Math.round(Double.parseDouble(x)), 2);
        System.out.println(function1.apply("4.25"));
        System.out.println(function1.apply("5.76"));

        // double -> int
        // 4.6 -> 4
        // 4.0 -> 4

        long l1 = 100L;
        long l2 = 3_000_000_000L;

        int i1 = (int) l1;
        int i2 = (int) l2;

        System.out.println(i1);
        System.out.println(i2);

        String.valueOf(45);
        // 45 -> "45"

        // На входе имеется число, но записанное в типе String. Требуется:
        // 1. Преобразовать строку в число. "4.25" -> 4.25
        // 2. Округлить это число по математическим правилам. 4.25 -> 4
        // 3. Результат возвести в квадрат. 4 -> 16

        Function<String, Double> converter = x -> Double.parseDouble(x);
        Function<Double, Long> round = x -> Math.round(x);
        Function<Long, Long> pow = x -> x * x;

        System.out.println(pow.apply(7L));
        System.out.println(round.apply(2.98));
        System.out.println(converter.apply("45.12"));

        Function<String, Long> totalFunction = converter.andThen(round).andThen(pow);
        System.out.println(totalFunction.apply("4.12"));
        System.out.println(totalFunction.apply("7.56"));

        Function<String, Long> totalFunction1 = round.andThen(pow).compose(converter);
        System.out.println(totalFunction1.apply("4.12"));
        System.out.println(totalFunction1.apply("7.56"));
    }
}