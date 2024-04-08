package i.correct;

public class Adult implements Parent, Employee {

    @Override
    public void work() {
        System.out.println("Я работаю!");
    }

    @Override
    public void walkWithKid() {
        System.out.println("Я гуляю с ребёнком!");
    }
}