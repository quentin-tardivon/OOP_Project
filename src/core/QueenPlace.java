package core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Represent the effective place of the queen and the end of the tunnel
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class QueenPlace extends Place {

    private Place effectiveQueen;

    /**
     * Create a new QueenPlace
     * @param name
     * @param effectiveQueen
     */
    public QueenPlace(String name, Place effectiveQueen) {
        super(name, null);
        this.effectiveQueen = effectiveQueen;
    }

    /**
     * Return the effective place of the queen
      * @return
     */
   public Place getEffectiveQueen() {
        return this.effectiveQueen;
    }

    /**
     * Set the effective Place of the Queen
     * @param place
     */
    public void setEffectiveQueen(Place place) {
        this.effectiveQueen = place;
    }
}
