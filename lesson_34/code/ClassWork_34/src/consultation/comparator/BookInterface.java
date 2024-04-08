package consultation.comparator;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public class BookInterface implements CRUDInterface<Book, Long>{
    @Override
    public Long add(Book entity) {
        return null;
    }

    @Override
    public void removeByID(Long id) {

    }
}
