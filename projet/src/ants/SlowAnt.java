package ants;

import core.AntColony;
import core.Bee;

/**
 * Created by quentin on 18/03/16.
 */
public class SlowAnt extends ThrowerAnt{

    public SlowAnt(){
        super(1,4);
        setDamage(1);
    }

    public void action(AntColony colony) {
        Bee target = getTarget();
        if (target != null) {
            target.reduceArmor(damage);
            target.setSlow(true);
        }
    }

}
