package hangmanClass;
import java.util.Scanner;

/*
 * Consider a class that could be used to play a game of hangman. 
 * The class has the following attributes:

The secret word
The disguised word, in which each unknown letter in the secret word is replaced with a question mark (?). 
For example, if the secret word is abracadabra, and the letters a , and b have been guessed, the disguised word would be ab?a?a?ab?a
The number of guesses made
The number of incorrect guesses

It will have the following methods:

MakeGuess(c) guesses that character c is in the word
getDisguisedWord returns a string containing correctly guessed letters in their correct positions and unknown letters replaced with ?
getSecretWord returns the secret word
getGuessCount returns the number of guesses made
isFound returns true if the hidden word has been discovered.

Perform the following actions:

Write a method heading for each method.
Write preconditions and postconditions for each method.
Write some Java statements that test the class.
Implement the class.
List any additional methods and attributes needed in the implementation that were not listed in the original design. List any other changes made to the original design.
Write a program that implements the game of handgman, using the class you wrote for part d.

 */

public class Hangman {

	private String secretWord;
	private String disguisedWord;
	private int guessCount;
	private int incorrectGuessesCount;
	
	public void startGame(String secretWord) {
		this.secretWord = secretWord;
		this.disguisedWord = "";
		for (int i = 0; i < this.secretWord.length(); i++) {
			disguisedWord += "?";
		}
	}
	
	public void makeGuess(char guess) {
		boolean match = false;
		
		for (int i = 0; i < this.secretWord.length(); i++) {
			if (secretWord.charAt(i) == guess) {
				StringBuilder newString = new StringBuilder(disguisedWord);
				newString.setCharAt(i, guess);
				
				disguisedWord = newString.toString();
				
				match = true;
				
			} 
			
		}
		if (!match) {
			this.incorrectGuessesCount++;
		}
	}
	
	public boolean isFound() {
		if (this.disguisedWord.contains("?")) {
			return false;
		} else {
			System.out.println("You Won!!");
			return true;
		}
	}
	
	public String getDisguisedWord() {
		return this.disguisedWord;
	}
	
	public int getGuessCount() {
		return this.guessCount;
	}
	
	public void playGame() {
		while(!this.isFound()) {
			System.out.println("The disguised word is <" + this.disguisedWord + ">");
			this.guessCount++;
			System.out.println("Guess a letter: ");
			Scanner keyboard = new Scanner(System.in);
			char letter = keyboard.next().charAt(0);
			
			this.makeGuess(letter);
			
			System.out.println("Guesses made " + this.guessCount + " with " + this.incorrectGuessesCount + " wrong.");
		}
	}
	
	public static void main(String[] args) {
		Hangman game = new Hangman();
		game.startGame("testing");
		System.out.println("Begin game!");
		game.playGame();
				
	}
	
	
	

}
