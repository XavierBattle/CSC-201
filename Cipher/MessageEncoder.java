/**
 * Name: Tom Peacock
 * Lab9 Exercise17
 * Date: 16 Apr 2013
 * Description: MessageEncoder interface for ShufflerCipher class
 *
 */

//Encodes a text
public interface MessageEncoder 
{
	//returns the encoded text
	public String encode(String plainText);
	
}
