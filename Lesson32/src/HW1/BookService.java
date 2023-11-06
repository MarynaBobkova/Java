package HW1;

import HW1.entity.Book;

public class BookService implements ICrudService <Book, Integer> {
    private final Book[] SOURCE = new Book[10];

    @Override
    public Book add() {
        for (int i = 0; i < SOURCE.length; i++) {
            if(SOURCE[i] == null) {
                SOURCE[i] = new Book();
                return SOURCE[i];
            }
        }
        return null;
    }

    @Override
    public Book get(Integer id) {
        for (int i = 0; i < SOURCE.length; i++) {
            if(SOURCE[i].getId() == id){
                return SOURCE[i];
            }
        }
        return null;
    }

    @Override
    public Book[] getAll() {
        return SOURCE;
    }

    @Override
    public Book edit(Integer id) { //Чем отличается от метода get???
        return null;
    }

    @Override
    public boolean remove(Integer id) {
        for (int i = 0; i < SOURCE.length; i++) {
            if (SOURCE[i].getId() == id) {
                SOURCE[i] = null;
                return true;
            }
        }
        return false;
    }
}
