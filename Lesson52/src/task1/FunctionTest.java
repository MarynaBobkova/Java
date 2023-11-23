package task1;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        // Написать функцию, которая округляет переданные числа
        // Double 123.45 -> long 123
        // 456.87 -> 457

        MyFunction myFunction = new MyFunction();
        System.out.println("Реализация при помощи обычного класса:");
        System.out.println(myFunction.apply(123.45));
        System.out.println(myFunction.apply(456.87));

        //Реализация при помощи ананимного класса
        System.out.println("Реализация при помощи ананимного класса:");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function.apply(123.45));
        System.out.println(function.apply(456.87));

        System.out.println("Реализация при помощи лямбда-выражения:");
        Function<Double, Long> lambdaFunction = x -> Math.round(x);
        System.out.println(lambdaFunction.apply(123.45));
        System.out.println(lambdaFunction.apply(456.87));

        System.out.println("Реализация при помощи method reference:");
        Function<Double, Long> referenceFunction = Math::round;
        System.out.println(referenceFunction.apply(123.45));
        System.out.println(referenceFunction.apply(456.87));
    }
}
