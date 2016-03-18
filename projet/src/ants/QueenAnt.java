package ants;

import core.Ant;
import core.AntColony;
import core.QueenPlace;

import java.util.ArrayList;

/**
 * Created by quentin on 05/03/16.
 */
public class QueenAnt extends ScubaThrowerAnt {

    private static final QueenAnt INSTANCE = new QueenAnt();

    public static QueenAnt getInstance() {
        return INSTANCE;
    }
    public QueenAnt() {
        super(1,6);
    }


    private ArrayList<Ant> antUp = new ArrayList<>();


    @Override
    public void action(AntColony colony) {
        super.action(colony);
        QueenPlace newPlace = new QueenPlace("AntQueen", this.getPlace());
        colony.setQueenPlace(newPlace);
        if (this.place.getEntrance() != null) {
            Ant antEn = this.place.getEntrance().getAnt();
            if (!antUp.contains(antEn) && antEn != null) {
                antUp.add(antEn);
                antEn.setDamage(antEn.getDamage() * 2);
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
