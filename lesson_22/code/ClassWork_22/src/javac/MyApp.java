package javac;


import javac.model.Auto;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class MyApp {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Auto brand:");
        String brand = scanner.nextLine();
        System.out.println("Auto model:");
        String model = scanner.nextLine();

        Auto auto = new Auto(brand, model);

        System.out.println(auto);
    }

}
