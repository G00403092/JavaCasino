
/*
Ronan Francis
ID: G00403092
Started: 21/03/2022
Finished:
*/

import java.util.*;

public class Blackjack
{
	private double totalMoney;

	public Blackjack()
	{

		//intilizations
		Scanner keyboard = new Scanner(System.in);
		int menuChoice;
		double totalMoney = this.totalMoney;

		//menu
		System.out.println("*****************************************");
		System.out.println("*\tWelcome to BlackJack\t\t*");
		System.out.println("*\tCreated by Ronan Francis\t*");
		System.out.println("*\t\tMENU\t\t\t*");
		System.out.println("*****************************************");
		System.out.println("Choose one of the following:");
		System.out.println("1. Let's Play");
		System.out.println("2. Rules");
		System.out.println("3. Current Winnings");
		System.out.println("4. Return to Home");
		System.out.println("5. Exit");
		menuChoice = keyboard.nextInt();

		do {
			while(menuChoice == 1)//Lets play
			{

				int userTotal = 0, dealerTotal = 0;
				double bet;

				System.out.println("Place your bet: ");
				bet = keyboard.nextInt();

				Card Dealer1 = new Card();
				Card Dealer2 = new Card();
				Card User1 = new Card();
				Card User2 = new Card();



				System.out.println("Dealer's Hand: " +Dealer1.getValue()+" OF "+ Dealer2.getSuit());
				System.out.println("Your Hand: " +User1.getValue()+" OF "+User1.getSuit()+ " & " +User2.getValue()+" OF "+User2.getSuit());
				userTotal = User1.getTotal() + User2.getTotal();


				int gameChoice = 0;
				//beginning of while loop for main game


			do//USER TURN
			{
				//Prompts user to hit or stand
				System.out.println("Your total is: "+ userTotal);
				System.out.println("1. Hit");
				System.out.println("2. Stand");
				gameChoice = keyboard.nextInt();
				if (gameChoice != 2){

				//Bring in Card method
				Card UserHit = new Card();
				System.out.println(UserHit.getValue()+" OF "+UserHit.getSuit());
				userTotal = userTotal + UserHit.getTotal();
				System.out.println("Your total is: "+ userTotal);

				if (userTotal > 21)
				{
					gameChoice = 3;
				}
				if (userTotal == 21)
				{
					gameChoice = 2;
				}

				//IN CASE OF ACES
				else if(userTotal >= 22 && (User1.getValue() == "ACE" || User2.getValue() == "ACE" || UserHit.getValue() == "ACE" ))
				{
					if(User1.getValue() == "ACE")
					{
						userTotal = userTotal - User1.getTotal();
						User1.setTotal(11);
						userTotal = userTotal + User1.getTotal();
					}
					if(User2.getValue() == "ACE")
					{
						userTotal = userTotal - User2.getTotal();
						User2.setTotal(11);
						userTotal = userTotal + User2.getTotal();
					}
					if(UserHit.getValue() == "ACE")
					{
						userTotal = userTotal - UserHit.getTotal();
						UserHit.setTotal(11);
						userTotal = userTotal + UserHit.getTotal();
					}
				}//IN CASE OF ACES END
			}
			else if (gameChoice == 2) //Dealer's Turn
			{
				System.out.println("The Dealer will now hit or stand");
			}

		}while (gameChoice != 2 && userTotal < 21);

			while (gameChoice == 2 && dealerTotal <= 17 && dealerTotal <= 21)
			{

			System.out.println("The dealers hand is "+ Dealer1.getValue()+" OF "+ Dealer1.getSuit()+ " & "+Dealer2.getValue()+" OF "+ Dealer2.getSuit());
			System.out.println("Dealer's total is: "+ dealerTotal);

			Card DealerHit = new Card();
			System.out.println(DealerHit.getValue()+" OF "+DealerHit.getSuit());
			dealerTotal = dealerTotal + DealerHit.getTotal();
			System.out.println("Dealer's total is: "+ dealerTotal);
			if(dealerTotal >= 22 && (Dealer1.getValue() == "ACE" || Dealer2.getValue() == "ACE" || DealerHit.getValue() == "ACE" ))
			{
				if(Dealer1.getValue() == "ACE")
				{
					dealerTotal = dealerTotal - Dealer1.getTotal();
					Dealer1.setTotal(11);
					dealerTotal = dealerTotal + Dealer1.getTotal();
				}
				if(DealerHit.getValue() == "ACE")
				{
					dealerTotal = dealerTotal - DealerHit.getTotal();
					DealerHit.setTotal(11);
					dealerTotal = dealerTotal + DealerHit.getTotal();
				}
				if(Dealer2.getValue() == "ACE")
				{
					dealerTotal = dealerTotal - Dealer2.getTotal();
					Dealer2.setTotal(11);
					dealerTotal = dealerTotal + Dealer2.getTotal();
				}
			}
			System.out.println("Dealer's total is: "+ dealerTotal);

			//sets DealerHit to null ***
			DealerHit = null;
			if (dealerTotal >= 17 || dealerTotal >= 21) //dealer stops
			{
						gameChoice = 3;
					}
			//Add wait

			}

			while(gameChoice == 3)	//Winner
			{
				if((dealerTotal > userTotal && userTotal < 21) || (dealerTotal <= 21 && userTotal > 21))
					{
						totalMoney = totalMoney - bet;
						System.out.println("You lost");

					}
				if((dealerTotal < userTotal && userTotal <= 21) || ( dealerTotal > 21  && userTotal <= 21))
					{
					totalMoney = totalMoney + bet;
					System.out.println("You Won!");

				}
				if(dealerTotal == userTotal && dealerTotal >= 21 && userTotal >= 21)
				{
					System.out.println("You pushed!");

				}
				gameChoice = 4;
			}
			while(gameChoice == 4) //Exit
			{
				dealerTotal = 0;
				userTotal = 0;
				System.out.println("Choose one of the following:");
				System.out.println("1. Let's Play Again");
				System.out.println("2. Rules");
				System.out.println("3. Current Winnings");
				System.out.println("4. Return to Home");
				System.out.println("5. Exit");
				menuChoice = keyboard.nextInt();
				gameChoice = 0;
				bet = 0;

			}



			}
			//Lets play END
			if (menuChoice < 1 || menuChoice > 5) //Catcher
			{
			System.out.println("Enter \"1\", \"2\", \"3\" \"4\" or \"5\"");
			menuChoice = keyboard.nextInt();
			}
			else if(menuChoice == 2)//Rules
			{
				System.out.println("  BLACKJACK RULES: ");
				System.out.println("	-Each player is dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down.");
				System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
				System.out.println("	-The players cards are added up for their total.");
				System.out.println("	-Players �Hit� to gain another card from the deck. Players �Stay� to keep their current card total.");
				System.out.println("	-Dealer �Hits� until they equal or exceed 17.");
				System.out.println("	-The goal is to have a higher card total than the dealer without going over 21.");
				System.out.println("	-If the player total equals the dealer total, it is a �Push� and the hand ends.");
				System.out.println("	-Players win their bet if they beat the dealer. Players win 1.5x their bet if they get �Blackjack� which is 21.");
				System.out.println("Choose one of the following:");
				System.out.println("1. Let's Play");
				System.out.println("2. Rules");
				System.out.println("3. Current Winnings");
				System.out.println("4. Return to Home");
				System.out.println("5. Exit");
				menuChoice = keyboard.nextInt();

			}
			//Rules END
			else if(menuChoice == 3)//Current Winnings
			{
				System.out.println("CURRENT WINNINGS ARE: "+ totalMoney);
				System.out.println("Choose one of the following:");
				System.out.println("1. Let's Play");
				System.out.println("2. Rules");
				System.out.println("3. Current Winnings");
				System.out.println("4. Return to Home");
				System.out.println("5. Exit");
				menuChoice = keyboard.nextInt();
			}
			//Current Winnings END
			else if(menuChoice == 4)//Return to home
			{
				keyboard.close();
				System.exit(1);
			}
			//Return to home END
			else if(menuChoice == 5)//Exit
			{
				keyboard.close();
				System.exit(0);
			}
			//Exit END
		}
		while (menuChoice != 4);//menuChoice do loop

	}//main method

	public double getTokens()
	{
		return totalMoney;
	}

}//Blackjack Class