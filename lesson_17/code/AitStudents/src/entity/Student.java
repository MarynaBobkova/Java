package entity;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Student {

    private int id; // значение по умолчанию 0
    private String name; // значение по умолчанию null
    private String lastName; // значение по умолчанию null
    private boolean isPresent; // значение по умолчанию false


    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Student(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
