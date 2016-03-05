package ants;

import core.Ant;
import core.AntColony;
import core.Damaging;

import java.util.ArrayList;

/**
 * Created by quentin on 05/03/16.
 */
public class QueenAnt extends ScubaThrowerAnt {

    private ArrayList<Ant> antUp = new ArrayList<>();

    public QueenAnt() {
        super(1,6);
    }

    @Override
    public void action(AntColony colony) {
        super.action(colony);
        Ant antEn = this.place.getEntrance().getAnt();
        Ant antEx = this.place.getExit().getAnt();
        if (!antUp.contains(antEn) && antEn != null) {
            antUp.add(antEn);
            antEn.setDamage(antEn.getDamage()*2);
            System.out.println(antEn.getDamage());
        }
        if (!antUp.contains(antEx) && antEx!= null) {
            antUp.add(antEx);
            antEx.setDamage(antEx.getDamage()*2);
            System.out.println(antEx.getDamage());
        }

    }

}
