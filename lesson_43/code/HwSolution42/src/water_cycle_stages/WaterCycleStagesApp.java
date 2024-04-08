package water_cycle_stages;

/**
 * @author Andrej Reutow
 * created on 07.11.2023
 */
public class WaterCycleStagesApp {

    public static void main(String[] args) {
        WaterCycleStages stages = new WaterCycleStages();

        for (Stage stage : stages){
            System.out.println(stage);
        }
    }
}
