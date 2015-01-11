/**
 * Name: Tom Peacock
 * Date: 3 Feb 2013
 * Homework 1, Program 2
 * Description: Calculate the energy needed to heat water from an initial temp to a final temp.
 */
import java.util.Scanner;

public class EnergyToHeatWater 
{

	public static void main(String[] args) 
	{
		// Assign scanner & program name
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Energy required to heat water");
		
		// Prompt user for the amount of water in Kg
		System.out.println("Please enter the amount of water you want to heat in kilograms.");
		double water = keyboard.nextDouble();
		
		// Prompt user for the initial temp and the final temp of the water
		System.out.println("Please enter the inital temperature of the water and the desired final temperature of the water in Celsius with a space in between");
		double initialTemp = keyboard.nextDouble();
		double finalTemp = keyboard.nextDouble();
		
		//formula
		double energy = water*(finalTemp-initialTemp)*4184;
		
		//print the answer
		System.out.println("The amount of energy needed to heat " +water+ " kilograms of water from " +initialTemp+ " degrees Celsius to " +finalTemp+ " degrees Celsius is: " +energy+ " Joules.");

		keyboard.close();
		
	}

}
