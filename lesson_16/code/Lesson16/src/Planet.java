/**
 * @author Andrej Reutow
 * created on 26.09.2023
 */
public class Planet {

    // поля класса
    private String name;
    private long size;

    // конструктор
    public Planet(String name, long size) {
        this.name = name;
        this.size = size;
    }

    // геттер для поля имя
    public String getName() {
        return this.name;
    }

    // сеттер для поля имя
    public void setName(String name) {
        this.name = name;
    }

    // геттер для поля size
    public long getSize() {
        return this.size;
    }

    // сеттер для поля size
    public void setSize(long size) {
        this.size = size;
    }

    public void printDetails() {
        System.out.println("Имя планеты " + this.name + ", размер: " + this.size);
    }
}
