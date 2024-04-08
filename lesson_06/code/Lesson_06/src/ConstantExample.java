/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class ConstantExample {

    static final int COUNTER = 10; // константа на уровне класса

    public static void main(String[] args) {
        System.out.println(COUNTER);
    }

    public static void someMthd() {
        System.out.println(COUNTER);
    }

}
