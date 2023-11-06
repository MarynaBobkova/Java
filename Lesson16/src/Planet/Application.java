package Planet;

public class Application {

    public static void main(String[] args) {
        Planet planetMars = new Planet("Mars", 500);
        Planet planetEarth = new Planet("Earth", 200);
        Planet planetJupiter = new Planet("Jupiter", 400);

        System.out.println(planetMars);

        System.out.println(planetMars.getName());
        System.out.println(planetJupiter.getName());
        System.out.println(planetEarth.getName());
        System.out.println();

        System.out.println("Имя планеты " + planetMars.getName() + ", размер: " + planetMars.gerSize());
        System.out.println();


        planetMars.setName("ABC");

        System.out.println(planetMars.getName());
        System.out.println(planetEarth.getName());
        System.out.println(planetJupiter.getName());


    }
}
