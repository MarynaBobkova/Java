/**
 * @author Andrej Reutow
 * created on 11.09.2023
 */
public class LessonExamples {

    public static void main(String[] args) {
        System.out.println("Примеры для урока:");

        System.out.println("Условный оператор и оператор if():");
        ifElseExample();

        System.out.println("Тернарный оператор:");
        ternaryOperatorExample();

        System.out.println("Операции сравнения:");
        comparisonOperatorsExample();

        System.out.println("Логические операторы:");
        logicalOperatorsExample();
    }


    //Условный оператор и оператор if()
    //Теория: Условный оператор if(условие) {...} позволяет выполнить определенный блок кода, если условие истинно.
    //Если условие истинно, выполняется блок кода внутри фигурных скобок.
    public static void ifElseExample() {
        int age = 25;
        if (age >= 18) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Ребенок");
        }
    }

    /*
    Тернарный оператор
    Теория: Тернарный оператор — это упрощенная форма if-else, которая позволяет присвоить переменной одно из двух значений в зависимости от условия.
    Это сокращенная форма if-else. Сначала идет условие, затем значение, если условие истинно, и значение, если условие ложно.
     */
    public static void ternaryOperatorExample() {
        int age = 25;
        String result = (age >= 18) ? "Взрослый" : "Ребенок";
        System.out.println(result);
    }

    /*
    Условие и операции сравнения
    Теория: Операции сравнения (>, <, ==, >=, <=, !=) используются для сравнения двух значений.
     >  : больше
     <  : меньше
     == : равно
     >= : больше или равно
     <= : меньше или равно
     != : не равно
     */
    public static void comparisonOperatorsExample() {
        int a = 10;
        int b = 20;
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a > b: " + (a > b));    // false
        System.out.println("a < b: " + (a < b));    // true
        System.out.println("a >= b: " + (a >= b));  // false
        System.out.println("a <= b: " + (a <= b));  // true
        System.out.println("a != b: " + (a != b));  // true
    }

    /*
    Логические операторы
    Теория: Логические операторы (&, |, ^) позволяют комбинировать несколько условий.
      & : логическое И (оба условия должны быть истинны)
      | : логическое ИЛИ (хотя бы одно условие должно быть истинным)
      ^ : исключающее ИЛИ (ровно одно из условий должно быть истинным)
     */
    public static void logicalOperatorsExample() {
        boolean hasTicket = true;
        boolean hasCoupon = false;
        System.out.println("hasTicket && hasCoupon: " + (hasTicket && hasCoupon));  // false
        System.out.println("hasTicket || hasCoupon: " + (hasTicket || hasCoupon));  // true
        System.out.println("hasTicket ^ hasCoupon: " + (hasTicket ^ hasCoupon));    // true
    }
}
