import java.util.ArrayList;

	public class Player
	{
		private int bank;
		private int bet;
		private int handValue;
		private int numOfAces;
		private ArrayList<Card> hand = new ArrayList<Card>();

		public Player(int b)
			{
				bank = b;
				bet = 0;
				handValue = 0;
				numOfAces = 0;
			}
		public void doubleDown(Card in)
			{
				bank -= bet;
				bet *= 2;
				hand.add(in);
				handValue += in.getValue();
			}
		public void addCard(Card in)
			{
				if(in.getValue() == 11)
					numOfAces++;
				if(in.getValue() + handValue > 21 && numOfAces > 0)
					{
						handValue -= 10;
						numOfAces--;
					}
				hand.add(in);
				handValue += in.getValue();
			}
		public Card getCard(int in)
			{
				return hand.get(in);
			}
		public void removeCard(int in)
			{
				hand.remove(in);
			}
		public String getCardFace(int in)
			{
				return hand.get(in).getFace();
			}
		public int getBank()
			{
				return bank;
			}
		public void winsHand()
	 {
		 bank += (bet * 2);
		 bet = 0;
		 handValue = 0;
		 numOfAces = 0;
		 hand.removeAll(hand);
	 }
		public void losesHand()
			{
				bet = 0;
				handValue = 0;
				numOfAces = 0;
				hand.removeAll(hand);
			}
		public void pushesHand()
			{
				bank += bet;
				bet = 0;
				handValue = 0;
				numOfAces = 0;
				hand.removeAll(hand);
			}
		public int getBet()
			{
				return bet;
			}
		public void setBet(int bet)
			{
				this.bet = bet;
				bank -= bet;
				
			}
		public void setBank(int bank)
			{
				this.bank = bank;
			}
		public int getHandValue()
			{
				return handValue;
			}
		public void setHandValue(int in)
			{
				handValue = in;
			}
		public void printHand()
			{
				for (int i = 0; i < hand.size(); i++)
					{
						System.out.print(hand.get(i).getSuit() + " ");
						System.out.println(hand.get(i).getFace());
					}
			}
	}