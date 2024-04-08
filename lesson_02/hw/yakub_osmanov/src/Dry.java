import java.util.Random;

public class Dry {

    public static void main(String[] args) {

        Random rnd = new Random();
        String[] names = {"Саша", "Маша", "Вася", "Петя"};

        // Познакомимся со всеми
        for (String name : names) {

            myName();
            yourName(name);

        }

    }

    public static void myName() {

        Random rnd = new Random();
        String[] sent = {"Привет, меня зовут", "Привет, моё имя", "Привет, меня звать -"};
        System.out.println(sent[rnd.nextInt(sent.length)] + " Якуб");

    }

    public static void yourName(String name) {

        System.out.println("Привет, а меня зовут " + name);
        bye(name);

    }

    public static void bye(String name) {

        System.out.println("Пока, " + name + ". Хорошего вечера!");

    }

}
