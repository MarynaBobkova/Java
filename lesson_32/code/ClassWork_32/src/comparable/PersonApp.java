package comparable;

import comparable.entity.Person;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class PersonApp {

    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Andrej", 20),
                new Person("Vasja", 18),
                new Person("Petja", 34),
                new Person("Nastja", 18)
        };

        // {Vasja, Nastja, Andrej, Petja}

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i].toString());
        }
        Arrays.sort(peoples);
        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]);
        }
    }
}
