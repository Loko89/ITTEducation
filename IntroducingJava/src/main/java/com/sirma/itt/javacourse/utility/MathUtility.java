package com.sirma.itt.javacourse.utility;

/**
 * @author tpetrov Contains calculation methods
 */
public final class MathUtility {
	/**
	 * Constructor.
	 */
	private MathUtility() {
	}

	/**
	 * Calculates the greates common divisor of two integers.
	 * 
	 * @param numberA
	 *            stores the first number.
	 * @param numberB
	 *            stores the second number.
	 * @return returns the result of the calculation.
	 */
	public static int calcGreatestCommonDivisor(int numberA, int numberB) {
		int firstNumber = Math.abs(numberA);
		int secondNumber = Math.abs(numberB);
		while (firstNumber != secondNumber) {
			if (firstNumber > secondNumber) {
				firstNumber = firstNumber - secondNumber;
			} else {
				secondNumber = secondNumber - firstNumber;
			}
		}
		return firstNumber;
	}

	/**
	 * Calculates the least common multiplier of two integers.
	 * 
	 * @param numberA
	 *            stores the first number.
	 * @param numberB
	 *            stores the second number.
	 * @return returns the result of the calculation.
	 */
	public static int calcLeastCommonMultiplier(int numberA, int numberB) {

		int firstNumber = Math.abs(numberA);
		int secondNumber = Math.abs(numberB);
		return (firstNumber * secondNumber) / calcGreatestCommonDivisor(firstNumber, secondNumber);
	}

	/**
	 * 
	 @param array
	 *            Stores an array varuable.
	 * @return returns the sum of all elements in the array.
	 */
	public static int sumArrayElementsValues(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}
	/**
	 * @param firstNumber
	 *            first number param.
	 * @param secondNumber
	 *            second number param.
	 * @return the sum of the numbers returned as string.
	 */

	public static String sumLongInts(String firstNumber, String secondNumber) {

		char[] firstNumberArray = firstNumber.toCharArray();
		char[] secondNumberArray = secondNumber.toCharArray();

		if ((!ArrayUtility.validateInput(firstNumberArray))
				|| (!ArrayUtility.validateInput(secondNumberArray))) {
			return "Error! Non-digit character found!";
		}
		return sum(firstNumberArray, secondNumberArray);
	}

	/**
	 * This method sums takes two arrays and sums every couple of the two arrays 
	 * that has the same indexes and return and returns the final sum as string.
	 * 
	 * @param firstArray
	 *            first array variable.
	 * @param secondArray
	 *            second array variable.
	 * @return sum of the elements with the same index plus carry value from the previous index sum.
	 */
	public static String sum(char[] firstArray, char[] secondArray) {

		int[] tempIntArrayA = ArrayUtility.charToInt(firstArray);
		int[] tempIntArrayB = ArrayUtility.charToInt(secondArray);

		if (tempIntArrayA.length != tempIntArrayB.length) {
			if (tempIntArrayA.length > tempIntArrayB.length) {
				tempIntArrayB = ArrayUtility.normalizeToLength(tempIntArrayB, tempIntArrayA.length);
			} else {
				tempIntArrayA = ArrayUtility.normalizeToLength(tempIntArrayA, tempIntArrayB.length);
			}
		}
		int sum = 0;
		int carry = 0;
		int[] result = new int[tempIntArrayA.length + 1];

		for (int index = tempIntArrayA.length - 1; index >= 0; index--) {
			sum = (tempIntArrayA[index] + tempIntArrayB[index] + carry);
			result[index + 1] = sum % 10;
			carry = sum / 10;
		}

		result[0] = carry;

		String resultString = "";
		if (result[0] == 0) {
			resultString = ArrayUtility.subString(result, 1, result.length);
		} else {
			resultString = ArrayUtility.subString(result, 0, result.length);
		}

		return resultString;
	}

	/**
	 * Generates an array of random letters and numbers.
	 * 
	 * @param arrayLength
	 *            length of the array.
	 * @return random letter or digit as char symbol.
	 */
	public static char[] generateRandomSymbolArray(int arrayLength) {
		char[] charArray = new char[arrayLength];
		for (int index = 0; index < arrayLength; index++) {
			while (!((Character.isLetter(charArray[index])) || (Character.isDigit(charArray[index])))) {
				charArray[index] = (char) ((Math.random() * 79) + 48);
			}
		}
		return charArray;
	}

}
