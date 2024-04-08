package task2;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Laptop extends Device {

    private String webCam;

    public Laptop(String videoCard, String ram, String cpu, String hdd, String webCam) {
        super(videoCard, ram, cpu, hdd);
        this.webCam = webCam;
    }
}
