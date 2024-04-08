package test.correct;

public class FirstProduct implements OurProduct {

    private int id;
    private String name;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}