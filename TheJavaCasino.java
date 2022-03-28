
import java.util.*;


public class TheJavaCasino

{



public static void main(String[] args)

{
//initalization
Scanner keyboard = new Scanner(System.in);
double tokens;
int game = 1;

do{
	System.out.print("How many tokens do you wish to start with:");
	tokens = keyboard.nextInt();

	System.out.println("* * * * * * * * * * * * * * * * * *");
	System.out.println("*           Welcome to            *");
	System.out.println("*         THE JAVA CASINO         *");
	System.out.println("*       Created by Group 15       *");
	System.out.println("*           � GMIT 2022           *");
	System.out.println("* * * * * * * * * * * * * * * * * *");

	System.out.println("");

	System.out.println("* * * * * * * * * * * * * * * * * *");
	System.out.println("*      GAME COST AND PRIZES:      *");
	System.out.println("*   You currently have " + tokens + " Tokens\t*");
	System.out.println("*_________________________________*");
	System.out.println("*        Game 1: Dice game        *");
	System.out.println("*     Cost: 1tkn Prize: 5tkn      *");
	System.out.println("*_________________________________*");
	System.out.println("*        Game 2: Black Jack       *");
	System.out.println("*       Bets: Min & Max 2 & 500   *");
	System.out.println("*_________________________________*");
	System.out.println("* * * * * * * * * * * * * * * * * *");
	System.out.println("*        Game 3: Roulette         *");
	System.out.println("*       Bets: Min & Max 2 & 500   *");
	System.out.println("*_________________________________*");



	System.out.print("Choose the game you wish to play:");
	game = keyboard.nextInt();
while (game != 4)
{
	switch(game)
	{
	case 1:
	Random randomNumber = new Random();
	int dieside,userdie,dieside2,windie,userdie2,bet;
	String again="YA";
	//String end;
	//int count=0;

	System.out.println(" -----------------");
	System.out.println("| LUCKY DICE GAME |");
	System.out.println(" -----------------\n");

	do
	{
		System.out.println(" -----------------");
		System.out.println("| PLACE YOUR BETS |");
		System.out.println(" -----------------");
		dieside=randomNumber.nextInt(6)+1;
		dieside2=randomNumber.nextInt(6)+1;

		System.out.print("<CHOOSE DICE ONE: ");
		userdie= keyboard.nextInt();

		System.out.print("<CHOOSE DICE TWO: ");
		userdie2= keyboard.nextInt();

		windie=dieside+dieside2;
		bet=userdie+userdie2;
		System.out.println("\t   TOTAL: "+bet);

		if(userdie >=7 || userdie2>=7 )
		{
			System.out.println("\nINVALID INPUT PLEASE PICK A NUMBER BETWEEN 1-6");
		}
		else if (bet==windie )
		{
			System.out.println(" \n\n --------------");
			System.out.println("| YOU WON! | "+windie+" |");
			System.out.println(" --------------\n");
			//count++;
			tokens--;
		}
		else if(bet!=windie)
		{
			System.out.println(" \n\n ------------------------------");
			System.out.println("| YOU LOST! THE NUMBER WAS| "+windie+" |");
			System.out.println(" ------------------------------\n");
			//count++;
			tokens--;
		}

	System.out.print("TYPE 'Y' TO GO AGAIN OR 'N' TO STOP: ");
	again = keyboard.next();
	System.out.print("\n");

	}//gameLoop
	while(again.equalsIgnoreCase("Y"));


	switch(again)
	{
	case"N":
	case"n":
	break;
	}
	break;
	case 2:
	Blackjack User = new Blackjack();

	tokens = tokens + User.getTokens();
	break;
	case 3:
	RouletteGame User1 = new RouletteGame();
	tokens = tokens + User1.getTokens();
	break;
	default:

 	 System.out.print("Try again.");

	break;



}//do loop
	//switch statement for game
}

System.out.println(" ------------------------------\n");

	System.out.println("Hope you enjoyed your game, you have: "+ tokens + " left");
	System.out.println("\nWould you like to play again?");

	System.out.println(" ------------------------------\n");

}while(tokens <= 0);
//Final Do loop
System.out.println(" ------------------------------\n");
System.out.println("\nYou are out of tokens, GAME OVER");
System.out.println(" ------------------------------\n");
keyboard.close();
}//main method

}//class
