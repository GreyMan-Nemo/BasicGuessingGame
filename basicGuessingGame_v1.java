/* Java revision work sheet 2
 * This is for revision learning OOP
 * This program will random select a value between 0 and 9
 * The user(s) will then attempt to guess that number 
 * 16/09/2019
 */

package javaHNDOOP;

// Importing required modules
import java.util.Scanner;

// New public class
public class BasicGuessingGame {
	
	// Initialising imported modules
	static Scanner kboard = new Scanner( System.in);
	
	// Creating main function/method
	public static void main( String[] args) {

		String userInput;
		
		System.out.println( "Welcome to G.M.N Basic Guessing Game..");
		System.out.println( "I will pick a number, you must guess what it is...");
		System.out.println( " ");
		System.out.println( "Are you ready? [ press 'p' to play ]");
			userInput = kboard.next();	
			
		if( userInput.equalsIgnoreCase( "P")) {
			genNumber();
			
		} // Closing if statement
	} // Closing main function/method
	
	// Creating a function to generate a random value (between 0 and 9)
	static void genNumber( ) {
		
		int number;
		
		number = ( int)( Math.random()) +1;
		System.out.println( "I have a number");
		System.out.println( " ");
		
		playerGuess( number);
		
	} // Closing genNumber function/method
	
	static void playerGuess( int number) {
	
		int userGuess;
		
		System.out.println( "What is your guess?");
		userGuess = kboard.nextInt();
		
		while( userGuess != number) {
			System.out.println( "Nope, Sorry. Try Again");
				userGuess = kboard.nextInt();
				
		} // Closing if statement
		
		if( userGuess == number) {
			System.out.println( "That is correct");
			
		} // Closing else statement
	} // Closing playerGuess method/function
} // Closing BasicGuessing Game class
