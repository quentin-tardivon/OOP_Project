package ants;

import core.Bee;

/**
 * A short thrower ant
 *
 *@author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class ShortThrowerAnt extends ThrowerAnt {

    /**
     * Create a new ShortThrowerAnt
     */
    public ShortThrowerAnt() {
        super(1,3);
    }

    /**
     * Shoot near bees
     * @return
     */
    @Override
    public Bee getTarget() {
        return place.getClosestBee(0, 2);
    }
}
