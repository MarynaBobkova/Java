package task1;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 */
public class User {
    // поля класса
    private String name;
    private long age;
    private String email;


    // конструктор
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // геттер для поля имя
    public String getName() {
        return this.name;
    }

    // сеттер для поля имя
    public void setName(String name) {
        this.name = name;
    }

    // геттер для поля возраст
    public long getAge() {
        return this.age;

    }

    // сеттер для поля возраст
    public void setAge(long age) {
        this.age = age;
    }

    // геттер для поля email
    public String getEmail() {
        return this.email;
    }

    // сеттер для поля email
    public void setEmail(String email){
        this.email = email;

    }



}
