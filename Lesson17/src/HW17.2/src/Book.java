//Создать класс Book, представляющий книгу, с полями для хранения названия, автора, года издания,
// ISBN и флага (boolean isBorrowed), указывающего, взята ли книга кем-то.
/* Создайте класс Book с приватными полями для названия (title), автора (author), года издания (year),
ISBN (isbn) и флага, указывающего, взята ли книга (isBorrowed). Определите конструктор класса Book,
который принимает параметры для инициализации полей. Реализуйте геттеры и сеттеры для полей класса Book,
включая геттер и сеттер для флага isBorrowed.
 */
public class Book {
    private String title;
    private String author;
    private  int year;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, int year, String isbn, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
