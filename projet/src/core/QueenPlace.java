package core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class QueenPlace extends Place {

    private Place effectiveQueen;

    public QueenPlace(String name, Place effectiveQueen) {
        super(name, null);
        this.effectiveQueen = effectiveQueen;
    }

   public Place getEffectiveQueen() {
        return this.effectiveQueen;
    }

    public void setEffectiveQueen(Place place) {
        this.effectiveQueen = place;
    }
}
