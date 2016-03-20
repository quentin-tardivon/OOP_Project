package ants;

import core.Bee;


/**
 *@author Quentin TARDIVON, Maxime ESCAMEZ
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
