package edu.westga.cs6910.elementalclash.model;

/**
 * HumanPlayer represents a human-controlled player in the Elemental Clash game.
 * It extends the AbstractPlayer class and inherits its functionality.
 * 
 * @version 06/23/2024
 * @author Savitha Venkatesh
 */
public class HumanPlayer extends AbstractPlayer {

    /**
     * Constructs a new HumanPlayer with the specified name and deck.
     * 
     * @param name the name of the human player
     * @param deck the deck of cards for the human player
     * @precondition name != null && deck != null
     * @postcondition getName() == name && getLifePoints() == 20 && getHand().size() == 0
     */
    public HumanPlayer(String name, Deck deck) {
        super(name, deck);
    }
}