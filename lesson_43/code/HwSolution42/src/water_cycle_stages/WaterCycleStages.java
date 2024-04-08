package water_cycle_stages;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WaterCycleStages implements Iterable<Stage> {

    private final Stage[] STAGES;

    public WaterCycleStages() {
        STAGES = new Stage[]{Stage.EVAPORATION, Stage.CONDENSATION, Stage.PRECIPITATION};
        //или обратиться к enum Stage.values()
        //STAGES = Stage.values();
    }

    @Override
    public Iterator<Stage> iterator() {
        return new WaterCycleIterator();
    }

    private class WaterCycleIterator implements Iterator<Stage> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < STAGES.length;
        }

        @Override
        public Stage next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return STAGES[currentIndex++];
        }
    }
}
