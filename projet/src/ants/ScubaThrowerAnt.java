package ants;

import core.Ant;

/**
 * Created by quentin on 26/02/16.
 */
public class ScubaThrowerAnt extends ThrowerAnt {

    protected int damage;

    public ScubaThrowerAnt() {
        super(1,5);
        damage = 1;
        this.watersafe = true;
    }

}
