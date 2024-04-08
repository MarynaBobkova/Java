package consultation.comparator;

import consultation.Person;

import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public class PersonZipCodeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getZipCode() - o2.getZipCode();
    }
}
