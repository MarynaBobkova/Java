/**
 * @author Andrej Reutow
 * created on 11.09.2023
 */
public class Main {
    public static void main(String[] args) {
        // boolean может хранить только true, false
//        boolean varTrue = true;
//        boolean varFalse = false;
//
//        if (varTrue) {
//            System.out.println("If оператор вариант 1");
//            System.out.println("Условие (вариант 1) - true");
//        }
//
//        if (varTrue) {
//            System.out.println("If оператор вариант 2");
//            System.out.println("Условие (вариант 2) - true");
//        } else {
//            System.out.println("Условие - true, мы в блоке else");
//        }
//
//
//        if (varFalse) {
//            System.out.println("If оператор");
//            System.out.println("Условие - false");
//        } else {
//            System.out.println("Условие - false, мы в блоке else");
//        }

        task1();
    }


    /*
    Условие в скобках оператора if () - это чаще всего операции сравнения:
    символ > больше, x > y - логическое выражение
    символ < меньше, x < y
    это == равно, x == y
    это >= больше или равно
    это <= меньше или равно
    это != НЕ равно (<> - это в других языках)
    всё это логические выражения. Логическое выражение принимает значение:
    ЛОЖЬ (false) или ПРАВДА (true)
    */
    public static void task1() {
//        //if - ЕСЛИ, ELSE - иначе

        System.out.println();
        compareGreaterThen(10, 10);
        compareGreaterThen(11, 10);
        compareGreaterThen(9, 10);

        System.out.println();
        compareLessThen(10, 10);
        compareLessThen(11, 10);
        compareLessThen(9, 10);

        System.out.println();
        compare(10, 10);
        compare(11, 10);
        compare(9, 10);

        System.out.println();
        compareGreaterThanOrEqualTo(10, 10); // true
        compareGreaterThanOrEqualTo(11, 10); // true
        compareGreaterThanOrEqualTo(9, 10); // false

        System.out.println();
        compareLessThanOrEqualTo(10, 10); // true
        compareLessThanOrEqualTo(11, 10); // false
        compareLessThanOrEqualTo(9, 10); // true

        System.out.println();
        compareNotEqualTo(10, 10); // false
        compareNotEqualTo(11, 10); // true
        compareNotEqualTo(9, 10); // true
    }

    //  символ > больше, x > y - логическое выражение
    public static void compareGreaterThen(int numberA, int numberB) {
        if (numberA > numberB) {
            System.out.println(numberA + " больше чем " + numberB);
        } else {
            System.out.println(numberA + " не больше чем " + numberB);
        }
    }

    // символ < меньше, x < y
    public static void compareLessThen(int numberA, int numberB) {
        if (numberA < numberB) {
            System.out.println(numberA + " меньше чем " + numberB);
        } else {
            System.out.println(numberA + " не меньше чем " + numberB);
        }
    }


    // это == равно,x == y
    public static void compare(int numberA, int numberB) {
        if (numberA == numberB) {
            System.out.println(numberA + " равен " + numberB);
        } else {
            System.out.println(numberA + " не не равен " + numberB);
        }
    }

    // >= - больше или равно
    // numberA = 10, numberB = 10 -- true
    // numberA = 11, numberB = 10 -- true
    // numberA = 9, numberB = 10 -- false
    public static void compareGreaterThanOrEqualTo(int numberA, int numberB) {
        if (numberA >= numberB) {
            System.out.println(numberA + " больше либо равно, чем " + numberB);
        } else {
            System.out.println(numberA + " не больше либо не равно, чем " + numberB);
        }
    }

    // <= - меньше или равно
    // numberA = 10, numberB = 10 -- true
    // numberA = 11, numberB = 10 -- false
    // numberA = 9, numberB = 10 -- true
    public static void compareLessThanOrEqualTo(int numberA, int numberB) {
        if (numberA <= numberB) {
            System.out.println(numberA + " меньше либо равно, чем " + numberB);
        } else {
            System.out.println(numberA + " не меньше либо не равно, чем " + numberB);
        }
    }

    // != - не равно
    // numberA = 10, numberB = 10 -- compareResult = false
    // numberA = 11, numberB = 10 -- compareResult = true
    // numberA = 9, numberB = 10 -- compareResult = true
    public static void compareNotEqualTo(int numberA, int numberB) {
        boolean compareResult = numberA != numberB;
        if (compareResult) {
            System.out.println(numberA + " не равно " + numberB);
        } else {
            System.out.println(numberA + " равно " + numberB);
        }

        System.out.println("Результат сравнения: " + compareResult);
        //  System.out.println("Результат сравнения: " + (numberA != numberB));
    }
}
