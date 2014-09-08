package com.sirma.itt.javacourse.intro.hangman;

import java.util.Scanner;

/**
 * @author tpetrov 
 * Represents a Hangman game.
 */
public final class Hangman {
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
		Scanner input = new Scanner(System.in);
		String wordToGuess = HangmanUtility.getRandomString();
		int availableWrongGuesses = 5;
		String selectedLetters = "";
		String hiddenWord = HangmanUtility.hideWord(wordToGuess);
		String chosenLetter = "";

		System.out.print(wordToGuess + "\n");
		System.out.print(hiddenWord + "\n");

		while ((availableWrongGuesses > 0) && !HangmanUtility.isGuessed(hiddenWord)) {
			System.out.print("Input letter to guess: ");
			chosenLetter = input.nextLine();
			if (HangmanUtility.isAlreadySelected(chosenLetter, selectedLetters)) {
				System.out.print("This letter has already been chosen!" + "\n");
				System.out.print(hiddenWord + "\n");
				System.out.print("Guessess until death: " + availableWrongGuesses + "\n");
			} else if (wordToGuess.contains(chosenLetter)) {
				System.out.print("The letter is contained in the word!" + "\n");
				hiddenWord = HangmanUtility.uncoverLetters(chosenLetter, hiddenWord, wordToGuess);
				selectedLetters = HangmanUtility.addLetter(chosenLetter, selectedLetters);
				System.out.print(hiddenWord + "\n");
				System.out.print("Guessess until death: " + availableWrongGuesses + "\n");
			} else {
				System.out.print("The letter is not contained in the word! Try again!" + "\n");
				selectedLetters = HangmanUtility.addLetter(chosenLetter, selectedLetters);
				availableWrongGuesses--;
				System.out.print("Guessess until death: " + availableWrongGuesses + "\n");
			}
		}
		if (HangmanUtility.isGuessed(hiddenWord)) {
			System.out.print("Congratulations!");
		} else {
			System.out.print("-=GAME OVER=-");
		}
		input.close();
	}
}
