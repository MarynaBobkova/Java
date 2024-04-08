package inheritance.auto.child;

import inheritance.auto.model.Auto;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */
public class Bus extends Auto {

    public void transportPassengers() {
        System.out.println("bus");
        printDetails();
    }
}
