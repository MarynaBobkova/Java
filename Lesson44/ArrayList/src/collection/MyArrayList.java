package collection;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private Object[] source;
    private int size;

    public MyArrayList() {
        source = new Object[16];
    }
    public MyArrayList(int capacity) {
        source = new Object[capacity];
    }

    // Добавляем элемент и увеличиваем размер массива, если нужно
    @Override
    public void add(E o) {
        if(size == source.length){
            int newSize = source.length + (source.length / 2);
            source = Arrays.copyOf(source,newSize);
        }
        source[size++] = o;

    }

    // Получаем элемент по индексу
    @Override
    public E get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (E) source[index];
    }
    // устанавливает объект по индексу, смещая объекты
    @Override
    public void set(E o, int index) {

        if(index >=0 && index < size) {
            if(size == source.length) {
                int newSize = source.length + (source.length / 2);
                source = Arrays.copyOf(source,newSize);
            }
            System.arraycopy(source,index, source, index+1, size - index);
            size++;
            source[index] = o;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == o){
                return true;
            }
        }
        return false;
    }

    // Удаляем элемент по значению
    @Override
    public boolean remove(E o) {
        for (int i = 0; i < source.length; i++) {
            if(source[i] == o){
                System.arraycopy(source, i+1, source, i, source.length - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    // Удаляем элемент по индексу
    @Override
    public E removeByIndex(int index) {
        if(index >=0 && index < size) {
            E removedElement = (E) source[index];
            System.arraycopy(source, index + 1, source, index, source.length - index - 1);
            size--;
            return removedElement;
        }
        return null;
    }
}
