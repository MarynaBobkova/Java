package solution;

//Написать программу, определяющую, является ли год високосным.
// Для того чтобы год был високосным,
// он должен: делится без остатка на 4 и,
// либо не должен делится без остатка на 100, либо если он делится на 100,
// то он должен делится также на 400. Проверить на годах 1700, 1800, 1900 - не високосные,
// а 2000 високосный.
public class LeapYearChecker {

    public static void main(String[] arg) {
        int year1 = 1700;
        int year2 = 1800;
        int year3 = 1900;
        int year4 = 2000;

        boolean isLeapYear = isLeapYear(year1);
        printResult(isLeapYear);

        isLeapYear = isLeapYear(year2);
        printResult(isLeapYear);

        isLeapYear = isLeapYear(year3);
        printResult(isLeapYear);

        isLeapYear = isLeapYear(year4);
        printResult(isLeapYear);
    }

    public static void printResult(boolean isLeapYear) {
        if (isLeapYear) {
            System.out.println("год является високосным.");
        } else {
            System.out.println("год не является високосным.");
        }
    }

    // делится без остатка на 4 и,
    // либо не должен делится без остатка на 100,
    //  либо если он делится на 100,
    //// то он должен делится также на 400
    public static boolean isLeapYear(int year) {
        boolean result;
        // 1700 % 4 == 0 делится без остатка на 4
        // 1700 % 100 != 0 е должен делится без остатка на 100
        // (1700 % 100 == 0 & 1700 % 400 == 0) либо если он делится на 100 то он должен делится также на 400

        if ((year % 4 == 0 & year % 100 != 0) | (year % 100 == 0 & year % 400 == 0)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
