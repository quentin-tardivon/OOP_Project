package ants;


/**
 * Created by quentin on 26/02/16.
 */
public class ScubaThrowerAnt extends ThrowerAnt {



    public ScubaThrowerAnt() {
        super(1,5);
        damage = 1;
        this.watersafe = true;
    }

    public ScubaThrowerAnt(int armor, int foodCost) {
        super(armor,foodCost);
        damage = 1;
        this.watersafe = true;
    }

}
