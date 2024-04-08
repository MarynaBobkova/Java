package nested.inner_class;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */

// Здесь Book является внутренним классом Shelf, Shelf является внутренним классом в Library,
public class Library {

    private String name;

    public Library(String name) {
        this.name = name;
    }

    private String getLName() {
        return this.name;
    }

    // Shelf является внутренним классом в Library
    public class Shelf {
        private String name;

        public Shelf(String name) {
            this.name = name;
        }

        // Book является внутренним классом Shelf
        public class Book {
            private String title;

            public Book(String title) {
                this.title = title;
            }

            public void printInfo() {
                System.out.println("Book title: " + this.title + ", Shelf: " + name + ", Library: " + getLName());
            }
        }
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Library library = (Library) object;

        return Objects.equals(name, library.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}
