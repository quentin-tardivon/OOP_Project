package ants;

import core.Ant;
import core.AntColony;
import core.QueenPlace;

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
        if (colony.getQueenCount()>1) {
            this.reduceArmor(this.getArmor());
        }
        else {
            colony.setQueenCount();
            super.action(colony);
            QueenPlace newPlace = new QueenPlace("AntQueen", this.getPlace());
            colony.setQueenPlace(newPlace);
            if (this.place.getEntrance() != null) {
                Ant antEn = this.place.getEntrance().getAnt();
                if (!antUp.contains(antEn) && antEn != null) {
                    antUp.add(antEn);
                    antEn.setDamage(antEn.getDamage()*2);
                    System.out.println(antEn.getDamage());
                }
            }
            if (this.place.getExit() != null) {
                Ant antEx = this.place.getExit().getAnt();
                if (!antUp.contains(antEx) && antEx != null) {
                    antUp.add(antEx);
                    antEx.setDamage(antEx.getDamage() * 2);
                    System.out.println(antEx.getDamage());
                }
            }
        }



    }

}
