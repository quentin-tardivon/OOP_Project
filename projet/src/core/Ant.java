package core;

/**
 * A class representing a basic Ant
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public abstract class Ant extends Insect implements Damaging, Removable{

	protected int foodCost; // the amount of food needed to make this ant
	protected boolean hidden = false;
	protected int damage;
	protected boolean isRemovable = true;

	/**
	 * Creates a new Ant, with a food cost of 0.
	 *
	 * @param armor
	 *            The armor of the ant.
	 */
	public Ant (int armor) {
		super(armor, null);
		foodCost = 0;
	}

	public Ant (int armor, int foodCost) {
		super(armor, null);
		this.foodCost = foodCost;
	}

	public Ant(int armor, int foodCost, int damage) {
		super(armor,null);
		this.foodCost = foodCost;
		this.damage = damage;
	}


	/**
	 * Returns the ant's food cost
	 *
	 * @return the ant's good cost
	 */
	public int getFoodCost () {
		return foodCost;
	}

	/**
	 * Removes the ant from its current place
	 */
	public void leavePlace () {
		place.removeInsect(this);
	}

	/**
	 *
	 * @return damage of the ant
     */
	public int getDamage() {
		return this.damage;
	}

	/**
	 * Change ant's damage
	 * @param newDamage
     */
	public void setDamage(int newDamage) {
		this.damage = newDamage;
	}

	/**
	 *
	 * @return if an ant is removable or not
     */
	public boolean isRemovable() {
		return this.isRemovable;
	}

	/**
	 * set the removability of an ant
	 * @param removable
     */
	public void setRemovable(boolean removable) {
		this.isRemovable = removable;
	}
}
