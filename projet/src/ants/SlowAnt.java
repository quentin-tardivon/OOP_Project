package ants;

import core.AntColony;
import core.Bee;

/**
 * An ant that slow bees
 *
 *@author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class SlowAnt extends ThrowerAnt{

    /**
     * Create a new SlowAnt
     */
    public SlowAnt(){
        super(1,4);
        setDamage(1);
    }

    /**
     * Slow the shot ant
     * @param colony
     */
    public void action(AntColony colony) {
        Bee target = getTarget();
        if (target != null) {
            target.reduceArmor(damage);
            target.setSlow(true);
        }
    }

}
