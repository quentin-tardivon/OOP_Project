package ants;

import core.AntColony;
import core.Bee;

/**
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class StunAnt extends ThrowerAnt{

   public StunAnt() {
        super(1,6);
        setDamage(1);
    }

    @Override
    public void action (AntColony colony) {
        Bee target = getTarget();
        if (target != null) {
            target.reduceArmor(damage);
            target.setStun(true);
        }

    }


}
