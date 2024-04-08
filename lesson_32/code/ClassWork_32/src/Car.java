public class Car {

    /**
     * Статический счетчик. В этом примере используется для автоматической установки id в конструкторе
     */
    private static int carIdCounter = 0;

    private final Integer ID; // коснтанта/финальная переменная. Id не должна быть изменяемой после инициализации в конструкторе
    private String brand;
    private String model;

    public Car(String brand,
               String model) {
        carIdCounter++; // добавляем 1 к каждому новому созданному объекту. Если объект создается через этот конструктор

        this.ID = carIdCounter; // присвоение значения для ID на основе счетчика
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
