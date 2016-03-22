package ants;

import core.Ant;
import core.AntColony;
import core.Bee;
import core.Place;

/**
 * An invisible ant
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class NinjaAnt extends Ant {

    /**
     * Create a new NinjaAnt
     */
    public NinjaAnt() {
        super(1,6);
        this.damage = 1;
        this.hidden = true;
    }

    /**
     * Target Bees on the NinjaAnt
     * @param colony
     */
    @Override
    public void action (AntColony colony) {
        Place antPlace = this.getPlace();
        Bee[] targets = antPlace.getBees();
        for (int i = 0; i <= targets.length - 1; i++) {
            targets[i].reduceArmor(damage);
        }
    }
}

