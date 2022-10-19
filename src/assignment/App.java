package assignment;

import java.util.List;

public class App {	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the the Card game War! Your game will begin now");
		
		Deck deck = new Deck();	
		Player player1 = new Player("Player 1");		
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		deck.createPlayersHands(deck, player1, player2);
		System.out.println("");
		System.out.println("***The deck of cards has been shuffled!***");
		System.out.println("");
		System.out.println("Each player will draw 26 cards from the deck and will play 26 individual battles against each other to see who wins the war!");
		
		System.out.println("");
		
		
		while (!player1.hand.isEmpty() || !player2.hand.isEmpty()){
			for (int i = 0; i < 26; i++) {
				Card card1 = player1.flipTopCard();
				System.out.print("Player 1 flipped a(n) "); card1.describe();
				Card card2 = player2.flipTopCard();
				System.out.print("Player 2 flipped a(n) "); card2.describe();
				
				if (player1.describe(card1)> player2.describe(card2)) {
					player1.incrementScore();
					System.out.println("Player 1 beat player 2 in this round. Let's play the next round");
					System.out.println("");
				} else if (player1.describe(card1)< player2.describe(card2)) {
					player2.incrementScore();
					System.out.println("Player 2 beat player 1 in this round. Let's play the next round");
					System.out.println("");
				} else {}
			}
		}
		
		System.out.println("");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("No winners today... we have a draw!");
		}
		System.out.println("");
		
		System.out.println("End of game! Good bye!");
		
	}
	
}
	