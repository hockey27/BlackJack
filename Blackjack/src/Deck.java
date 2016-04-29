import java.util.ArrayList;
import java.util.Collections;

	public class Deck
		{
		private ArrayList<Card> deck = new ArrayList<Card>();
		public Deck()
			{
				String suit = "";
				for(int i = 0; i < 4; i++)
					{
						switch(i)
						{
						case 0:
							suit = "Hearts";
							break;
						case 1:
							suit = "Spades";
							break;
						case 2:
							suit = "Diamonds";
							break;
						case 3:
							suit = "Clubs";
							break;
						}
		deck.add(new Card(suit, 2, "2"));
		deck.add(new Card(suit, 3, "3"));
		deck.add(new Card(suit, 4, "4"));
		deck.add(new Card(suit, 5, "5"));
		deck.add(new Card(suit, 6, "6"));
		deck.add(new Card(suit, 7, "7"));
		deck.add(new Card(suit, 8, "8"));
		deck.add(new Card(suit, 9, "9"));
		deck.add(new Card(suit, 10, "10"));
		deck.add(new Card(suit, 10, "J"));
		deck.add(new Card(suit, 10, "Q"));
		deck.add(new Card(suit, 10, "K"));
		deck.add(new Card(suit, 11, "A"));
					}
			}
		public ArrayList<Card> addDecks(int times)
			{
				ArrayList<Card> tempDeck = new ArrayList<Card>();
				tempDeck.addAll(deck);
				for(int i = 0; i < times; i++)
					{
						deck.addAll(tempDeck);
					}
				return deck;
			}
		public Card drawCard()
			{
				Card temp = deck.get(0);
				deck.remove(0);
				deck.add(temp);
				return temp;
			}
		public void removeCard(int spot)
			{
				deck.remove(spot);
			}
		public void setCard(int spot, String suit, int value, String face)
			{
				deck.get(spot).setSuit(suit);
				deck.get(spot).setValue(value);
				deck.get(spot).setFace(face);
			}
		public ArrayList<Card> shuffleDeck()
	 {
		 Collections.shuffle(deck);
		 return deck;
	 }
		public int size()
			{
				return deck.size();
			}

}