package HW2;
/* Создайте класс с именем "Книга" (Book) с приватными полями:

title (название книги, строковое значение)
author (автор книги, строковое значение)
year (год выпуска книги, целочисленное значение)
isbn (ISBN книги, строковое значение)
Добавьте конструктор класса, который принимает параметры для всех полей и инициализирует объект при его создании.

Создайте геттеры и сеттеры для каждого поля класса "Книга".

В методе main создайте несколько объектов класса "Книга" и инициализируйте их с помощью конструктора и сеттеров. Затем
используйте геттеры для получения информации о каждой книге и выведите ее в консоль.

Попробуйте изменить значения полей объектов с использованием сеттеров и выведите обновленную информацию в консоль.

 */

public class Book {
    private String title;
    private String author;
    private int year;
    private  String isbn;


    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
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
}
