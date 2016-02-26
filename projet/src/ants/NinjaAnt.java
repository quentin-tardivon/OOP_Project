package ants;

import core.Ant;
import core.AntColony;
import core.Bee;
import core.Place;

/**
 * Created by quentin on 26/02/16.
 */
public class NinjaAnt extends Ant {

    protected int damage;

    public NinjaAnt() {
        super(1,6);
        this.damage = 1;
        this.hidden = true;
    }


    @Override
    public void action (AntColony colony) {
        Place antPlace = this.getPlace();
        Bee[] targets = antPlace.getBees();
        for (int i = 0; i <= targets.length - 1; i++) {
            targets[i].reduceArmor(damage);
        }
    }
}

