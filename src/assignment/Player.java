package assignment;

import java.util.ArrayList;
import java.util.List;


public class Player extends Deck{
	
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}	
	
	public void drawEvenCard() {
		for (int i = 0; i < 53; i++) {
			if (i % 2 == 0) {
				hand.set(i, deckOfCards.get(i));
			}
		}
	}
	
	public void drawOddCard() {
		for (int i = 0; i < 53; i++) {
			if (i % 2 != 0) {
				hand.set(i, deckOfCards.get(i));
			} 
		}
	}
	
	public Card flipTopCard() {
		Card cardOnTop = hand.get(0);
		hand.remove(0);
		return cardOnTop;
	}
	
	
	public void describe() {
		System.out.println("Player's name: "+ this.name + "Player's score: " + this.score);
		
		System.out.println(this.name + " played a(n) " + hand.get(0));
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}