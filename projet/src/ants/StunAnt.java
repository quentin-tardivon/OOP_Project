package ants;

import core.AntColony;
import core.Bee;

/**
 * Created by quentin on 18/03/16.
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
