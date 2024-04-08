package to_string;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class Person {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // name: Andrej, lastName: Reutow
    public void sing(){
        System.out.println("I am singing");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
