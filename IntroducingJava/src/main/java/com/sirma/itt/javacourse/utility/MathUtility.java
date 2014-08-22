package com.sirma.itt.javacourse.utility;

/**
 * @author tpetrov 
 * Contains calculation methods
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
	public static int sum(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}	


	/**
	 * QuickSort algorithm for sorting an array.
	 * @param leftIndex
	 * 				  the index of the first element in the array
	 * @param rightIndex
	 * 				   the index of the last element in the array
	 * @param array
	 *            An array for sorting.
	 * @return returns a sorted array.
	 */

	public static int[] quickSort(int[] array, int leftIndex, int rightIndex) {
		
		if ((rightIndex - leftIndex) <= 1) {
			if (((rightIndex - leftIndex) == 1) && (array[leftIndex] > array[rightIndex])) {
				ArrayUtility.swap(array, leftIndex, rightIndex);
			}
			return array;			
		} else {
			int pivot = rightIndex;
			int left = leftIndex;
			int right = rightIndex - 1;
			
			while (left <= right) {
				while (array[left] < array[pivot]) {
					left++;
				}
				while (array[right] > array[pivot]) {
					right--;
				}
				if ((array[left] > array[pivot]) 
						&&(array[right] < array[pivot]) 
						&& (left <= right)) {
					ArrayUtility.swap(array, left, right);
				}
			}
			ArrayUtility.swap(array, pivot, left);
			pivot = left;
			quickSort(array, leftIndex, pivot - 1);
			quickSort(array, pivot + 1, rightIndex);
		}
		return array;
	}

	
	/**
	 * 
	 * @param firstNumber
	 * 					first number param.
	 * @param secondNumber
	 * 					second number param.
	 * @return the sum of the numbers returned as string.
	 */
	
	public static String sumLongInts(String firstNumber, String secondNumber){
		
	
		char[] firstNumberArray = firstNumber.toCharArray();
		char[] secondNumberArray = secondNumber.toCharArray();
		
		if ((!ArrayUtility.validateInput(firstNumberArray)) || (!ArrayUtility.validateInput(secondNumberArray))) {
			return "Error! Non-digit character found!";
		}
		
		int[] integerArrayA = null;
		int[] integerArrayB = null;
		int[] result = null;
		
		if (firstNumberArray.length > secondNumberArray.length) {
			integerArrayA = new int[firstNumberArray.length];
			integerArrayB = new int[firstNumberArray.length];
			result = new int[firstNumberArray.length + 1];
		} else {
			integerArrayA = new int[secondNumberArray.length];
			integerArrayB = new int[secondNumberArray.length];
			result = new int[secondNumberArray.length + 1];
		}
		firstNumberArray = ArrayUtility.reverseCharArray(firstNumberArray);
		secondNumberArray = ArrayUtility.reverseCharArray(secondNumberArray);
		
		ArrayUtility.charToInt(firstNumberArray, integerArrayA);
		ArrayUtility.charToInt(secondNumberArray, integerArrayB);
			
		result = getNumberSummary(integerArrayA, integerArrayB);	
		result = ArrayUtility.reverseIntArray(result);
		
		String resultString = "";
		if (result[0] == 0) {
			resultString = ArrayUtility.combineStringInGivenRange(result, 1, result.length);
		} else {
			resultString = ArrayUtility.combineStringInGivenRange(result, 0, result.length);
		}
			
		return resultString;
	}
	
	/**
	 * 
	 * @param firstArray
	 * 					first array variable.
	 * @param secondArray
	 * 					second array variable.
	 * @return sum of the elements with the same index plus carry value from the previous index sum.
	 */
	public static int[] getNumberSummary(int[] firstArray, int[] secondArray) {
		
		int carry = 0;
		int[] result = null;
		
		if (firstArray.length > secondArray.length) {
			result = new int[firstArray.length + 1];
		} else {
			result = new int[secondArray.length + 1];
		}
		
		for (int iterator = 0; iterator < result.length; iterator++) {
			if (iterator < result.length - 1) {
				result[iterator] = (firstArray[iterator] + secondArray[iterator] + carry) % 10;
				carry = (firstArray[iterator] + secondArray[iterator] + carry) / 10;
			} else {
				result[iterator] = carry;
			}
		}		
		return result;
	}
	/**
	 * 
	 * @return random letter or digit as char symbol.
	 */
	public static char getRandomSymbol(){
		char symbol = ' ';
		return symbol;
	}
}
