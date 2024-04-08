package static_mod;

import java.util.Objects;
import java.util.Random;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */

public class Car {

    private static int counter = 0;

    private int id;
    private String make;
    private String model;
    private int year;
    private String vin;

    static {
        System.out.println("Статичный блок");
        System.out.println("Создается объект n " + (counter + 1));
    }

    {
        Random random = new Random();
        this.id = random.nextInt(1000);
    }


    public Car(String make, String model, int year, String vin) {
        System.out.println("Конструктор класса Car");
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
//        this.id = ++Car.counter;
    }


    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!Objects.equals(make, car.make)) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        int result = make != null ? make.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                '}';
    }
}

