/**
 * Name: Tom Peacock
 * Date: 8 Feb 2013
 * Lab 3, Project 7
 * Description: Prompt user for the temperature & "C" for Celsius or "F" for Fahrenheit then convert using JOptionPane
 * 
 */
 
import javax.swing.JOptionPane;
public class TempCalcGUI 
{
	public static void main(String[] args) 
	{
		//Prompt user for temp & "C" for Celsius or "F" for Fahrenheit save last character
		String tempStr = JOptionPane.showInputDialog(
				"Please enter a temperature (as an integer) followed by a space \n" +
				"then a \"C\" for Celsius or a \"F\" for Fahrenheit. \n" +
				"Example: 32 C");
		
		//Save entries from the user
		char tempScale = tempStr.charAt(tempStr.length()-1);
		String tempDigit = tempStr.substring(0,tempStr.indexOf(' '));
		int tempNum = Integer.parseInt(tempDigit);
		
		//Calculate the temp then print answer
		switch (tempScale)
		{
		case 'C':
		case 'c':
			int degreesF = (9*(tempNum/5)+32);
			JOptionPane.showMessageDialog(null, tempNum+ " degrees Celsius is " +degreesF+ " degrees Fahrenheit.");
			break;
		case 'F':
		case 'f':
			int degreesC = (5*(tempNum-32)/9);
			JOptionPane.showMessageDialog(null,tempNum+ " degrees Fahrenheit is " +degreesC+ " degrees Celsius.");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Format error, please try again.");
		}
		
		System.exit(0);

	}

}
