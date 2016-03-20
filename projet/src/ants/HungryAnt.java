package ants;

import core.Ant;
import core.AntColony;
import core.Bee;
import core.Place;

import java.util.ArrayList;

/**
 * An Ant that eat a random bee
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class HungryAnt extends Ant {

    private int swallow_time = 0;

    /**
     * Create a new HungryAnt
     */
    public HungryAnt () {
        super(1,4);

    }


    /**
     * Returns a target for this ant
     *
     * @return A bee to target
     */
    public Bee getTarget () {
        return place.getClosestBee(0, 0);
    }

    @Override
    public void action (AntColony colony) {
        Bee target = getTarget();
        if (target != null && swallow_time <= 0) {
            target.reduceArmor(target.getArmor());
            swallow_time = 3;
        }

        else {
            swallow_time -= 1;
        }
    }
}
