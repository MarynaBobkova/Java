package task2;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Device {

    private String videoCard;
    private String ram;
    private String cpu;
    private String hdd;


    public Device(String videoCard, String ram, String cpu, String hdd) {
        this.videoCard = videoCard;
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
}
