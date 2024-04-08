/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */

//пишите программу, которая принимает оценку студента и выводит соответствующую ей буквенную оценку.
//
//"A" для баллов от 90 до 100.
//"B" для баллов от 80 до 89.
//"C" для баллов от 70 до 79.
//"F" для баллов ниже 70.
public class GradeConverter {

    public static void main(String[] args) {
        char resultBy70 = convertGrade(-70);
        print(resultBy70, -70);

        char resultBy90 = convertGrade(90);
        print(resultBy90, 90);

        char resultBy75 = convertGrade(75);
        print(resultBy75, 75);

        char resultBy120 = convertGrade(120);
        print(resultBy120, 120);
    }

    public static void print(char result, int points) {
        if (result != 'O') {
            System.out.println("балов:" + points + " " + result);
        }
    }

    //"A" для баллов от 90 до 100.
    //"B" для баллов от 80 до 89.
    //"C" для баллов от 70 до 79.
    //"F" для баллов ниже 70.
    public static char convertGrade(int points) {
        char result;
           //от 90 до 100
        if (points >= 90 & points <= 100) {
            result = 'A';
            // от 80 до 89
        } else if (points >= 80 & points <= 89) {
            result = 'B';
            // от 70 до 79
        } else if (points >= 70 & points <= 79) {
            result = 'C';
            // ниже 70
        } else if (points <= 69 & points >= 0) {
            result = 'C';
        } else {
            System.out.println("Недопустимое количество баллов (" + points + ")");
            result = 'O';
        }
        return result;
    }
}
