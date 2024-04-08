package i.incorrect;

public class Adult implements Person {

    @Override
    public void study() {
        // Просто заглушка, т.к. метод не нужен
    }

    @Override
    public void work() {
        System.out.println("Я работаю!");
    }

    @Override
    public void walkWithKid() {
        System.out.println("Я гуляю с ребёнком!");
    }
}