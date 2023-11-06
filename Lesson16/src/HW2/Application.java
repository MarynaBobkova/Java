package HW2;

public class Application {
    public static void main(String[] args) {
        Book fantasy = new Book("Harry Poter and Philosopher's Stone", "J.Rowling", 1997, "978-76-60");
        Book fantasy2  = new Book("Harry Poter and Chamber of Secrets", "J.Rowling", 1998, "234-56-78");

        System.out.println("Title: " + fantasy.getTitle() + ", author: " + fantasy.getAuthor()+ ", year: " + fantasy.getYear());
        System.out.println("Title: " + fantasy2.getTitle() + ", author: " + fantasy2.getAuthor() + ", year: " + fantasy2.getYear() + ", ISBN: " + fantasy2.getIsbn());
        System.out.println();

        fantasy2.setTitle("Harry Poter and Prisoner of Azkaban");
        fantasy2.setYear(2000);
        System.out.println("Title: " + fantasy2.getTitle() + ", author: " + fantasy2.getAuthor() + ", year: " + fantasy2.getYear() + ", ISBN: " + fantasy2.getIsbn());




    }
}
