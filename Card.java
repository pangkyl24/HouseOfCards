
public class Card{
	
	String suit;
	String rank;
	int value;
	
	public Card(String suit, String rank, int value){
		
		this.suit = suit;
		this.rank = rank;
		this.value = value;
		
	}
	
	public String toString(){
		return "Suit: " + suit + "\nRank: " + rank;
	}
	
	
	
}
