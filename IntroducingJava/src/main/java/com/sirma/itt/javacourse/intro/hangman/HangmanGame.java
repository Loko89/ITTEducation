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

	private String wordToGuess;
	private int availableWrongGuesses;
	private String selectedLettersArray = "";
	private String hiddenWord;

	/**
	 * Constructor.
	 */
	public HangmanGame() {
		wordToGuess = randomStringSelector();
		availableWrongGuesses = 5;
		hiddenWord = hideWord();
	}

	/**
	 * Generates pseudo random number and returns a word from the word array with the index matching
	 * the generated number.
	 * 
	 * @return random chosen word from an array of strings.
	 */
	private String randomStringSelector() {
		return wordsArray[(int) (Math.random() * (wordsArray.length - 1))];
	}

	/**
	 * Returns true if the word is fully uncovered.
	 * 
	 * @return true if the word is already fully uncovered otherwise return false
	 */
	public boolean isGuessed() {
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
	 * Method that returns the chosen game word but with "*" instead of letters.
	 * 
	 * @return hidden word with some uncovered letters.
	 */
	private String hideWord() {
		StringBuilder hidden = new StringBuilder(wordToGuess);
		for (int index = 0; index < hidden.length(); index++) {
			hidden.setCharAt(index, '*');
		}
		return hidden.toString();
	}

	/**
	 * Method that returns true if the chosen letter has already been chosen.
	 * 
	 * @param chosenLetter
	 *            a letter to check.
	 * @return true if there is a match otherwise return false.
	 */
	public boolean isAlreadySelected(String chosenLetter) {
		boolean selected = false;
		if (selectedLettersArray.isEmpty()) {
			return selected;
		} else {
			if (selectedLettersArray.contains(chosenLetter)) {
				selected = true;
			} else {
				selected = false;
			}
		}
		return selected;
	}

	/**
	 * Method that returns true if chosen game word contains the chosen letter.
	 * 
	 * @param chosenLetter
	 *            a letter to check.
	 * @return true if the letter is contained in the word, otherwise return false.
	 */
	public boolean isContained(String chosenLetter) {
		return wordToGuess.contains(chosenLetter);
	}

	/**
	 * Uncovers letters in the word that match the chosen letter if there is one or more matches in
	 * the word.
	 * 
	 * @param chosenLetter
	 *            a letter to uncover.
	 * @return hidden word with the new uncovered letters.
	 */
	private String uncoverLetters(String chosenLetter) {
		StringBuilder hidden = new StringBuilder(hiddenWord);
		for (int index = 0; index < wordToGuess.length(); index++) {
			if (wordToGuess.charAt(index) == chosenLetter.charAt(0)) {
				hidden.setCharAt(index, wordToGuess.charAt(index));
			}
		}
		return hidden.toString();
	}

	/**
	 * A method that adds the chosen letter to the array containing already selected letters if the
	 * chosen letter is not already contained in the array.
	 * 
	 * @param chosenLetter
	 *            a letter to add.
	 * @return a letter string with added new letters
	 */
	private String addLetter(String chosenLetter) {
		StringBuilder letters = new StringBuilder(selectedLettersArray);
		if (!selectedLettersArray.contains(chosenLetter)) {
			letters.append(chosenLetter);
		}
		return letters.toString();
	}

	/**
	 * A method that accepts an input string, checks if the string has already been used before and
	 * searches for match in the string that represents the chosen game word.
	 * 
	 * @param input
	 *            an input string
	 * @return an int that matches current case: 0 - the string has been chosen before; 1 - the
	 *         input string is contained in the other one; 2 - the input string is not contained int
	 *         the other one.
	 */
	public int caseSelector(String input) {
		int caseSelector;
		if (isAlreadySelected(input)) {
			caseSelector = 0;
		} else if (isContained(input)) {
			setHiddenWord(input);
			setSelectedLettersArray(input);
			caseSelector = 1;
		} else {
			setSelectedLettersArray(input);
			decrementAvailableWrongGuesses();
			caseSelector = 2;
		}
		return caseSelector;
	}

	/**
	 * Returns true if the word is not fully uncovered and the rmaining available wrong guesses are
	 * not down to 0.
	 * 
	 * @return true if the conditions are met otherwise return false;
	 */
	public boolean isGameActive() {
		return ((availableWrongGuesses > 0) && (!isGuessed()));

	}

	/**
	 * Method that returns true if the input string matches the chosen game word.
	 * 
	 * @param chosenLetter
	 *            a string to compare.
	 * @return true if the two strings are equal, otherwise return false.
	 */
	public boolean isACorrectFinalAnswer(String chosenLetter) {
		return chosenLetter.equalsIgnoreCase(wordToGuess);

	}

	/**
	 * Uncovers the hidden word.
	 */
	public void uncoverWord() {
		hiddenWord = wordToGuess;
	}

	/**
	 * Adds a letter in the array containing already selected letters.
	 * 
	 * @param chosenLetter
	 *            a letter to add in the array
	 */
	public void setSelectedLettersArray(String chosenLetter) {
		selectedLettersArray = addLetter(chosenLetter);
	}

	/**
	 * @return hidden word value.
	 */
	public String getHiddenWord() {
		return hiddenWord;
	}

	/**
	 * @param chosenLetter
	 *            a letter to set.
	 */
	public void setHiddenWord(String chosenLetter) {
		hiddenWord = uncoverLetters(chosenLetter);
	}

	/**
	 * @return available wrong guesses left.
	 */
	public int getAvailableWrongGuesses() {
		return availableWrongGuesses;
	}

	/**
	 * Getter method for wordToGuess.
	 * 
	 * @return the wordToGuess
	 */
	public String getWordToGuess() {
		return wordToGuess;
	}

	/**
	 * Decrements available wrong guesses.
	 */
	public void decrementAvailableWrongGuesses() {
		availableWrongGuesses--;

	}

}
