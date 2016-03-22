package ants;

import core.AePlayWave;
import core.Ant;
import core.AntColony;
import core.Bee;

/**
 * An ant who throws leaves at bees
 *
 *@author Quentin TARDIVON, Maxime ESCAMEZ
 */
public class ThrowerAnt extends Ant {



	/**
	 * Creates a new Thrower Ant.
	 * Armor: 1, Food: 0, Damage: 1
	 */
	public ThrowerAnt () {
		super(1,4);
		damage = 1;

	}

	/**
	 * Create a new ThrowerAnt
	 * @param armor
	 * @param foodCost
     */
	public ThrowerAnt(int armor, int foodCost) {
		super(armor,foodCost);
		damage = 1;
	}

	/**
	 * Returns a target for this ant
	 *
	 * @return A bee to target
	 */
	public Bee getTarget () {
		return place.getClosestBee(0, 3);
	}

	/**
	 * Shoot near bees
	 * @param colony
     */
	@Override
	public void action (AntColony colony) {
		Bee target = getTarget();
		if (target != null) {
			target.reduceArmor(damage);
			Thread playWave=new AePlayWave("sound/shoot.wav");
			playWave.start();
		}
	}
}
