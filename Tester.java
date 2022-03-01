public class Tester{
	
	public static void main(String[] args){
	
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"9", "10", "J", "Q", "K", "A"};
		int[] values = {9, 10, 11, 12, 13, 14};
		
		Deck myDeck = new Deck(suits, ranks, values);
		myDeck.shuffleDeck();
		myDeck.dealHand(5);
		
		myDeck.showDeck();
		System.out.println("\n\n\n\n\n\n\n");
		myDeck.showHand();
		
	}
	
	
}
