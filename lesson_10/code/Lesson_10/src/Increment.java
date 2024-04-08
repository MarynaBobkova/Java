/**
 * @author Andrej Reutow
 * created on 18.09.2023
 */
public class Increment {

    public static void main(String[] args) {
//        int counter = 123;              // 123
//        counter++;                      // 123 (+1 после этой сроки, т.е. станет 124)
//        System.out.println(counter++);  // 124 (+1 после этой сроки, т.е. станет 125)
//        System.out.println(counter);   //  125

        incrementPrefix();
    }

    public static void incrementPrefix() {
        int counter = 123;              // 123
        counter++;                      // 124
        System.out.println(++counter);  // 125
        System.out.println(counter++);  // 125
        System.out.println(counter);   //  126
    }
}
