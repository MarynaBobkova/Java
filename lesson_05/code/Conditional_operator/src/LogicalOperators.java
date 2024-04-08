/**
 * @author Andrej Reutow
 * created on 11.09.2023
 */
public class LogicalOperators {
    public static void main(String[] args) {
        checkKino(true, 30);  // true
        checkKino(false, 30); // false
        checkKino(true, 11); // false
        checkKino(false, 11); // false

        System.out.println();
        checkKinoWithCoupon(true, true);  // true
        checkKinoWithCoupon(true, false); // true
        checkKinoWithCoupon(false, false);// false
        checkKinoWithCoupon(false, true); // true

        // boolean isAllowed = (hasTicket | hasCoupon) & age >= 18;
        checkKinoWithCouponAnAge(true, true, 18); // true
        checkKinoWithCouponAnAge(false, true, 20); // true
        checkKinoWithCouponAnAge(true, false, 21); // true

        checkKinoWithCouponAnAge(true, true, 17); // false
        checkKinoWithCouponAnAge(false, false, 30); // false
        checkKinoWithCouponAnAge(false, true, 30); // true
    }

/*

Логические операторы:
Логические операции соединяют(комбинируют) между собой различные условия:

Логическое отрицание, оно же NOT или инверсия. Обозначается символом “!” перед операндом. Применяется к одному операнду.
Логическое И, оно же AND или конъюнкция. Обозначается символом “&” между двумя операндами, к которым применяется. Пример: x > 0 & x <10
Логическое ИЛИ в Java, оно же — OR, оно же — дизъюнкция. Обозначается символом “|” между двумя операндами. Пример: x < 0 | x >10 в этом выражении получаем ложь, когда x = 2, 3, ... 9
Исключающее или, XOR, строгая дизъюнкция. Обозначается символом “^” между двумя операндами.
Условное ИЛИ, обозначаемое как ||, проверяет первый операнд (условие).
Условное И, обозначаемое как &&, проверяет первый операнд (условие). Условное ИЛИ, условное И полезно тогда, когда правое условие зависит от левого.
Результат сравнения и логических операторов всегда имеет тип boolean, то есть может быть либо ИСТИНА (true), либо ЛОЖЬ (false). Третьего НЕ ДАНО!
*/

    public static void checkKino(boolean hasTicket, int age) {
        boolean isAllowed = hasTicket & age >= 18;

        if (isAllowed) {
            System.out.println("Имеет право посмотреть фильм");
        } else {
            System.out.println("Не имеет право посмотреть фильм");
        }
    }

    public static void checkKinoWithCoupon(boolean hasTicket, boolean hasCoupon) {
        boolean isAllowed = hasTicket | hasCoupon;

        if (isAllowed) {
            System.out.println("Имеет право посмотреть фильм");
        } else {
            System.out.println("Не имеет право посмотреть фильм");
        }
    }

    public static void checkKinoWithCouponAnAge(boolean hasTicket, boolean hasCoupon, int age) {
        boolean isAllowed = (hasTicket | hasCoupon) & age >= 18;
//        boolean isAllowed = (hasTicket || hasCoupon) & age >= 18;
        // boolean isAllowed = age >= 18 & (hasTicket | hasCoupon);

        // false | false | true | false | false // true
        // false || false || true || (false) || (false) // true

        if (isAllowed) {
            System.out.println("Имеет право посмотреть фильм");
        } else {
            System.out.println("Не имеет право посмотреть фильм");
        }
    }
}
