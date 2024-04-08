package collection;

/**
 * @author Andrej Reutow
 * created on 09.11.2023
 */
public interface OurList<E> extends Iterable {
    void add(E o);

    E get(int index);

    void set(E o, int index);

    int size();

    boolean contains(E o);

    boolean remove(E o);

    E removeById(int index);
}
