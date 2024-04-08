package nested.inner_class;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library("Humbold");
        Library.Shelf shelf1 = library.new Shelf("ID-1");
        Library.Shelf.Book book1 = shelf1.new Book("Some title");

        book1.printInfo();
    }
}
