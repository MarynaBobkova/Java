// Создайте класс LibraryApp для выполнения основной логики приложения.

public class LibraryAppl {
    public static void main(String[] args) {
        //В методе main создайте объект Library для представления библиотеки.
        Library library = new Library();

        //Создайте несколько объектов Book и используйте методы addBook, чтобы добавить их в библиотеку.

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1998,"987-76-65", false);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1999,"123-45-67", true);
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 2000,"567-78-89", false);
        Book book4 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 2002,"677-77-77", false);
        Book book5 = new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", 2004,"432-44-42", false);
        Book book6 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 2007,"876-77-89", false);
        Book book7 = new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 2008,"123-33-33", true);
        Book book8 = new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 2008,"123-33-33", true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);

        //Используйте методы isBookBorrowed, borrowBook и returnBook, чтобы проверить статус книг и установить флаги взятия и возврата.

        System.out.println("This book is borrowed: " + library.isBookBorrowed("Harry Potter and the Chamber of Secrets", "J.K. Rowling"));
        System.out.println("Return with result: "  + library.returnBook("Harry Potter and the Chamber of Secrets", "J.K. Rowling"));
        System.out.println("This book is borrowed: " + library.isBookBorrowed("Harry Potter and the Chamber of Secrets", "J.K. Rowling"));
        System.out.println("Return with result: "  + library.returnBook("Harry Potter and the Chamber of Secrets", "J.K. Rowling"));

        System.out.println();
        System.out.println("Return with result: "  + library.returnBook("Harry Potter and the Deathly Hallows", "J.K. Rowling"));
        System.out.println("Return with result: "  + library.returnBook("Harry Potter and the Deathly Hallows", "J.K. Rowling"));
        System.out.println("Return with result: "  + library.returnBook("Harry Potter and the Deathly Hallows", "J.K. Rowling"));
        System.out.println("Borrow with result: "  + library.borrowBook("Harry Potter and the Deathly Hallows", "J.K. Rowling"));
    }
}
