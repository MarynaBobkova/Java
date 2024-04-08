package pizza1;

public class Contestant {

    private String name;
    private int slicesEaten;

    public Contestant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSlicesEaten() {
        return slicesEaten;
    }

    public void setSlicesEaten(int slicesEaten) {
        this.slicesEaten = slicesEaten;
    }
}
