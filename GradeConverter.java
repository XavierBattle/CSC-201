import java.util.Scanner;

/**
 * Name: Tom Peacock
 * Date: 22 Feb 2013
 * Chapter 4, Programming Project 6
 * Description: Prompt user for grade % convert to letter grades until user enters a negative integer
 *				List the total grades entered and the number of each letter grade
 */
public class GradeConverter 
{
	public static void main(String[] args) 
	{
		// Assign keyboard and print program info
		Scanner keyboard = new Scanner(System.in);
		
		// Print instructions
		System.out.println("Please enter the grade percentages as an integer");
		System.out.println("Example: 95% is entered as 95");
		System.out.println("When you want to convert the percentages to a letter grade enter a negative number");
		
		int gradeNum = 0;
		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		int gradeD = 0;
		int gradeF = 0;
		
		// while loop for grades
		while (gradeNum >= 0)
		{
			gradeNum = keyboard.nextInt();
			
			if (gradeNum >= 90)
			gradeA ++;
			
			else if ((gradeNum >= 80) || (gradeNum >= 89))
			gradeB ++;
			
			else if ((gradeNum >= 70) || (gradeNum >= 79))
			gradeC ++;
			
			else if ((gradeNum >= 60) || (gradeNum >= 69))
			gradeD ++;
			
			else if ((gradeNum >= 0) || (gradeNum >= 59))
			gradeF ++;
			
		}
		
		int gradeTotal = gradeA + gradeB + gradeC + gradeD + gradeF;
		
		// Print result
		System.out.println("Total number of grades = " + gradeTotal);
		System.out.println("Number of A's = " + gradeA);
		System.out.println("Number of B's = " + gradeB);
		System.out.println("Number of C's = " + gradeC);
		System.out.println("Number of D's = " + gradeD);
		System.out.println("Number of F's = " + gradeF);
		
		keyboard.close();
		
	}

}
