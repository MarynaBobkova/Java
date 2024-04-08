package task2;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class TowerPc extends Device {

    private boolean hasSecondDisplayPort;

    public TowerPc(String videoCard, String ram, String cpu, String hdd, boolean hasSecondDisplayPort) {
        super(videoCard, ram, cpu, hdd);
        this.hasSecondDisplayPort = hasSecondDisplayPort;
    }
}
