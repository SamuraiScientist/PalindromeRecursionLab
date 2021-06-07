/**This program will have the user enter a word or phrase and check if it is a plaindrome
*
*/

import java.util.Scanner;

public class demoPalindrome
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //Creates scanner for user input
		String userPalindrome; //Stores phrase the user enters
		String phrase; //Stores user-entered phrase with just letters from stripSpace()
		boolean result; //Result if the user entered a palindrome from isPalindrome()
		Palindrome palindrome = new Palindrome(); //Because for some dumb reason in Java, I need to construct a class to use methods from another file
		System.out.print("Please enter anything: "); //User input prompt
		userPalindrome = input.nextLine(); //Takes and stores user input
		phrase = palindrome.stripSpace(userPalindrome); //Passes user input to have anything that isn't a letter removed
		System.out.println(userPalindrome); //Testing purposes
		System.out.println(phrase); //Testing purposes
		result = palindrome.isPalindrome(phrase); //Check if user phrase is a palindrome or not and returns result
		palindrome.returnResult(userPalindrome, result); //Prints original phrase and if it was a palindrome
	}
}
