/**
 * Name: Tom Peacock
 * Date: 3 Feb 2013
 * Homework 1, Program 1
 * Description: Prompt user for the sub-total and gratuity (%), then compute gratuity total and grand total.
 */
import java.util.Scanner;

public class TipCalc 
{
	public static void main(String[] args) 
	{
		//assign scanner & program name
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Tip Calculator");
		
		//prompt user for total of the check
		System.out.println("Please enter the total of the check without the dollar sign.");
		double subtotal = keyboard.nextDouble();
		
		//prompt user for the gratuity percentage
		System.out.println("Please enter the gratuity percentage as an integer without the percent sign.");
		System.out.println("Example: 15% is entered as 15");
		int gratuity = keyboard.nextInt();
		
		//calculate gratuity total and grand total
		double gratuityTotal = subtotal*(gratuity*.01);
		double grandTotal = subtotal+gratuityTotal;
		
		//print totals
		System.out.printf("The total for the gratuity is $%.2f and your grand total is $%.2f", 
				gratuityTotal, grandTotal);
		
		keyboard.close();
	}

}
