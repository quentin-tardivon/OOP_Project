package ants;


/**
 * An ant that can swim
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class ScubaThrowerAnt extends ThrowerAnt {

    /**
     * Create a new ScubaAnt
     */
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
