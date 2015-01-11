/**
 * Name: Tom Peacock
 * Lab9 Program 9
 * Date 19 Apr 2013
 * Description: MessageDecoder interface for ShufflerCipher class
 *
 */

//Decodes a text
public interface MessageDecoder 
{
	//returns the decoded text
	public String decode(String cipherText);

}
