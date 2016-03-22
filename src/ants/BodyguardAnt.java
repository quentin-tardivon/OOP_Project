package ants;

import core.Ant;
import core.AntColony;
import core.Containing;

/**
 * An ant that protects an another ant
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class BodyguardAnt extends Ant implements Containing  {

    private Ant contain = null;

    /**
     * Create a bodyguard ant
     */
    public BodyguardAnt() {
        super(2,5);
    }

    /**
     * Ne fais pas d'action
     * @param colony
     */
    public void action(AntColony colony) {
    }

    /**
     *
     * @param ant to add
     * @return
     */
    public boolean addContenantInsect(Ant ant) {
        if (contain == null) {
            this.contain = ant;
            return true;
        }
        else {
            return false;
        }
    }


    /**
     *
     * @return remove the contenant
     */
    public boolean removeContenantInsect() {
        if (contain == null) {
            return false;
        }
        else {
            this.contain = null;
            return true;
        }
    }


    /**
     *
     * @return the contenant insect
     */
    public Ant getContenantInsect() {
        return this.contain;
    }

}
