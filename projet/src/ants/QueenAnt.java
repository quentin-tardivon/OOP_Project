package ants;

import core.*;

import java.util.ArrayList;

/**
 * THE Queen Ant
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class QueenAnt extends ScubaThrowerAnt{

    private ArrayList<Ant> antUp = new ArrayList<>(); //THe list of ants that gets a boost

    /**
     * Create a new QueenAnt
     */
    public QueenAnt() {
        super(1,6);
        setRemovable(false);
    }


    /**
     * Boost the ants next to her and throws leaves
     * @param colony
     */
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
