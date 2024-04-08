package array_list;

public interface MyList<T> {

    // Добавляем новый элемент в лист
    void add(T element);

    // Получаем элемент из листа по его индексу
    T get(int index);

    // Получаем размер листа, то есть количество элементов
    int size();

    // Позволяет узнать, пустой наш лист или нет
    boolean isEmpty();

    // Заменяем старое значение на новое по указанному индексу
    void set(int index, T element);

    // Проверяем, содержится ли в листе указанный элемент
    boolean contains(T element);

    // Удаляем элемент из листа по указанному индексу
    T remove(int index);
}