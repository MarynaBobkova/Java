package linked_list;

public class MyLinkedList<T> implements MyList<T> {
    private int size;
    private Node<T> first;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if(isEmpty()) {
            first = newNode;
        } else {
            Node<T> current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size){
            System.out.println("Некорректный индекс!");
            return null;
        }
        if(isEmpty()){
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Некорректный индекс!");
            return null;
        }
        if (isEmpty()) {
            return null;
        }
        T removedValue;
        if (index == 0) {
            removedValue = first.getValue();
            first = first.getNext();
        } else {
            Node<T> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            removedValue = current.getNext().getValue();
            current.setNext(current.getNext().getNext());
        }
        size--;
        return removedValue;
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
        if(index < 0 || index >= size){
            System.out.println("Некорректный индекс!");
            return;
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setValue(element);
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = first;
        while (current.getNext() != null) {
            if(current.equals(element)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = first;
        while (current != null) {
            builder.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}