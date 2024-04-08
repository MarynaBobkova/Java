public class HomeWork2_1 {

    //HomeWork2_1


    public static void main(String[] args) {
        /*  Как вас зовут?
            Меня зовут Якуб
            Как к вам обращаться на занятиях?
            Андрей
            Вы не против со временем перейти на ты?
            Со временем, да
            В каком городе сейчас проживаете?
            Berlin
         */

        System.out.println("Как вас зовут?");
        yourName();
        System.out.println("Как к вам обращаться на занятиях?");
        yourNickname();
        System.out.println("Вы не против со временем перейти на ты?");
        casualTalk();
        System.out.println("В каком городе сейчас проживаете?");
        currentCity();
    }

    public static void currentCity() {
        System.out.println("Я живу в городе Beckum");
    }

    public static void yourNickname() {
        System.out.println("Якуб");
    }

    public static void yourName() {
        System.out.println("Меня зовут Якуб Османов");
    }

    public static void casualTalk() {
        System.out.println("Я не против перейти на ты");
    }

}
