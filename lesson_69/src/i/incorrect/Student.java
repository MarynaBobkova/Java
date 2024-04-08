package i.incorrect;

public class Student implements Person {

    @Override
    public void study() {
        System.out.println("Я учусь!");
    }

    @Override
    public void work() {
        // Заглушка, т.к. метод здесь не нужен
    }

    @Override
    public void walkWithKid() {
        // Заглушка, т.к. метод здесь не нужен
    }
}