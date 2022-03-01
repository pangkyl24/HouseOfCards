import java.util.ArrayList;

public class Deck{
	
	private String[] SUIT;
	private String[] RANKS;
	private int[] value;
	
	private ArrayList<Card> DeckObj = new ArrayList<Card>();
	private ArrayList<Card> Hand = new ArrayList<Card>();
	
	public Deck(String[] suits, String[] ranks, int[] value){
		this.SUIT = suits;
		this.RANKS = ranks;
		this.value = value;
		
		for(int i = 0; i < SUIT.length; i++){
			for(int j = 0; j < RANKS.length; j++){		
				DeckObj.add(new Card(SUIT[i], RANKS[j], value[j]));	
			}
		}
	}
	
	public void dealHand(int handSize){
		for(int i = 0; i < handSize; i++){
			Hand.add(DeckObj.get(0));
			DeckObj.remove(0);
		}
	}
	
	public void shuffleDeck(){
		int rand;
		ArrayList<Card> temp = new ArrayList<Card>();
		for(int i = 0; i < DeckObj.size(); i++){
			rand = (int)(Math.random()*DeckObj.size());
			temp.add(DeckObj.get(rand));
			DeckObj.remove(rand);
		}
		DeckObj = temp;
	}
	
	public void showDeck(){
		for(Card card : DeckObj){
			System.out.println(card);
		}
	}
	public void showHand(){
		for(Card card : Hand){
			System.out.println(Hand);
		}
	}
}
