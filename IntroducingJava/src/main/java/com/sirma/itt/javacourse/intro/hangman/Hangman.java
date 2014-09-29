package com.sirma.itt.javacourse.intro.hangman;

import java.util.Scanner;

/**
 * @author tpetrov Represents a Hangman game.
 */
public final class Hangman {
	private static String[] messages = new String[] { "This letter has already been chosen!",
			"The letter is contained in the word!",
			"The letter is not contained in the word! Try again!", "Guessess until death: " };
	/**
	 * Constructor.
	 */
	private Hangman() {

	}

	/**
	 * @param args
	 *            global argument.
	 */

	public static void main(String[] args) {
		
		HangmanGame hangmanGame = new HangmanGame();
		System.out.print(hangmanGame.getHiddenWord() + "\n");
		Scanner input = new Scanner(System.in);
		String myGuess = "";
		int caseSelector = 0;
		while (hangmanGame.isGameActive()) {
			System.out.print("Input letter to guess: ");
			myGuess = input.nextLine().toLowerCase();
			caseSelector = hangmanGame.caseSelector(myGuess);
			if ((myGuess.length() != 1)
					&& (myGuess.length() == hangmanGame.getWordToGuess().length())) {
				if (hangmanGame.isACorrectFinalAnswer(myGuess)) {
					hangmanGame.uncoverWord();
				}
				break;
			} else {
				System.out.print(messages[caseSelector] + "\n");
				System.out.print(hangmanGame.getHiddenWord() + "\n");
				System.out.print(messages[3] + hangmanGame.getAvailableWrongGuesses() + "\n");
			}
		}
		if (hangmanGame.isGuessed()) {
			System.out.print("Congratulations! You guessed right!");
		} else {
			System.out.print("Sorry you failed! The word is: " + hangmanGame.getWordToGuess()
					+ "\n" + "-=GAME OVER=-");
		}
		input.close();
	}
}
