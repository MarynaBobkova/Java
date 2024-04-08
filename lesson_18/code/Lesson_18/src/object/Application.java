package object;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */
public class Application {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Poter", "J. Rowling", 1998);
        Book book2 = new Book("Harry Poter", "J. Rowling", 1998);
        Book book3 = book2;
        Book book4 = book1;
        Book book5 = book2;

        book2.setYear(2022);

        System.out.println("Вывод 1 книги");
        System.out.println("Author: " + book1.getAuthor() +
                " Title: " + book1.getTitle() +
                " Year: " + book1.getYear() +
                " Borrowed: " + book1.isBorrowed()
        );

        System.out.println();
        System.out.println("Вывод 2 книги");
        System.out.println("Author: " + book2.getAuthor() +
                " Title: " + book2.getTitle() +
                " Year: " + book2.getYear() +
                " Borrowed: " + book2.isBorrowed()
        );


        int a = 5;
        int b = 10;

        int c = a; // c =  5
        c = 100;
        System.out.println();

        IntObject intObjectA = new IntObject(5);
        IntObject intObjectC = intObjectA;
        intObjectC.setValue(100);

        System.out.println();
    }
}
