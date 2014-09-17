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
		HangmanGame hangmanGame = new HangmanGame();
		System.out.print(hangmanGame.getHiddenWord() + "\n");
		Scanner input = new Scanner(System.in);
		String chosenLetter = "";
		while ((hangmanGame.getAvailableWrongGuesses() > 0) && !hangmanGame.isGuessed(hangmanGame.getHiddenWord())) {
			System.out.print("Input letter to guess: ");
			chosenLetter = input.nextLine();
			hangmanGame.setChosenLetter(chosenLetter);			
			if (hangmanGame.isAlreadySelected(hangmanGame.getChosenLetter(), hangmanGame.getSelectedLettersArray())) {
				System.out.print("This letter has already been chosen!" + "\n");
				System.out.print(hangmanGame.getHiddenWord() + "\n");
				System.out.print("Guessess until death: " + hangmanGame.getAvailableWrongGuesses() + "\n");
			} else if (hangmanGame.getWordToGuess().contains(chosenLetter )) {
				System.out.print("The letter is contained in the word!" + "\n");
				hangmanGame.setHiddenWord(hangmanGame.uncoverLetters(chosenLetter, hangmanGame.getHiddenWord(), hangmanGame.getWordToGuess()));
				hangmanGame.setSelectedLettersArray(hangmanGame.addLetter(chosenLetter, hangmanGame.getSelectedLettersArray()));
				System.out.print(hangmanGame.getHiddenWord() + "\n");
				System.out.print("Guessess until death: " + hangmanGame.getAvailableWrongGuesses() + "\n");
			} else {
				System.out.print("The letter is not contained in the word! Try again!" + "\n");
				hangmanGame.setSelectedLettersArray(hangmanGame.addLetter(chosenLetter, hangmanGame.getSelectedLettersArray()));
				hangmanGame.decrementAvailableWrongGueses();
				System.out.print("Guessess until death: " + hangmanGame.getAvailableWrongGuesses() + "\n");
				System.out.print(hangmanGame.getHiddenWord() + "\n");
			}
		}
		if (hangmanGame.isGuessed(hangmanGame.getHiddenWord())) {
			System.out.print("Congratulations!");
		} else {
			System.out.print("Sorry you failed! The word is: " + hangmanGame.getWordToGuess() + "\n" + "-=GAME OVER=-");
		}
		input.close();
	}
}
