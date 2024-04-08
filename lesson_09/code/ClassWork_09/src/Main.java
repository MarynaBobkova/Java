/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class Main {
    public static void main(String[] args) {
        int counter = 123;              // 123
        counter++;                      // 123 (+1 после этой сроки, т.е. станет 124)
        System.out.println(++counter);  // 125 (т.к. ++counter, т.е. к прошлому значению (124) сначала прибавили 1)
    }
}
