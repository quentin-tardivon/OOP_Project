package ants;

import core.AntColony;
import core.Bee;

/**
 * A ant that stun bee
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class StunAnt extends ThrowerAnt{

    /**
     * Create a new StunAnt
      */
    public StunAnt() {
        super(1,6);
        setDamage(1);
    }

    /**
     * Stun near bees
     * @param colony
     */
    @Override
    public void action (AntColony colony) {
        Bee target = getTarget();
        if (target != null) {
            target.reduceArmor(damage);
            target.setStun(true);
        }

    }


}
