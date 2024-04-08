package task2;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Handy extends Device {

    private String simCard;

    public Handy(String videoCard, String ram, String cpu, String hdd, String simCard) {
        super(videoCard, ram, cpu, hdd);
        this.simCard = simCard;
    }
}
