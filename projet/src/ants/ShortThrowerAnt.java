package ants;

import core.Bee;

/**
 * Created by quentin on 05/03/16.
 */
public class ShortThrowerAnt extends ThrowerAnt {

    public ShortThrowerAnt() {
        super(1,3);
    }

    @Override
    public Bee getTarget() {
        return place.getClosestBee(0, 2);
    }
}
