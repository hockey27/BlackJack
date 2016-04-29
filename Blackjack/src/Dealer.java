import java.util.ArrayList;

	public class Dealer
	{
		private int handValue;
		private ArrayList<Card> hand = new ArrayList<Card>();
		public Dealer()
			{
				handValue = 0;
			}
		public void addCard(Card in)
			{
				hand.add(in);
				handValue += in.getValue();
			}
		public int getHandValue()
			{
				return handValue;
			}
		public void resetHand()
			{
				hand.removeAll(hand);
				handValue = 0;
			}
		public void printHalf()
			{
				System.out.println("Dealer has " + hand.get(0).getSuit() + " " + hand.get(0).getFace());
			}
		public void printFull()
			{
				for (int i = 0; i < hand.size(); i++)
					{
						System.out.print(hand.get(i).getSuit() + " ");
						System.out.println(hand.get(i).getFace());
					}
				System.out.println("Dealer has " + handValue);
			}
	}