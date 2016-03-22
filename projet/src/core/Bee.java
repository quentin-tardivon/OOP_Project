package core;

/**
 * Represents a Bee
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class Bee extends Insect {

	private boolean slow = false;
	private boolean stun = false;
	private int countSlow = 0;

	private static final int DAMAGE = 1;

	/**
	 * Creates a new bee with the given armor
	 *
	 * @param armor
	 *            The bee's armor
	 */
	public Bee (int armor) {
		super(armor);
		this.watersafe = true;
	}

	/**
	 * Deals damage to the givefalsen ant
	 *
	 * @param ant
	 *            The ant to sting
	 */
	public void sting (Ant ant) {
		ant.reduceArmor(DAMAGE);
	}

	/**
	 * Moves to the given place
	 *
	 * @param place
	 *            The place to move to
	 */
	public void moveTo (Place place) {
		this.place.removeInsect(this);
		place.addInsect(this);
	}

	/**
	 * Remove an insect
	 */
	@Override
	public void leavePlace () {
		place.removeInsect(this);
	}

	/**
	 * Returns true if the bee cannot advance (because an ant is in the way)
	 *
	 * @return if the bee can advance
	 */
	public boolean isBlocked () {
		try {
			return !place.getAnt().hidden;
		}
		catch (NullPointerException exception) {
				return false;
		}
	}

	/**
	 * Return the state of the bee
	 * @return
     */
	public boolean isSlow() {
		return slow;
	}

	/**
	 * Set the state of the bee
	 * @param slow
     */
	public void setSlow(boolean slow) {
		this.slow = slow;
	}

	/**
	 * Return the state of the bee
	 * @return
     */
	public boolean isStun() {
		return stun;
	}

	/**
	 * Set the state of the bee
	 * @param stun
     */
	public void setStun(boolean stun) {
		this.stun = stun;
	}

	/**
	 * A bee's action is to sting the Ant that blocks its exit if it is blocked,
	 * otherwise it moves to the exit of its current place.
	 */
	@Override
	public void action (AntColony colony) {
		if (this.isStun()) {
			stun = false;
		}
		else {
			if (this.isSlow() && countSlow >=2) {
				setSlow(false);
				countSlow = 0;
			}
			else if (isSlow()) {
				countSlow+=1;
			}
			else {
				if (isBlocked()) {
					sting(place.getAnt());
				}
				else if (armor > 0) {
					moveTo(place.getExit());
				}
			}

		}

	}
}
