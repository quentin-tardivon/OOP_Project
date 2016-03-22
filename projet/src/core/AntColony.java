package core;

import ants.QueenAnt;

import java.util.ArrayList;

/**
 * An entire colony of ants and their tunnels.
 *
 * @author Joel
 * @version Fall 2014
 */
public class AntColony {

	public static final String QUEEN_NAME = "AntQueen"; // name of the Queen's place
	public static final int MAX_TUNNEL_LENGTH = 8;
	public static int queenCount = 0;

	private int food; // amount of food available
	private QueenPlace queenPlace; // where the queen is
	private ArrayList<Place> places; // the places in the colony
	private ArrayList<Place> beeEntrances; // places which bees can enter (the starts of the tunnels)

	/**
	 * Creates a new ant colony with the given layout.
	 *
	 * @param numTunnels
	 *            The number of tunnels (paths)
	 * @param tunnelLength
	 *            The length of each tunnel
	 * @param moatFrequency
	 *            The frequency of which moats (water areas) appear. 0 means that there are no moats
	 * @param startingFood
	 *            The starting food for this colony.
	 */
	public AntColony (int numTunnels, int tunnelLength, int moatFrequency, int startingFood) {
		// simulation values
		food = startingFood;

		// init variables
		places = new ArrayList<Place>();
		beeEntrances = new ArrayList<Place>();
		queenPlace = new QueenPlace(QUEEN_NAME, null); // magic variable namexw

		tunnelLength = Math.min(tunnelLength, MAX_TUNNEL_LENGTH); // don't go off the screen!
		// set up tunnels, as a kind of linked-list
		Place curr, prev; // reference to current exit of the tunnel
		for (int tunnel = 0; tunnel < numTunnels; tunnel++) {
			curr = queenPlace; // start the tunnel's at the queen
			for (int step = 0; step < tunnelLength; step++) {
				if (moatFrequency != 0 && step%moatFrequency == 0) {
					prev = curr; // keep track of the previous guy (who we will exit to)

					curr = new Water("tunnel[" + tunnel + "-" + step + "]", prev); // create new place with an exit that is the previous spot

					prev.setEntrance(curr); // the previous person's entrance is the new spot
				}

				else {
					prev = curr; // keep track of the previous guy (who we will exit to)

					curr = new Place("tunnel[" + tunnel + "-" + step + "]", prev); // create new place with an exit that is the previous spot

					prev.setEntrance(curr); // the previous person's entrance is the new spot
				}

				places.add(curr); // add new place to the list
			}
			beeEntrances.add(curr); // current place is last item in the tunnel, so mark that it is a bee entrance
		} // loop to next tunnel

	}

	/**
	 * Returns an array of Places in this colony. Places are ordered by tunnel, with each tunnel's places listed start to end.
	 *
	 * @return The tunnels in this colony
	 */
	public Place[] getPlaces () {
		return places.toArray(new Place[0]);
	}

	/**
	 * Returns an array of places that the bees can enter into the colony
	 *
	 * @return Places the bees can enter
	 */
	public Place[] getBeeEntrances () {
		return beeEntrances.toArray(new Place[0]);
	}

	/**
	 * Returns the queen's location
	 *
	 * @return The queen's location
	 */
	public QueenPlace getQueenPlace () {
		return queenPlace;
	}

	/**
	 * Returns the amount of available food
	 *
	 * @return the amount of available food
	 */
	public int getFood () {
		return food;
	}

	/**
	 * Increases the amount of available food
	 *
	 * @param amount
	 *            The amount to increase by
	 */
	public void increaseFood (int amount) {
		food += amount;
	};

	/**
	 * Returns if there are any bees in the queen's location (and so the game should be lost)
	 *
	 * @return if there are any bees in the queen's location
	 */
	public boolean queenHasBees () {
		try {
			if (queenPlace.getEffectiveQueen().getBees().length > 0 || queenPlace.getBees().length >0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (NullPointerException exception) {
			return queenPlace.getBees().length >0;
		}

	}

	// place an ant if there is enough food available
	/**
	 * Places the given ant in the given tunnel IF there is enough available food. Otherwise has no effect
	 *
	 * @param place
	 *            Where to place the ant
	 * @param ant
	 *            The ant to place
	 */
	public void deployAnt (Place place, Ant ant) {
		if (ant instanceof QueenAnt) {
			if (food >= ant.getFoodCost() && queenCount<1) {
				food -= ant.getFoodCost();
				place.addInsect(ant);
				queenCount+=1;
			}
			else {
				System.out.println("Not enough food remains to place or already a queen " + ant);
			}
		}
		else {
			if (food >= ant.getFoodCost()) {
				food -= ant.getFoodCost();
				place.addInsect(ant);
			}
			else {
				System.out.println("Not enough food remains to place " + ant);
			}
		}
	}

	/**
	 * Removes the ant inhabiting the given Place
	 *
	 * @param place
	 *            Where to remove the ant from
	 */
	public void removeAnt (Place place) {
		if (place.getAnt() != null) {
			if (place.getAnt().isRemovable()) {
				place.removeInsect(place.getAnt());
			}
			else {
				System.out.println("This insect is not removable");
			}
		}
	}

	/**
	 * Returns a list of all the ants currently in the colony
	 *
	 * @return a list of all the ants currently in the colony
	 */
	public ArrayList<Ant> getAllAnts () {
		ArrayList<Ant> ants = new ArrayList<Ant>();
		for (Place p : places) {
			if (p.getAnt() != null) {
				if (p.getAnt() instanceof Containing && ((Containing) p.getAnt()).getContenantInsect() !=null) {
					ants.add(((Containing) p.getAnt()).getContenantInsect());
				}
				ants.add(p.getAnt());
			}
		}
		return ants;
	}

	/**
	 * Returns a list of all the bees currently in the colony
	 *
	 * @return a list of all the bees currently in the colony
	 */
	public ArrayList<Bee> getAllBees () {
		ArrayList<Bee> bees = new ArrayList<Bee>();
		for (Place p : places) {
			for (Bee b : p.getBees()) {
				bees.add(b);
			}
		}
		return bees;
	}

	/**
	 * Initialize the Queen Place
	 * @param place
     */
	public void setQueenPlace(QueenPlace place) {
		this.queenPlace = place;
	}

	@Override
	public String toString () {
		return "Food: " + food + "; " + getAllBees() + "; " + getAllAnts();
	}
}
