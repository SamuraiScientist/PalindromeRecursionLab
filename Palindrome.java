/**This program will have the user enter a word or phrase and check if it is a plaindrome(methods)
*
*/

public class Palindrome
{
	int arrayOffset = 0; //Offset to skip blank spaces
	Palindrome() //Empty constructor
	{

	}
	/**This function will loop through a given phrase and remove non-letters
	*@param phrase String of user input phrase or word
	*@return String with just letters left
	*/
	public String stripSpace(String phrase)
	{
		char[] phraseArray = phrase.toCharArray(); //Converts String to char array
		int arrayPos = 0; //Used for tracking position in strippedArray
		char[] strippedArray = new char[phraseArray.length]; //Used to store letters from provided phrase
		for (int x = 0; x < phraseArray.length; x++)
		{
			if ((phraseArray[x] >= 65 && phraseArray[x] <= 90) || (phraseArray[x] >= 97 && phraseArray[x] <= 122)) //Checks if char is within the range of upper or lower case letters on the ASCII table
			{
				strippedArray[arrayPos] = phraseArray[x]; //Adds letter
				arrayPos++; //Increments position for next letter by 1
			} //This will make sure all NULL chars or \0s will be at the end of the array
		}
		this.arrayOffset = phraseArray.length - arrayPos; //Starting offset when check if palindrome
		return new String(strippedArray).toLowerCase(); //Returns char array converted to string put to lower case
	}
	/**Checks if the word or phrase is a palindrome
	*@param phrase String of phrase that will be checked
	*@return Boolean if the given phrase is a palindrome
	*/
	public boolean isPalindrome(String phrase)
	{
		return isPalindrome(phrase, 0, (phrase.length() - arrayOffset) - 1);
	}
	/**Checks if the phrase is a palindrome recursively
	*@param phrase String of phrase that will be checked
	*@param low Int goes through first half of string left to right
	*@param high Int goes through second half of string right to left
	*@return Boolean if the given phrase is a palindrome
	*/
	public boolean isPalindrome(String phrase, int low, int high)
	{
		if (high <= low)
		{
			return true;
		}
		else if (phrase.charAt(low) != phrase.charAt(high))
		{
			return false;
		}
		else
		{
			return isPalindrome(phrase, low + 1, high - 1);
		}
	}
	/**Returns result
	*@param originalPhrase String of original phrase the user was asked to enter
	*@param result Boolean for if the phrase was a palindrome or not
	*/
	public void returnResult(String originalPhrase, boolean result)
	{
		if (result)
		{
			System.out.println('"' + originalPhrase + '"' + " is a palindrome");
		}
		else
		{
			System.out.println('"' + originalPhrase + '"' + " is not a palindrome");
		}
	}
}