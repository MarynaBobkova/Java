package task2;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */
public class LibraryApp {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Poter", "J. Rowling", 1998);
        Book book2 = new Book("Властелин колец", "Джон Рональд Руэл Толкин", 1954);
        Book book3 = new Book("1984", "Джордж Оруэлл", 1949);
        Book book4 = new Book("50 оттенков серого", "Э. Л. Джеймс", 2011);
        Book book5 = new Book("Игра престолов", "Джордж Р. Р. Мартин", 1996);

        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;


        Library library = new Library(books);
        // todo fix it NullPointerException
        // library.addBook(book4);
        library.borrowBook("Harry Poter", "J. Rowling");
        library.borrowBook("50 оттенков серого", "Э. Л. Джеймс");

        // todo fix NullPointerException
        library.removeBook(book1);
        System.out.println();
        library.getAllBooks();
    }
}
