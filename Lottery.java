/**
 * Name: Tom Peacock
 * Date: 10 Feb 2013
 * Homework 1, Program 5
 *Description: Create a lottery program.  If the user guesses 1 number they win $1000, 2 numbers $3000, 
 *				all 3 numbers $10000
 */
import java.util.Scanner;

public class Lottery 
{

	public static void main(String[] args) 
	{
		// Assign scanner & program name
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Lottery");
		
		//Create the winning number
		int lottery1 = (int)(Math.random()*9);
		int lottery2 = (int)(Math.random()*9);
		int lottery3 = (int)(Math.random()*9);
		int lottery = Integer.parseInt(lottery1 +""+ lottery2 +""+ lottery3);
		
		// Prompt user to guess a number
		System.out.println("Please enter a three digit number:");
		int guess = keyboard.nextInt();
		int guess1 = guess / 100;
		int guess2 = guess % 100 / 10;
		int guess3 = guess % 10;
		
		// Print Lottery numbers and check for a winner and print output
		System.out.println("The winning lottery numbers are: " +lottery1+ " " +lottery2+ " " +lottery3);
		if (lottery == guess)
		{
			System.out.println("Congratulations, you just won $10,000.");
			System.exit(0);
		}
		
		if (((guess1 == lottery1) || (guess1 == lottery2) || (guess1 == lottery3)) &&
			((guess2 == lottery1) || (guess2 == lottery2) || (guess2 == lottery3)) &&
			((guess3 == lottery1) || (guess3 == lottery2) || (guess3 == lottery3)))
		{
			System.out.println("Congratulations, you just won $3,000.");
			System.exit(0);
		}
		
		if ((guess1 == lottery1) || (guess1 == lottery2) || (guess1 == lottery3) || 
		    (guess2 == lottery1) || (guess2 == lottery2) || (guess2 == lottery3) || 
		    (guess3 == lottery1) || (guess3 == lottery2) || (guess3 == lottery3))
		{
			System.out.println("Congratulations, you just won $1,000.");
			System.exit(0);
		}
		
		keyboard.close();
		
	}

}
