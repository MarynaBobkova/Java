package to_string;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class Auto extends Object{

    private String brand;
    private String model;

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString(){
        return "Bla bla bla!";
    }
}
