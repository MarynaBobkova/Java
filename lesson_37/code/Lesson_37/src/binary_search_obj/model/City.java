package binary_search_obj.model;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class City implements Comparable<City>{

    private String name;
    private long population;

    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        City city = (City) object;

        if (population != city.population) return false;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (population ^ (population >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return (int) (this.population - o.population);
    }
}
