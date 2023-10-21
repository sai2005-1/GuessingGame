package GuessingGamePackage;
import java.util.Random;
import TurtleGraphics.KeyboardReader;
public class Main {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyboardReader reader = new KeyboardReader();
		Random generator = new Random();
		
		
		
		int secretNumber, guess, issue, game, random1, random2, answer1, answer2;
		char yn, play, problem;
		int count = 0;
		String player, player1, player2;
		
		
		
		
		System.out.println("WELCOME TO THE GUESSING GAME\n");
		System.out.println("\nThis is a 1-2 player game\n");
		System.out.println("How many people are playing this game (1 or 2) ");
		game=reader.readInt();
if((game==1)&&(game!=2))
{
		secretNumber=generator.nextInt(500)+3;
		System.out.println("Please enter the player's name");
		player=reader.readLine();
		System.out.println("\nAre you ready to play? (y/n)");
		play=reader.readChar();
		
		
		if(play=='y')
		{
	do
	{
		System.out.println("Please enter a guess, zero to give up");
		guess=reader.readInt();
		
		if((guess>secretNumber)&&(guess!=0))
		{
			System.out.println("Too high");
			count=count+1;
		}
		else if((guess<secretNumber)&&(guess!=0))
		{
			System.out.println("Too low");
			count=count+1;
		}
		else if(guess==secretNumber)
		{
			System.out.println("You guessed it");
			System.out.println("It took you "+count+" tries to guess the number");
		}
		else if (guess==0)
		{
			System.out.println("You gave up");
			System.out.println("The number to guess was "+secretNumber);
		}
	}while(guess!=secretNumber);
		}
		else
		{
			System.out.println("Is there any problem (enter 'p' below), if not enter 'y' to play the guessing game");
			play=reader.readChar();
		}
		if((play=='y')&&(play!='p'))
		{
		do
		{
			System.out.println("Please enter a guess, 0 to give up");
			guess=reader.readInt();
			count++;
			if((guess>secretNumber)&&(guess!=0))
			{
				System.out.println("Too high");
			}
			else if((guess<secretNumber)&&(guess!=0))
			{
				System.out.println("Too low");
			}
			else if(guess==secretNumber)
			{
				System.out.println("You guessed it");
			}
			else if(guess==0)
			{
				System.out.println("You gave up");
				System.out.println("The number to guess was "+secretNumber);
			}
		}while(guess!=secretNumber);
			
		}
		if((play=='p')&&(play!='y'))
		{
			System.out.println("What is the problem?\n");
			System.out.println("1. The game is gliching");
			System.out.println("2. Others");
			System.out.println("3. Cancel");
		}
		System.out.println("Please enter 1 or 2 or 3 based on your issue");
		issue=reader.readInt();
		 if((issue==1)&&(issue!=2))
		 {
			 System.out.println("Please restart the game");
		 }
		 else if((issue==2)&&(issue!=3))
		 {
			 System.out.print("Please send me an email to the following email address.");
			 System.out.println(" Address the issue in the email. I will try to solve the issue as soon as possible and respond back");
			 System.out.println("Email: Saibhargavyelamanchi2024@eccrsd.us");
		 }
		 else if((issue==3)&&(issue!=1))
		 {
			 System.out.println("It's time to play");
			 System.out.println("Hi "+player+",\nAre you ready to play? (y/n)");
				play=reader.readChar();
				
				if(play=='y')
				{
			do
			{
				System.out.println("Please enter a guess, zero to give up");
				guess=reader.readInt();
				count++;
				if((guess>secretNumber)&&(guess!=0))
				{
					System.out.println("Too high");
				}
				else if((guess<secretNumber)&&(guess!=0))
				{
					System.out.println("Too low");
				}
				else if(guess==secretNumber)
				{
					System.out.println("You guessed it");
					System.out.println("It took you "+count+" tries to guess the number");
				}
				else if (guess==0)
				{
					System.out.println("You gave up");
					System.out.println("The number to guess was "+secretNumber);
				}
			}while(guess!=secretNumber);
				}
				else
				{
					System.out.println("Is there any problem (enter 'p' below), if not enter 'y' to play the guessing game");
					play=reader.readChar();
				}
				if((play=='y')&&(play!='p'))
				{
				do
				{
					System.out.println("Please enter a guess, 0 to give up");
					guess=reader.readInt();
					count++;
					if((guess>secretNumber)&&(guess!=0))
					{
						System.out.println("Too high");
					}
					else if((guess<secretNumber)&&(guess!=0))
					{
						System.out.println("Too low");
					}
					else if(guess==secretNumber)
					{
						System.out.println("You guessed it");
					}
					else if(guess==0)
					{
						System.out.println("You gave up");
						System.out.println("The number to guess was "+secretNumber);
					}
				}while(guess!=secretNumber);
					
				}
				if((play=='p')&&(play!='y'))
				{
					System.out.println("What is the problem?\n");
					System.out.println("1. The game is gliching");
					System.out.println("2. Others");
					System.out.println("3. Cancel");
				}
				System.out.println("Please enter 1 or 2 or 3 based on your issue");
				issue=reader.readInt();
				 if((issue==1)&&(issue!=2))
				 {
					 System.out.println("Please restart the game");
				 }
				 else if((issue==2)&&(issue!=3))
				 {
					 System.out.print("Please send me an email to the following email address.");
					 System.out.println(" Address the issue in the email. I will try to solve the issue as soon as possible and respond back");
					 System.out.println("Email: Saibhargavyelamanchi2024@eccrsd.us");
				 }
				 else if((issue==3)&&(issue!=1))
				 {
					 LoopGuessingGame LoopGuessingGameObject = new LoopGuessingGame();
						LoopGuessingGameObject.simpleMessage();
				 }
			
		 }
	
}
	
	else if((game==2)&&(game!=1))
{
	random1=generator.nextInt(500)+3;
	random2=generator.nextInt(500)+3;
	System.out.println("Please enter Player 1's name");
	player1=reader.readLine();
	System.out.println("Please enter Player 2's name");
	player2=reader.readLine();
	
	
	int count1=0, guess1, two, number = 0, answer;
	 do
	 {
		 System.out.println(player1+", enter your guess (0 to giveup)");
		 guess1=reader.readInt();
		 
		 if((guess1>random1)&&(guess1!=0))
		 {
			 System.out.println("Too High");
			 count1=count1+1;
		 }
		 else if((guess1<random1)&&(guess1!=0))
		 {
			 System.out.println("Too Low");
			 count1=count1+1;
		 }
		 else if(guess1==0)
		 {
			 System.out.println(player2+" wins!");
			 System.out.println(player1+" gave up!");
			 System.out.println("\n\nGame Over");
			 System.out.println("Do you want to play (y/n)");
			 game=reader.readChar();
			 if(game=='y') 
			 {
				 LoopGuessingGame LoopGuessingGameObject = new LoopGuessingGame();
					LoopGuessingGameObject.simpleMessage();
			 }
			 else 
			 {
				 Loop1Game Loop1GameObject = new Loop1Game();
				 Loop1GameObject.Message();
			 }
		 }
	 }while(guess1!=random1);
	  if((guess1==random1)&&(guess1!=0))
	 {
		 System.out.println(player1+", You have guessed it\n");
		
	 }
	

	 do
	 {
		 System.out.println(player2+", enter your guess (0 to giveup)");
		 two=reader.readInt();
		 
		 if((two>random2)&&(two!=0))
		 {
			 System.out.println("Too High");
			 number=number+1;
		 }
		 else if((two<random2)&&(two!=0))
		 {
			 System.out.println("Too Low");
			 number=number+1;
		 }
		 else if(two==0)
		 {
			 System.out.println(player1+" wins!");
			 System.out.println(player2+" gave up!");
			 System.out.println("\n\nGame Over");
			 System.out.println("Do you want to play (y/n)");
			 game=reader.readChar();
			 if(game=='y') 
			 {
				 LoopGuessingGame LoopGuessingGameObject = new LoopGuessingGame();
					LoopGuessingGameObject.simpleMessage();
			 }
			 else 
			 {
				 Loop1Game Loop1GameObject = new Loop1Game();
				 Loop1GameObject.Message();
			 }
		 }
		 
	 }while(two!=random2);
	 
	 if((two==random2)&&(two!=0))
	 {
		 System.out.println(player2+", You have guessed it\n");
		 
	 }
	 
char result;
	 
	 System.out.println("Enter 'n' to continue to the results");
	 result=reader.readChar();
if(result=='n')
{
	 if((count1<number)&&(number!=count1))
	 {
		 answer=number-count1;
		 System.out.println(player1+" wins!");
		 System.out.println(player1+" won the game with "+answer+" tries less than "+player2);
		 System.out.println("\n\nGame Over");
		 System.out.println("Do you want to play (y/n)");
		 game=reader.readChar();
		 if(game=='y') 
		 {
			 LoopGuessingGame LoopGuessingGameObject = new LoopGuessingGame();
				LoopGuessingGameObject.simpleMessage();
		 }
		 else 
		 {
			 Loop1Game Loop1GameObject = new Loop1Game();
			 Loop1GameObject.Message();
		 }
	 }
	 else if((count1>number)&&(count1!=number))
	 {
		 answer=count1-number;
		 System.out.println(player2+" wins!");
		 System.out.println(player2+" won the game with "+answer+" tries less than "+player1);
		 System.out.println("\n\nGame Over");
		 System.out.println("Do you want to play (y/n)");
		 game=reader.readChar();
		 if(game=='y') 
		 {
			 LoopGuessingGame LoopGuessingGameObject = new LoopGuessingGame();
				LoopGuessingGameObject.simpleMessage();
		 }
		 else 
		 {
			 Loop1Game Loop1GameObject = new Loop1Game();
			 Loop1GameObject.Message();
		 }
	 }
	 else if(count1==number)
	 {
		 System.out.println(player1+" & "+player2+" are tied");
		 System.out.println("They both got "+count1);
		 System.out.println("\n\nGame Over");
		 System.out.println("Do you want to play (y/n)");
		 game=reader.readChar();
		 if(game=='y') 
		 {
			 LoopGuessingGame LoopGuessingGameObject = new LoopGuessingGame();
				LoopGuessingGameObject.simpleMessage();
		 }
		 else
		 {
			 Loop1Game Loop1GameObject = new Loop1Game();
			 Loop1GameObject.Message();
		 }
	 }
	 
}
}

	}

}

