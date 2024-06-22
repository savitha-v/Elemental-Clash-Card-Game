package edu.westga.cs6910.elementalclash.model;

import java.util.List;

/**
 * Play defines the behaviors that a player in the Elemental Clash game must
 * implement.
 * 
 * @version 06/23/2024
 * @author Savitha Venkatesh
 */
public interface Play {

	/**
	 * Gets the name of the player.
	 * 
	 * @return the name of the player
	 */
	String getName();

	/**
	 * Gets the life points of the player.
	 * 
	 * @return the life points of the player
	 */
	int getLifePoints();

	/**
	 * Draws a card from the player's deck.
	 * 
	 * @return the drawn card
	 */
	Card drawCard();

	/**
	 * Reduces the player's life points by the specified amount.
	 * 
	 * @param points the amount of points to reduce
	 * @precondition points > 0
	 * @postcondition getLifePoints() == old life points - points
	 */
	void reduceLifePoints(int points);

	/**
	 * Gets the player's hand.
	 * 
	 * @return the hand of the player
	 */
	List<Card> getHand();
}