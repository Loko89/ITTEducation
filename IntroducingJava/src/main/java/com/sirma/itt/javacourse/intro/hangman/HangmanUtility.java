package com.sirma.itt.javacourse.intro.hangman;

/**
 * @author tpetrov Contains methods for Hangman game.
 */

public final class HangmanUtility {
	/**
	 * Constructor.
	 */
	private HangmanUtility() {

	}

	/**
	 * @return random chosen word from an array of strings.
	 */
	public static String getRandomString() {
		String chosenWord = null;
		String[] wordsArray = { "computer", "radio", "calculator", "teacher", "bureau", "police",
				"geometry", "president", "subject", "country", "enviroment", "classroom",
				"animals", "province", "month", "politics", "puzzle", "instrument", "kitchen",
				"language", "vampire", "ghost", "solution", "service", "software", "virus",
				"security", "phonenumber", "expert", "website", "agreement", "support",
				"compatibility", "advanced", "search", "triathlon", "immediately", "encyclopedia",
				"endurance", "distance", "nature", "history", "organization", "international",
				"championship", "government", "popularity", "thousand", "feature", "wetsuit",
				"fitness", "legendary", "variation", "equal", "approximately", "segment",
				"priority", "physics", "branche", "science", "mathematics", "lightning",
				"dispersion", "accelerator", "detector", "terminology", "design", "operation",
				"foundation", "application", "prediction", "reference", "measurement", "concept",
				"perspective", "overview", "position", "airplane", "symmetry", "dimension",
				"toxic", "algebra", "illustration", "classic", "verification", "citation",
				"unusual", "resource", "analysis", "license", "comedy", "screenplay", "production",
				"release", "emphasis", "director", "trademark", "vehicle", "aircraft", "experiment" };
		int index = (int) (Math.random() * ((wordsArray.length - 1) - 0) + 0);
		chosenWord = wordsArray[index];
		return chosenWord;
	}

	/**
	 * @param hiddenWord
	 *            a word to guess.
	 * @return true if the word is already fully uncovered otherwise return false
	 */
	public static boolean isGuessed(String hiddenWord) {
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
	public static String hideWord(String toGuess) {
		StringBuilder hidden = new StringBuilder(toGuess);
		for (int index = 0; index < toGuess.length() - 1; index++) {
			if ((index == 0) || (index == toGuess.length() / 2) || (index == toGuess.length() - 1)) {
				hidden.setCharAt(index, toGuess.charAt(index));
			} else {
				hidden.setCharAt(index, '*');
			}
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
	public static boolean isAlreadySelected(String chosenLetter, String selectedLetters) {
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
	public static String uncoverLetters(String letter, String hiddenWord, String wordToGuess) {
		StringBuilder hidden = new StringBuilder(hiddenWord);
		for (int index = 0; index < wordToGuess.length() - 1; index++) {
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
	public static String addLetter(String chosenLetter, String selectedLetters) {
		StringBuilder letters = new StringBuilder(selectedLetters);
		if (!selectedLetters.contains(chosenLetter)) {
			letters.append(chosenLetter);
		}
		return letters.toString();
	}
}
