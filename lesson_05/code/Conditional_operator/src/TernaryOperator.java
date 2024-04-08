/**
 * @author Andrej Reutow
 * created on 11.09.2023
 */
public class TernaryOperator {

    public static void main(String[] args) {
//        String message = checkAge(20);
//        System.out.println(message);

        int age = 17;
        String messageV2 =
                age > 17 ?                                                  // if (age > 17)
                        "Все в порядке, проходите!" :                      //  {return "Все в порядке, проходите!";}
                        "Этот фильм не подходит для вашего возраста!";     //  else {return "Этот фильм не подходит для вашего возраста!"}

        System.out.println(messageV2);
    }

    public static String checkAge(int age) {
        String message = "";

        if (age > 17) {
            message = "Все в порядке, проходите!";
        } else {
            message = "Этот фильм не подходит для вашего возраста!";
        }

        return message;
    }
}
