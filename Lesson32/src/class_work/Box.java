package class_work;


public class Box<T> { // <T, .., ..,>
    private T value;
    public Box(T value){
        this.value = value;
    }
    public T getContent() {
        return this.value;
    }
}
