package class_work;

public class BoxAppRunner {
    public static void main(String[] args) {
        BoxSimple boxSimpleInteger = new BoxSimple(1);
        BoxSimpleString boxSimpleString = new BoxSimpleString("Hello World!");

        Integer boxIntResult = boxSimpleInteger.getCountent();
        String boxStringResilt = boxSimpleString.getCountent();

        Box boxO = new Box(5);
        Box boxS = new Box("Hello World");
        Box boxC = new Box('C');

        System.out.println(boxO.getContent() instanceof Integer);
        System.out.println(boxS.getContent() instanceof String);
        System.out.println(boxC.getContent() instanceof Character);

        Box<Car> boxCar = new Box<>(new Car("TT"));
        System.out.println(boxCar.getContent() instanceof Car);

        Car unboxedCar = boxCar.getContent();
        unboxedCar.getModel();

        Box<Integer> boxInteger= new Box<>(1);
        Box<String> boxString= new Box<>("Hello Word");

    }
}
