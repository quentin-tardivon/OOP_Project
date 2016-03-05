package ants;

import core.Ant;
import core.AntColony;
import core.Bee;
import core.Place;

/**
 * A Ant that fire the colony when whe die
 * @author Quentin TARDIVON
 */
public class FireAnt extends Ant {



    /**
     * Create a FireAnt
     */
    public FireAnt () {
        super(1,4);
        damage = 3;
    }


    @Override
    public void action(AntColony colony) {
        //Nothing
    }


    @Override
    public void reduceArmor(int amount) {
        Place antPlace = this.getPlace();
        super.reduceArmor(amount);
        if (this.getArmor() <= 0) {
            Bee[] targets = antPlace.getBees();
            System.out.println(targets);
            for (int i = 0; i <= targets.length - 1; i++) {
                targets[i].reduceArmor(damage);
            }
        }
    }


}
