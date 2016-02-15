package ants;

import core.Ant;
import core.AntColony;

/**
 * A Ant that fire the colony when whe die
 * @author Quentin TARDIVON
 */
public class FireAnt extends Ant {

    protected int damage;

    /**
     * Create a FireAnt
     */
    public FireAnt () {
        super(1);
        foodCost = 4;
        damage = 3;
    }


    @Override
    public void action(AntColony colony) {
        //Nothing
    }

    /*
     *
     * @param amount

    @Override
    public void reduceArmor(int amount) {
        super.reduceArmor();
        Bee[] bees = place.getBees();
        Bee[] targets = bees[this.getPlace()];
        if (this.getArmor() <= 0 && targets!= null) {
            for (int i = 0; i <= targets.length(); i++) {
                targets[i].reduceArmor(damage);
            }
        }
    }
*/

}
