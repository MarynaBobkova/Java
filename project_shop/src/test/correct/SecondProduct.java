package test.correct;

public class SecondProduct implements OurProduct {

    private int id;
    private String label;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return label;
    }
}