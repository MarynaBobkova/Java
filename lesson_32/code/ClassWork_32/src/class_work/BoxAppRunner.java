package class_work;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class BoxAppRunner {

    public static void main(String[] args) {
        BoxSimple boxSimpleInteger = new BoxSimple(1);
        BoxSimpleString boxSimpleString = new BoxSimpleString("Hello World!");

        Integer boxIntResult = boxSimpleInteger.getContent();
        String boxStringResult = boxSimpleString.getContent();

        Box boxO = new Box(5); // обобщенный класс Box без использования generics
        Box boxS = new Box("Hello");
        Box boxC = new Box('C');

        System.out.println(boxO.getContent() instanceof Integer);
        System.out.println(boxS.getContent() instanceof String);
        System.out.println(boxC.getContent() instanceof Character);

        Box<Car> boxCar = new Box<>(new Car("TT"));

        System.out.println(boxCar.getContent() instanceof Car);

        Car unboxedCar = boxCar.getContent();
        unboxedCar.getModel();

        // перепишете BoxSimple, BoxSimpleString используя generic и класс Box
        Box<Integer> integerBox = new Box<>(9);
        Box<String> stringBox = new Box<>("String");
        Integer intResult = integerBox.getContent();
        String resStr = stringBox.getContent();
    }
}
