package consultation.comparator;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public interface CRUDInterface<T, R> {

    R add(T entity);
    void removeByID(R id);
}
