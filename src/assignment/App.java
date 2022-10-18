package assignment;

import java.util.List;

public class App {	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the the Card game War! Your game will begin now");
		
		Deck deck = new Deck();	
		Player player1 = new Player("Player 1");		
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		player2.drawEvenCard();
		player2.drawOddCard();
		
		System.out.println("The deck of cards has been shuffled!");
		System.out.println("Each player will have 26 cards and will play 26 individual battles against each other to see who wins the war!");
		
		
//		while (!player1.hand.isEmpty()){
//			player1.describe();
//			player2.describe();
//		}
		
		System.out.println(player2.hand.isEmpty());
	

	}
	
}
	