public class WeekDays {
    //занести в массив дни недели
    //вывести на печать вторник, среда, пятниуа
    // распечатаем массивы задом на перед

    public static void main(String[] args) {
        int day1 = 1;
        int day2 = 2;
        int day3 = 3;

        int[] dayWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(dayWeek[0]);
        System.out.println(dayWeek[6]);

        String[] dayWeekString = {"Monday", "Tuesday", "Wednesday", "Thursday", "Freiday", "Saturday", "Sunday"};
        System.out.println(dayWeekString[0]);
        System.out.println(dayWeekString[6]);

        //Tuesday  Wednesday Freiday
        System.out.println(dayWeek[1]);
        System.out.println(dayWeek[2]);
        System.out.println(dayWeek[4]);

        System.out.println(dayWeekString[1]);
        System.out.println(dayWeekString[2]);
        System.out.println(dayWeekString[4]);

        //print dayWeek
        for (int i = 0; i < dayWeek.length; i++) {
            System.out.println(dayWeek[i] + " ");
        }
        System.out.println();
        //print dayWeekString
        for (int i = 0; i < dayWeekString.length; i++) {
            System.out.println(dayWeekString[i] + " ");
        }

        // распечатаем массивы задом на перед
        for (int i = dayWeek.length - 1; i >= 0; i--) {
            System.out.println(dayWeek[i] + " ");
        }
        System.out.println();
        for (int i = dayWeekString.length - 1; i >= 0; i--) {
            System.out.println(dayWeekString[i] + " ");
        }
        System.out.println();
        System.out.println("Week in Arabic style:");

        printWeekArabic(dayWeekString);//вызываем метод и передаем в него массив

    }

    public static void printWeekArabic(String[] str) {
        //print Sunday
        System.out.print(str[6] + " ");
        //print rest of the week in cycle
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
