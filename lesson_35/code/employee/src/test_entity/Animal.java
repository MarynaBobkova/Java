package test_entity;

import tools.Id;

/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class Animal implements Id {
    @Override
    public long getId() {
        return 1;
    }
}
