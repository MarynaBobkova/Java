package task1;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class Box<T> { // <T> T = Integer

    T value;
    //  Integer value;

    public Box(T value) {
        this.value = value;
    }
//    public Box(Integer value) {
//        this.value = value;
//    }

    public T getContent() {
        return this.value;
    }
//    public Integer getContent() {
//        return this.value;
//    }
}
