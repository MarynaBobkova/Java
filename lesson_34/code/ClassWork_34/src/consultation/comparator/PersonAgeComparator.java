package consultation.comparator;

import consultation.Person;

import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public class PersonAgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        // полижительное число, если о1 болше о2
        // отрицательное число, если о1 меньше о2
        // если о1 равен о2 то 0
        return o1.getAge() - o2.getAge();
//        return (o1.getAge() + o1.getZipCode()) - (o2.getAge() + o2.getZipCode());
    }
}
