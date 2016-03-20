package ants;

import core.Ant;
import core.AntColony;
import core.Containing;

/**
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class BodyguardAnt extends Ant implements Containing  {

    private Ant contain = null;

    public BodyguardAnt() {
        super(2,5);
    }

    public void action(AntColony colony) {
    }


    public boolean addContenantInsect(Ant ant) {
        if (contain == null) {
            this.contain = ant;
            return true;
        }
        else {
            return false;
        }
    }



    public boolean removeContenantInsect() {
        if (contain == null) {
            return false;
        }
        else {
            this.contain = null;
            return true;
        }
    }



    public Ant getContenantInsect() {
        return this.contain;
    }

}
