/**
 * Name: Tom Peacock
 * Date: 10 Feb 2013
 * Homework 1, Program 4
 * Description: Prompt user for the coefficients in a quadratic equation.  Find the roots of the quadratic equation
 */
import java.util.Scanner;

public class QuadraticEqCalc 
{

	public static void main(String[] args) 
	{
		// Assign scanner & program name
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Calculate the roots of a quadratic equation");
		
		// Prompt user for the coefficients of the equation & save inputs
		System.out.println("Please enter the coefficients of a quadratic equation with a space between each value:");
		System.out.println("Example: x^2 + 5x + 6 will be entered as 1 5 6 ");
		
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		
		// Find the discriminant of the equation & save the equations for finding the roots
		double dis = Math.pow(b, 2) - (4 * a * c);
		double firstRoot = (-b + Math.sqrt(dis)) / (2 * a);
		double secondRoot = (-b - Math.sqrt(dis)) / (2 * a);
				
		// Find the roots using the discriminant
		if (dis > 0)
			System.out.printf("The two roots of the quadratic equation you entered are: %.2f and %.2f", firstRoot, secondRoot);
		if (dis == 0)
			System.out.printf("%.2f is the only root of the quadratic equation you entered", firstRoot);
		if (dis < 0)
			System.out.println("There are no real roots for the quadratic equation you entered.");

		keyboard.close();
	}

}
