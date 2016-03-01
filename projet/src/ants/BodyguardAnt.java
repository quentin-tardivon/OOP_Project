package ants;

import core.Ant;
import core.AntColony;
import core.Containing;

/**
 * Created by quentin on 01/03/16.
 */
public class BodyguardAnt extends Ant implements Containing  {

    private Ant contain = null;

    public BodyguardAnt() {
        super(2,5);
    }

    public void action(Ant contain, AntColony colony) {
        if (contain != null) {
            contain.action(colony);
        }
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
