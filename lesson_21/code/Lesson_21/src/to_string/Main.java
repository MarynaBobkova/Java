package to_string;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto("VW", "Golf");
        auto.equals(null);

        Person person = new Person("Andrej", "Reutow");


        System.out.println(auto); // Auto@5474c6c (взята реализация метода toString() из класса Object)
        //  System.out.println(auto) -> выведет: Bla bla bla!. Так как именно так переобпределен метод toString в классе Auto

        System.out.println(person); // name: Andrej, lastname: Reutow (Взята реализация переопределенного метода toString())

        print(person);
        print(auto); // выведет: Bla bla bla!. Так как именно так переобпределен метод toString в классе Auto

        Object personObj = new Person("Andrej", "Reutow");
        if (personObj instanceof Person) {
            ((Person) personObj).sing();

        }

        String string = "";
        string.toString();
        int a;
    }

    public static void print(Object obj) {
        String s = (obj == null) ? "null" : obj.toString();
        System.out.println(s);
    }
}
