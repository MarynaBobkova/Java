package auto;

public class Auto {
    private  String model;
    private  int year;
    private  String color;
    private int power;

    public  void printDetails(){
        System.out.println("Model " + this.model + ", year" + this.year);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
