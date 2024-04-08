package task1;

import java.util.function.Predicate;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class Main {

    public static void main(String[] args) {

        // внутренние
        // вложенные
        // анонимные
        // абстрактные
        // локальные

        Car carBwm = new Car("Bmw") {
            @Override
            void drive() {
                System.out.println("I drive " + brand);
            }
        };


        Car carAudi = new Car("Audi") {
            @Override
            void drive() {
                System.out.println("I drive " + brand);
            }
        };

        carBwm.drive();
        carAudi.drive();


        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Predicate<Integer> integerAgePredicate = (age) -> age >= 18;
        Predicate<Integer> integerYearPredicate = (year) -> year >= 2022;

        filter(new Integer[]{1, 2, 3}, integerAgePredicate);
        filter(new Integer[]{1, 2, 3}, integerYearPredicate);
        filter(new Integer[]{1, 2, 3}, integerPredicate);


        filter(new String[]{"Hello", "World", "!"}, (text) -> text.length() > 2);

        Predicate<String> stringPredicate = (text) -> text.length() > 2;
        filter(new String[]{"Hello", "World", "!"}, stringPredicate);
    }

    private static <T> void filter(T[] array, Predicate<T> integerPredicate) {
        for (int i = 0; i < array.length; i++) {
            if (integerPredicate.test(array[i]))
                System.out.println(array[i]);
        }
    }
}
