/**
 * Name: Tom Peacock
 * Date: 28 Feb 2013
 * Homework 2 : Program 2
 *Description: Write a program that lets the user enter the loan amount and loan period in number of years 
 *				and displays the monthly and total payments for each interest rate starting from 3% to 8% in increments of 1/4. 
 * 				The formula for monthly payment is:
 *		loanAmount * monthlyInterestRate / (1 - 1/1+monthlyInterestRate^numberOfYears*12)
 */
import java.util.Scanner;
public class LoanCalc 
{
	public static void main(String[] args) 
	{
		// Assign Scanner & inputs from user
		Scanner keyboard = new Scanner(System.in);
		double loanAmount;
		double loanYears;
		double interestRate = 3.0;
		System.out.println("Loan Payment Calculator");
		
		//Prompt user for loan amount & loan period
		System.out.println("Please enter the loan amount and the loan period in years.");
		System.out.println("Please include a space between both entries.");

		loanAmount = keyboard.nextDouble();
		loanYears = keyboard.nextDouble();
		
		//Calculate payments & print results
		while (interestRate <= 8.0)
		{
			double monthlyInterestRate = interestRate / 1200;
			
			double monthlyPayment = loanAmount * monthlyInterestRate/(1-Math.pow(1+monthlyInterestRate, -loanYears*12));
			System.out.printf("%.2f  %.2f", interestRate, monthlyPayment);
			System.out.println();
			interestRate = interestRate + 0.25;
		}
		
		keyboard.close();
		
	}

}
