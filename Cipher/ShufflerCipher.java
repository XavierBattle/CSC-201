/**
 * Name: Tom Peacock
 * Lab9 Exercise17 & Program9
 * Date: 16 Apr 2013
 * Description: Use the interface MessageEncoder (exercise 15).
 * 			The constructor should have one parameter called n.
 * 			Create an "encode(plainText)" method that shuffles the message "n" times.
 *				(split the message into two / take characters from each and shuffle into one message) 
 */
 
import java.util.Scanner;
public class ShufflerCipher implements MessageEncoder, MessageDecoder
{
	private String shuffle = "";
	private String decodedText = "";
	private int textLength;
		
	//Shuffles the text once
	public String encode(String plainText)
	{
		textLength = plainText.length();		
		int count = 0;
		
		if(textLength % 2 == 0)
		{
			for(int i = 0; i < textLength / 2; i++)
				shuffle = shuffle + plainText.charAt(i) + plainText.charAt(i + (textLength / 2));
		}
		if(textLength % 2 == 1)
		{
			do
			{
				shuffle = shuffle + plainText.charAt(count) + plainText.charAt(count + (textLength / 2));
				count ++;
			}while(count < textLength / 2);
			
			shuffle = shuffle + plainText.charAt(textLength - 1);
		}	
		
		return shuffle;
	}
	
	//decodes the text once
	public String decode(String cipherText)
	{
		textLength = cipherText.length();		
		int count;
		
		if(textLength % 2 == 0)
		{
			count = 0;
			for(int i = 0; i < textLength / 2; i++)
			{
				decodedText = decodedText + cipherText.charAt(count);
				count = count + 2;
			}
			count = 1;
			for(int i = 0; i < textLength / 2; i++)
			{
				decodedText = decodedText + cipherText.charAt(count);
				count = count + 2;
			}
				
		}
		
		if(textLength % 2== 1)
		{
			count = 0;
			for(int i = 0; i < textLength / 2; i++)
			{
				decodedText = decodedText + cipherText.charAt(count);
				count = count + 2;
			}
			count = 1;
			for(int i = 0; i < textLength / 2; i++)
			{
				decodedText = decodedText + cipherText.charAt(count);
				count = count + 2;
			}
			
			decodedText = decodedText + cipherText.charAt(textLength - 1);			
		}
		
		return decodedText;
	}
	
	//Shuffles the message "n" times & prints out the encoded text / decodes the text & prints out the original message
	public ShufflerCipher(int n)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the text you want to encode:");
		String text = keyboard.nextLine();
		
		for(int count = 0; count < n; count++)
		{
			shuffle = "";
			this.encode(text);
			text = shuffle;			
		}
		
		System.out.println("Your encoded text is: " + shuffle);
		
		//Decodes text & prints out original text
		for(int count = 0; count < n; count++)
		{
			decodedText = "";
			this.decode(shuffle);
			shuffle = decodedText;
			
		}
		
		System.out.println("Your original text was: " +decodedText);
		
		
		keyboard.close();
	}

}
