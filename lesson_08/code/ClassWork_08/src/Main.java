/**
 * @author Andrej Reutow
 * created on 14.09.2023
 */
public class Main {
    public static void main(String[] args) {
        int floor = 9;

//        lift(floor);  // 9
        lift(floor, false); // 1
//        lift(2); // 2
//        lift(20);// 20
    }

    // floor = 9, hasCard = false
    public static void lift(int floor, boolean hasCard) {
        if (!hasCard){
            System.out.println("Доступ запрещен");
        } else {

            switch (floor) {
                case 4:
                    System.out.println("Мы на 4 этаже");
                    break;
                case 1:
                    System.out.println("Мы на 1 этаже");
                    break;
                case 2:
                    System.out.println("Мы на 2 этаже");
                    break;
                case 3:
                    System.out.println("Мы на 3 этаже");
                    break;
                case 5:
                    if (hasCard) {
                        System.out.println("Мы на 5 этаже");
                    } else {
                        System.out.println("Доступ запрещен");
                    }
                    break;
                default:
                    System.out.println("Такого этажа не существует");
            }


        }



    }
}
