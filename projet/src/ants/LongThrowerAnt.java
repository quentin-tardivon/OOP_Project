package ants;

import core.Bee;


/**
 * A longthrower ant
 *
 *@author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class LongThrowerAnt extends ThrowerAnt {

    /**
     * Create a new LongThrowerAnt
     */
    public LongThrowerAnt() {
        super(1,3);
    }

    /**
     * Target bees
     * @return
     */
    @Override
    public Bee getTarget() {
        return place.getClosestBee(0, 4);
    }
}
