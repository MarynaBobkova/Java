package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class OurArrayList<E> implements OurList<E> {

    private Object[] source;
    private static final int INITIAL_CAPACITY = 16;
    private int size;

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        for (Object object : source) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(E value) {
        if (source.length == size) {
            int newCapacity = size + (size / 2); // Увеличиваем размер в 1.5 раза
            source = grow(newCapacity);
        }
        source[size] = value;
        size++;
    }

    private Object[] grow(int newCapacity) {
        int oldCapacity = source.length;

        if (oldCapacity == Integer.MAX_VALUE) {
            // Массив уже достиг максимального размера
            throw new OutOfMemoryError("Array size cannot be increased beyond Integer.MAX_VALUE");
        }

        // Проверяем, не приведет ли увеличение к переполнению
        if (newCapacity < 0) {
            // Устанавливаем максимально возможный размер для массива
            newCapacity = Integer.MAX_VALUE;
        }

        return Arrays.copyOf(source, newCapacity);
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return (E) source[index];
    }

    @Override
    public void set(E value, int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        source[index] = value;
    }

    @Override
    public boolean remove(E value) {
        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(value)) {
                removeById(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public E removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        E result = (E) source[index];

        System.arraycopy(source, index + 1, source, index, source.length - (index + 1));
        size--;
        return result;
    }

    public E max() {
        if (source.length == 0)
            throw new EmptyListException();

        Object[] copy = new Object[size];
        System.arraycopy(source, 0, copy, 0, size);
        Arrays.sort(copy);

        return (E) copy[copy.length - 1];
    }

    public E min() {
        if (size == 1 || size == 0) {
            return (E) source[0];
        }
        Object[] copy = new Object[size];
        System.arraycopy(source, 0, copy, 0, size);
        Arrays.sort(copy);
        return (E) copy[0];
    }

    public void sort(Comparator comparator) {
        Arrays.sort(source, comparator);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int currentEltId = 0;

            @Override
            public boolean hasNext() {
                return currentEltId < size;
            }

            @Override
            public E next() {
                return get(currentEltId++);
            }
        };
    }
}
