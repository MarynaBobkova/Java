package array_list;

import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {

    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
    }

    @Override
    public void add(T element) {
        if (size == elements.length) {
            growSize();
        }
        elements[size++] = element;
    }

    private void growSize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
//            throw new IllegalArgumentException("Неверный индекс!");
            System.out.println("Неверный индекс!");
            return null;
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
//            throw new IllegalArgumentException("Неверный индекс!");
            System.out.println("Неверный индекс!");
            return;
        }
        elements[index] = element;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, elements[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
//            throw new IllegalArgumentException("Неверный индекс!");
            System.out.println("Неверный индекс!");
            return null;
        }

        Object deletedElement = elements[index];

        System.arraycopy(elements, index + 1, elements, index, --size - index);

        return (T) deletedElement;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}