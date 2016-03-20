package ants;

import core.*;

import java.util.ArrayList;

/**
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class QueenAnt extends ScubaThrowerAnt{



    public QueenAnt() {
        super(1,6);
        setRemovable(false);
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
