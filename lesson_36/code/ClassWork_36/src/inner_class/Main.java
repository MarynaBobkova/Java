package inner_class;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Library.Book book = library.new Book("1984");
        book.printInfo();
    }
}
