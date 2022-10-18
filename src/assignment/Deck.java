package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck extends ArrayList<Card>{
	
	/*
	 * Fields (arrays used to build each card)
	 */
	List<Integer> values = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);  //all possible mathematical values in the deck
	List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");  //all possible suits
	List<Card> deckOfCards = new ArrayList<Card>();
	
	
	/*
	 * Constructor
	 */
	public Deck() {
		for(int value : values) {
			for(String suit : suits) {
				Card card = new Card(value, suit);
				this.deckOfCards.add(card);
			}
		}		
	}	
	
	/*
	 * Public methods
	 */
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}
	

	


}
	
