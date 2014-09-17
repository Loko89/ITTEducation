package com.sirma.itt.javacourse.intro.hangman;

/**
 * @author tpetrov Contains methods for Hangman game.
 */

public class HangmanGame {

	private static String[] wordsArray = { "computer", "radio", "calculator", "teacher", "bureau",
			"police", "geometry", "president", "subject", "country", "enviroment", "classroom",
			"animals", "province", "month", "politics", "puzzle", "instrument", "kitchen",
			"language", "vampire", "ghost", "solution", "service", "software", "virus", "security",
			"phonenumber", "expert", "website", "agreement", "support", "compatibility",
			"advanced", "search", "triathlon", "immediately", "encyclopedia", "endurance",
			"distance", "nature", "history", "organization", "international", "championship",
			"government", "popularity", "thousand", "feature", "wetsuit", "fitness", "legendary",
			"variation", "equal", "approximately", "segment", "priority", "physics", "branche",
			"science", "mathematics", "lightning", "dispersion", "accelerator", "detector",
			"terminology", "design", "operation", "foundation", "application", "prediction",
			"reference", "measurement", "concept", "perspective", "overview", "position",
			"airplane", "symmetry", "dimension", "toxic", "algebra", "illustration", "classic",
			"verification", "citation", "unusual", "resource", "analysis", "license", "comedy",
			"screenplay", "production", "release", "emphasis", "director", "trademark", "vehicle",
			"aircraft", "experiment" };

	/**
	 * Constructor.
	 */
	public HangmanGame() {
		wordToGuess = randomStringSelector();
		availableWrongGuesses = 5;
		hiddenWord = hideWord(wordToGuess);
		chosenLetter = "";
	}

	private String wordToGuess;
	private int availableWrongGuesses;
	private String selectedLettersArray = "";
	private String hiddenWord;
	private String chosenLetter;

	/**
	 * @return hidden word value.
	 */
	public String getHiddenWord() {
		return hiddenWord;
	}

	/**
	 * @param word
	 *            a value to set.
	 */
	public void setHiddenWord(String word) {
		hiddenWord = word;
	}

	/**
	 * @return available wrong guesses left.
	 */
	public int getAvailableWrongGuesses() {
		return availableWrongGuesses;
	}

	/**
	 * @return array of already selected letters.
	 */
	public String getSelectedLettersArray() {
		return selectedLettersArray;
	}

	/**
	 * @return word to guess.
	 */
	public String getWordToGuess() {
		return wordToGuess;
	}

	/**
	 * @param letter
	 *            letter to set.
	 */
	public void setChosenLetter(String letter) {
		chosenLetter = letter;
	}

	/**
	 * @return the chosen letter.
	 */
	public String getChosenLetter() {
		return chosenLetter;
	}

	/**
	 * @return random chosen word from an array of strings.
	 */
	public String randomStringSelector() {
		return wordsArray[(int) (Math.random() * (wordsArray.length - 1))];
	}

	/**
	 * @param hiddenWord
	 *            a word to guess.
	 * @return true if the word is already fully uncovered otherwise return false
	 */
	public boolean isGuessed(String hiddenWord) {
		boolean uncovered = true;
		for (int index = 0; index < hiddenWord.length(); index++) {
			if (!Character.isLetter(hiddenWord.charAt(index))) {
				uncovered = false;
				break;
			}
		}
		return uncovered;
	}

	/**
	 * @param toGuess
	 *            a word to get some letters from .
	 * @return hidden word with some uncovered letters.
	 */
	public String hideWord(String toGuess) {
		StringBuilder hidden = new StringBuilder(toGuess);
		for (int index = 0; index < toGuess.length(); index++) {
			hidden.setCharAt(index, '*');
		}
		return hidden.toString();
	}

	/**
	 * @param chosenLetter
	 *            a letter to compare.
	 * @param selectedLetters
	 *            a string to search a match with the chosen letter.
	 * @return true if there is a match otherwise return false.
	 */
	public boolean isAlreadySelected(String chosenLetter, String selectedLetters) {
		boolean selected = false;
		if (selectedLetters.isEmpty()) {
			return selected;
		} else {
			if (selectedLetters.contains(chosenLetter)) {
				selected = true;
			} else {
				selected = false;
			}
		}
		return selected;
	}

	/**
	 * @param letter
	 *            a chosen letter to uncover.
	 * @param hiddenWord
	 *            a hidden word to uncover letters.
	 * @param wordToGuess
	 *            a word to get letter's position from.
	 * @return hidden word with the new uncovered letters.
	 */
	public String uncoverLetters(String letter, String hiddenWord, String wordToGuess) {
		StringBuilder hidden = new StringBuilder(hiddenWord);
		for (int index = 0; index < wordToGuess.length(); index++) {
			if (wordToGuess.charAt(index) == letter.charAt(0)) {
				hidden.setCharAt(index, wordToGuess.charAt(index));
			}
		}
		return hidden.toString();
	}

	/**
	 * @param chosenLetter
	 *            a letter string to get data from.
	 * @param selectedLetters
	 *            a letter string to insert new letters into.
	 * @return a letter string with added new letters
	 */
	public String addLetter(String chosenLetter, String selectedLetters) {
		StringBuilder letters = new StringBuilder(selectedLetters);
		if (!selectedLetters.contains(chosenLetter)) {
			letters.append(chosenLetter);
		}
		return letters.toString();
	}

	/**
	 * @param letterArray
	 *            a string to get data from.
	 */
	public void setSelectedLettersArray(String letterArray) {
		selectedLettersArray = letterArray;
	}

	/**
	 * @return decremented availableWrongGuesses.
	 */
	public int decrementAvailableWrongGueses() {
		return availableWrongGuesses--;
	}
}
