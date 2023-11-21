package practice.citizens.dao;

import practice.citizens.model.Person;

import java.util.Comparator;
import java.util.List;

public class CitizenImpl implements Citizens{
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    private static Comparator<Person> lastNameComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int res = o1.getLastName().compareTo(o2.getLastName());
            return res != 0 ? res: Integer.compare(o1.getId(), o2.getId());
        }
    };
    private static Comparator<Person> ageComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int res = Integer.compare(o1.getAge(), o2.getAge());
            return res != 0 ? res: Integer.compare(o1.getId(), o2.getId()); // сортировка по ид, если они будут одного возраста
        }
    };
    @Override
    public boolean add(Person person) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public Person find(int id) {
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        return null;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
