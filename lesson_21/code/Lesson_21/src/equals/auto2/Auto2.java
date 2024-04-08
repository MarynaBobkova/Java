package equals.auto2;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class Auto2 {

    private String brand;
    private String model;

    public Auto2(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) { // равны ли ссылки объектов
            return true;
        }
        if (!(o instanceof Auto2)) { // является ли сравниваемый объект (o) типом Auto
            return false;
        }

        Auto2 auto = (Auto2) o; // приводим объект o к нужному типу, т.е. к типу Auto

        boolean result = this.brand.equals(auto.brand) && this.model.equals(auto.model); // сраниваем значение полей текущего объекта с объектоми o
        return result;

//        return this.brand.equals(auto.brand) && this.model.equals(auto.model);
    }


    @Override
    public String toString() {
        return "Auto2: {" +
                " brand: " + this.brand +
                ", model: " + this.model +
                "}";
    }
}
