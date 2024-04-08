public class Task1 {

    public static void currentCity() {
        System.out.println("Mönchengladbach");
    }

    public static void yourNickname() {
        System.out.println("Дима, Дмитрий, как Вам удобнее");
    }

    public static void yourName() {
        System.out.println("Дмитрий");
    }

    public static void casualTalk() {
        System.out.println("C удовольствием!");
    }

    public static void Q_currentCity() {
        System.out.println("В каком городе сейчас проживаете?");
    }

    public static void Q_yourNickname() {
        System.out.println("Как к Вам обращаться на занятиях?");
    }

    public static void Q_yourName() {
        System.out.println("Как Вас зовут?");
    }

    public static void Q_casualTalk() {
        System.out.println("Вы не против со временем перейти на ты?");
    }

    public static void main(String[] args) {
        Q_yourName();
        yourName();
        Q_yourNickname();
        yourNickname();
        Q_casualTalk();
        casualTalk();
        Q_currentCity();
        currentCity();
    }

}