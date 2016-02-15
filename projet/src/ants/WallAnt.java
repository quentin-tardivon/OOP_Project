package ants;

import core.Ant;
import core.AntColony;

/**
 * An ant that protect the colony
 *
 * @author Quentin TARDIVON
 */
public class WallAnt extends Ant {
    /**
     * Create a new WallAnt
     */

    public WallAnt () {
        super(4); //The armor value
        foodCost = 4;
    }

    @Override
    public void action (AntColony colony) {
        //Nothing
    }
}
