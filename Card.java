

import java.util.*;

public class Card
{

	private String suit, value;
	private int total;

public Card()
	{


	}//Card method

	//Getters
	public String getSuit()
	{
				//randomize suitNum
				Random randomNumber = new Random();
				int lowerRangeSuit = 1;
				int upperRangeSuit = 3;
				int suitNum = randomNumber.nextInt(upperRangeSuit - lowerRangeSuit) + lowerRangeSuit;

				//assign suit
			 	switch(suitNum)
			 	{

					case 1:
						this.suit = "HEARTS";
						break;
					case 2:
						this.suit = "DIAMONDS";
						break;
					case 3:
						this.suit = "SPADES";
						break;
					case 4:
						this.suit = "CLUBS";

						break;
					default:
						this.suit = "INVALID";
						break;
		}//Suit switch
		return this.suit;
	}

	public String getValue()
	{
				//get Value

				//randomize suitNum
				Random randomNumber = new Random();
				int lowerRangeValue = 1;
				int upperRangeValue = 13;
				int valueNum = randomNumber.nextInt(upperRangeValue - lowerRangeValue) + lowerRangeValue;

				//assign Value
			 	switch(valueNum)
			 	{

					case 1:
						this.value = "ACE";
						this.total = 1;
						break;
					case 2:
						this.value = "TWO";
						this.total = 2;
						break;
					case 3:
						this.value = "THREE";
						this.total = 3;
						break;
					case 4:
						this.value = "FOUR";
						this.total = 4;
						break;
					case 5:
						this.value = "FIVE";
						this.total = 5;
						break;
					case 6:
						this.value = "SIX";
						this.total = 6;
						break;
					case 7:
						this.value = "SEVEN";
						this.total = 7;
						break;
					case 8:
						this.value = "EIGHT";
						this.total = 8;
						break;
					case 9:
						this.value = "NINE";
						this.total = 9;
						break;
					case 10:
						this.value = "TEN";
						this.total = 10;
						break;
					case 11:
						this.value = "JACK";
						this.total = 10;
						break;
					case 12:
						this.value = "QUEEN";
						this.total = 10;
						break;
					case 13:
						this.value = "KING";
						this.total = 10;
						break;
					default:
						this.value = "INVALID";
						this.total = 10;
						break;
	}//Value switch
	return value;
	}

	public int getTotal()
	{
		return total;
	}

	//Setters
	public void setTotal(int newTotal)
	{
		this.total = newTotal;
	}

	public void setValue(String newValue)
	{
		this.value = newValue;
	}

	public void setSuit(String newSuit)
	{
		this.suit = newSuit;
	}

}//class


