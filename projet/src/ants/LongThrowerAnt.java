package ants;

import core.Bee;


/**
 * Created by quentin on 05/03/16.
 */
public class LongThrowerAnt extends ThrowerAnt {

    public LongThrowerAnt() {
        super(1,3);
    }

    @Override
    public Bee getTarget() {
        return place.getClosestBee(0, 4);
    }
}
