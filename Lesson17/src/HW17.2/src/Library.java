/*Создайте класс Library с приватным полем books, которое будет представлять список книг в библиотеке. Инициализируйте его в конструкторе.
Определите метод addBook(Book book), который добавляет книгу в список библиотеки.
Определите метод removeBook(Book book), который удаляет книгу из списка библиотеки.
Определите метод getAllBooks(), который возвращает список всех книг в библиотеке.
Определите метод isBookBorrowed(String title, String author), который проверяет, взята ли книга по ее названию и автору.
Определите метод borrowBook(String title, String author), который устанавливает флаг, что книга взята.
Определите метод returnBook(String title, String author), который устанавливает флаг, что книга возвращена.

 */
public class Library {
    private Book[] allBooks = new Book[100];
    public Library(){
    }
    public void addBook(Book book){
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = book;
                return;
            }
        }
    }
    public void removeBook(Book book){
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == book) {
                allBooks[i] = null;
                return;
            }
        }
    }
    public Book[] getAllBooks(){
        return allBooks;
    }
    public boolean isBookBorrowed(String title, String author){

        for (int i = 0; i < allBooks.length; i++) {
            Book currentBook = allBooks [i];
            if(currentBook != null) {
                if (currentBook.getAuthor() == author && currentBook.getTitle() == title) {
                    return currentBook.isBorrowed();
                }
            }
        }
        return false;
    }

    public boolean borrowBook(String title, String author){

        for (int i = 0; i < allBooks.length; i++) {
            Book currentBook = allBooks [i];
            if (currentBook != null) {
                if (currentBook.getAuthor() == author && currentBook.getTitle() == title && currentBook.isBorrowed() == false) {
                    currentBook.setBorrowed(true);
                    return true;
                    }
            }

        }
        return false;
    }
    public boolean returnBook(String title, String author){
        for (int i = 0; i < allBooks.length; i++) {
            Book currentBook = allBooks [i];
            if (currentBook != null) {
                if (currentBook.getAuthor() == author && currentBook.getTitle() == title && currentBook.isBorrowed() == true){
                    currentBook.setBorrowed(false);
                    return true;
                }
            }
        }
        return false;
    }

}
