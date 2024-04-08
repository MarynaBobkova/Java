package hw10;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 *  Расчет численности населения
 */
public class PopulationGrowth {
    public static void main(String[] args) {
        int population = 14_000_000;
        int birthRate = 14;
        int deathRate = 8;
        int years = 10;

        for (int year = 1; year <= years; year++) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            population += (births - deaths);
        }

        System.out.println("Population after 10 years: " + population);
    }
}

