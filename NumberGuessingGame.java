import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
	public static void main(String[] args) {
		int UserGuess = -1,TargetNumber,i,Attempts =5;
		Random Rand = new Random();
		Scanner Input = new Scanner(System.in);
		TargetNumber = Rand.nextInt(100)+1;
		System.out.println("Number Guessing Game \n Guess the number between 1 -100 \n You have "+Attempts+" attempts to guess the target number \n Enter your guesses");
		for(i=1;i<=Attempts;i++)
		{
		    UserGuess = Input.nextInt();
		    if(UserGuess == TargetNumber)
		    {
		        System.out.println("You found it! \n Congradulations!");
		        break;
		    }
		    else if(UserGuess > TargetNumber )
		    {
		        System.out.println("Too high");
		    }
		    else if(UserGuess < TargetNumber)
		    {
		        System.out.println("Too Low");
		    }
		}
		if (i == Attempts || UserGuess!=TargetNumber )
		{
		        System.out.println("You used all attempts , The number is "+TargetNumber+ "\ntry again");
		}		        
	}
}