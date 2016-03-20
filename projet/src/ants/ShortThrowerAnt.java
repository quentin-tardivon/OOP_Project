package ants;

import core.Bee;

/**
 *@author Quentin TARDIVON, Maxime ESCAMEZ
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
