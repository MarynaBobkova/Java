package practice.citizens.dao;

import practice.citizens.model.Person;

public interface Citizens {
    boolean add(Person person);
    boolean remove(int id);
    Person find(int id);
    Iterable<Person> find (int minAge, int maxAge); // список градждан в возрасте от и до
    Iterable<Person> find (String lastName); // найти по фамилии
    Iterable<Person> getAllPersonsSortedById (); // отсорт по ид
    Iterable<Person> getAllPersonsSortedByAge (); // отсорт по возр
    Iterable<Person> getAllPersonsSortedByLastName (); // отсорт по фамилии
    int size();

}
