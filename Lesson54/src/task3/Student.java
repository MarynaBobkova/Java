package task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private Set<String> books = new HashSet<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBooks(String book){
        books.add(book);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        if (id != student.id) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(books, student.books);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
