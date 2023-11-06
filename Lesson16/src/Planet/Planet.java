package Planet;

public class Planet {
    private String name;
    private long size;

    public Planet(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public long gerSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Имя планеты " + getName() + ", размер: " + gerSize();
    }
}
