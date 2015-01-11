import java.util.Scanner;

/**
 * Name: Tom Peacock
 * Date: 21 Feb 2013
 * Chapter 4, Programming Project 3
 * Description: Repeat Program from Ch 3 project 5 (using loops)
 * 				If user enter value other than C or F print error message
 * 				Prompt user to enter correct temperature scale
 * 				After conversion prompt user to quit (Q or q) or to press any key to do another conversion
 */
public class TempCalc 
{
	public static void main(String[] args) 
	{
		// Assign Scanner & print project info
		Scanner keyboard = new Scanner(System.in);

		String repeat = "";
		String tempScale = "";
		do
		{
			//Prompt user for temp & "C" for Celsius or "F" for Fahrenheit
			System.out.println("Please enter a temperature followed by a space then a \"C\" for Celsius or a \"F\" for Fahrenheit.");
			System.out.println("Example: 32 C");
				
			// Save entries from user
			String tempStr = keyboard.nextLine();
			tempScale = tempStr.substring(tempStr.length()-1);
			String tempDigit = tempStr.substring(0,tempStr.indexOf(' '));
			double tempNum = Double.parseDouble(tempDigit);		
			
			// Check for correct temperature scale
			while ((!tempScale.equalsIgnoreCase("C")) && (!tempScale.equalsIgnoreCase("F")))
			{
				System.out.println("The letter you entered for the temperature scale is incorrect.");
				System.out.println("Please re-enter a C for Celsius or a F for Fahrenheit.");
				tempScale = keyboard.nextLine();
			}
			
			// Calculate temperature
			if (tempScale.equalsIgnoreCase("C"))
			{
				double degreesF = (9*(tempNum/5)+32);
				System.out.printf(tempNum+ " degrees Celsius is %.3f degrees Fahrenheit. ", degreesF);									
					
			}else if (tempScale.equalsIgnoreCase("F"))
			{
				double degreesC = (5*(tempNum-32)/9);
				System.out.printf(tempNum+ " degrees Fahrenheit is %.3f degrees Celsius. ", degreesC);	
			}
			
			//Repeat calculations
			System.out.println();
			System.out.println("If you would like to quit press Q. If you would like to continue press any key then 'Enter'.");
			repeat = keyboard.nextLine();				
				
		}while (!repeat.equalsIgnoreCase("Q"));	
		
		keyboard.close();
		
	}

}
