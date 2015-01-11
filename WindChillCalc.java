/**
 * Name: Tom Peacock
 * Date: 10 Feb 2013
 * Homework 1, Program 3
 *Description: Prompt user for temperature (-58F to 41F), wind speed (greater than or equal to 2 mph). 
 *			   Display wind-chill temperature. 
 */
import java.util.Scanner;

public class WindChillCalc 
{

	public static void main(String[] args) 
	{
		// Assign new scanner & program name
		Scanner keyboard = new Scanner(System.in);	
		System.out.println("Wind-Chill Calculator");
		
		// Prompt user for the temp (-58F to 41F) & store response 
		System.out.println("Please enter the temperature in Fahrenheit");
		System.out.println("The temperature must be between -58 and 41");
		double temp = keyboard.nextDouble();
		
		//Prompt user for the wind speed (greater than or equal to 2 mph)
		System.out.println("Please enter the wind speed in miles per hour");
		System.out.println("The wind speed must be greater than or equal to 2");
		double wind = keyboard.nextDouble();
		
		//Check conditions & calculate wind-chill
		if ((temp < -58) || (temp > 41) || (wind < 2))
		{
			System.out.println("The values you entered are outside of the specified limits.");
			System.exit(0);
		}
		else
		{
			double twc = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind,0.16) + 0.4275 * temp * Math.pow(wind, 0.16);
			System.out.printf("The wind-chill temperature is: %.2f degrees Fahrenheit", twc);
		}

		keyboard.close();
		
	}

}
