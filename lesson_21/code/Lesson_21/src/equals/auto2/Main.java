package equals.auto2;

import equals.auto2.Auto2;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class Main {

    public static void main(String[] args) {
        Auto2 Auto2VwPolo = new Auto2("VW", "POLO");
        Auto2 Auto2VwPolo2 = new Auto2("VW", "POLO");
        Auto2 Auto2MercC200 = new Auto2("Mercedes", "C200");

        System.out.println(Auto2VwPolo);
        System.out.println(Auto2VwPolo2);
        System.out.println(Auto2VwPolo.equals(Auto2VwPolo2)); // true

        System.out.println(Auto2MercC200);
        System.out.println(Auto2VwPolo.equals(Auto2MercC200)); // false

        System.out.println(Auto2VwPolo2.equals(Auto2VwPolo)); // true
        System.out.println(Auto2MercC200.equals(Auto2VwPolo)); // false
    }
}
