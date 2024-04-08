package inner_class;

// Здесь Book является внутренним классом в Library, и у него есть доступ к полю name внешнего класса Library.
public class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }

    public class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void printInfo() {
            System.out.println("Book title: " + title + ", Library: " + name);
        }
    }
}
