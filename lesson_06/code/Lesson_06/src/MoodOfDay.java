/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class MoodOfDay {

    public static void main(String[] args) {
        int result = getDaysInMonth(5);
        System.out.println("Месяц 5, дней " + result);

        result = getDaysInMonth(20);
        System.out.println("Месяц 20, дней " + result);

        result = getDaysInMonth(9);
        System.out.println("Месяц 9, дней " + result);
    }

    public static int getDaysInMonth(int monthNumber) {
        int result;

//        if (monthNumber == 1 | monthNumber == 3 | monthNumber == 5 ...) {
//            result = 31;
//        } else if (monthNumber == 4 | monthNumber == 6 | monthNumber == 9 ...) {
//            result = 30;
//        } else if (monthNumber == 2) {
//            result = 28;
//        } else {
//            result = -1;
//        }

        //1,3,5,7,8,10,12 - 31
        //4,6,9,11 - 30
        //2 - 28
        //-1 в случе не верного месяца.
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                result = 28;
                break;
            default:
                System.out.println("Месяц " + monthNumber + " не существует");
                result = -1;
        }

        return result;
    }

}
