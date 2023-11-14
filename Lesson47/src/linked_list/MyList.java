package linked_list;

public interface MyList<T> {
    public void add(T element);
    T get(int index);
    T remove(int index);
    int size();
    boolean isEmpty();
    void set(int index, T element);
    boolean contains(T element);


}
