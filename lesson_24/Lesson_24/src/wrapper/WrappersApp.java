package wrapper;

/**
 * @author Andrej Reutow
 * created on 09.10.2023
 */
public class WrappersApp {

    public static void main(String[] args) {
        int intNumber = 5;


        Integer integerNumber1 = new Integer(10);
        Integer integerNumber2 = new Integer(10);

        System.out.println(integerNumber1.equals(intNumber)); // false
        System.out.println(integerNumber1.equals(1000)); // false

        System.out.println(integerNumber1 == integerNumber2); // false
        System.out.println(integerNumber1.equals(integerNumber2)); // true

        System.out.println(integerNumber2.toString());

        String stringInteger = integerNumber2.toString();

        System.out.println(5 + integerNumber1); // 15
        System.out.println("5" + integerNumber1.toString()); // "5" + "10" "510"
        System.out.println(5 + (integerNumber1 + integerNumber2)); // 5 + (10 + 10) = "25"
        System.out.println(5 + (integerNumber1 + integerNumber2.toString()));
        // (10 + "10") = "10" + "10" = "1010"
        // 5 + "1010" = "5" + "1010" = "51010"
        System.out.println(5 + (integerNumber1 + "world")); // 510world
        System.out.println((intNumber + integerNumber1) + "world"); // 15world
        System.out.println((5 + integerNumber1.toString()) + "world"); /// 510world

        System.out.println("" + integerNumber1 + integerNumber2); // 1010
        System.out.println(integerNumber1 + integerNumber2 + ""); // 20
        System.out.println(integerNumber1 + "" + integerNumber2); // 1010


        int convertedFromWrapperToInt = integerNumber2.intValue(); // распаковка в примитивный тип int
        byte convertedFromWrapperToByte = integerNumber2.byteValue(); // распаковка в примитивный тип byte
        short convertedFromWrapperToShort = integerNumber2.shortValue(); // распаковка в примитивный тип short
        double convertedFromWrapperToDouble = integerNumber2.doubleValue(); // распаковка в примитивный тип double

        Double doubleWrapper = new Double(5.5);
        Double doubleWrapperV2 = 5.5;
        Integer integerV2 = 555;
        Long longV2 = 565L;

        Float floatWrapper = 6.87F;

        Double result = doubleWrapper / 0;

        System.out.println(result);
        System.out.println(result.isInfinite());


//        Integer resInt = integerV2 / 0; // вызовит исключение "деление на 0"
//        System.out.println(resInt);
        System.out.println("\nСтатические методы оболочек");
        System.out.println("int from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE); // значение для int от минимального до максимального
        System.out.println(Short.MAX_VALUE); // максимальное значение short
        System.out.println(Long.MAX_VALUE); // максимальное значение long
        System.out.println(Double.MAX_VALUE); // максимальное значение double

        Short someShort;
        Long longValue = (long) Integer.MAX_VALUE;
        if (longValue <= Short.MAX_VALUE) {
            someShort = longValue.shortValue();
        }


        System.out.println("\nParse value from String to Integer");
        String someStr1 = "007";
        String someStr2 = "100";
        Integer res; // 107

        Integer parsedInt1 = Integer.parseInt(someStr1); // 7
        Integer parsedInt2 = Integer.parseInt(someStr2); // 100
        res = parsedInt1 + parsedInt2; // 107
        System.out.println(res);

        Double.parseDouble("5.5");
        Long.parseLong("5");
        Short.parseShort("5");


//        Integer parsedIntInvalid1 = Integer.parseInt("someNumber 007"); // работать не будет, выкинет исключение NumberFormatExeption
        // так как срока "someNumber 007" содержит не только цифры
//        Integer parsedIntInvalid2 = Integer.parseInt("7 7"); // NumberFormatExeption, т.к. в строке есть пробел

        int primitiveInt = 5;
        Integer integer = Integer.valueOf(primitiveInt); // 5
        Integer integer2 = primitiveInt; // 5
        Integer integer3 = Integer.valueOf("2023"); // 2023

    }
}
