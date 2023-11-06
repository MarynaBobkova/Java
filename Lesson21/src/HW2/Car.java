package HW2;

import java.util.Objects;

/*
Создайте класс HW2.Car с полями make, model, year, и vin (идентификационный номер автомобиля).
Переопределите методы equals(), hashCode() и toString() для этого класса. Затем создайте несколько объектов класса HW2.Car
и проверьте, как работают переопределенные методы.
Создайте несколько объектов класса HW2.Car с разными параметрами
Сравните объекты с использованием метода
 */
public class Car extends Auto {
    private String make;
    private String model;
    private int year;
    private String vin;

    public Car(String make, String model, int year, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

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
        return "Entity: HW2.Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                '}';
    }
}
