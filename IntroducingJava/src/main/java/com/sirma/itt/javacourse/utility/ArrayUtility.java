package com.sirma.itt.javacourse.utility;
/**
 * 
 * @author tpetrov
 * Contains array processing methods.
 */
public final class ArrayUtility {
	/**
	 * Constructor.
	 */
	private ArrayUtility() {
		
	}
	
	/**
	 * Finding an array's medyan.
	 * 
	 * @param array
	 *            an array variable.
	 * @return returns the array's median.
	 */
	public static int findArraysMedian(int[] array) {

		int arrayPointer = 0;
		int medianIndex = 0;
		int difference = 0;
		int smallestDifference = 0;
		int leftSum = 0;
		int rightSum = 0;

		if (array.length <= 1) {
			return arrayPointer;
		} else {
			smallestDifference = MathUtility.sum(array);
			for (arrayPointer = 0; arrayPointer < array.length; arrayPointer++) {
				if (arrayPointer == 0) {
					leftSum = 0;
				} else{
					for (int iterator = 0; iterator < arrayPointer; iterator++) {
						leftSum += array[iterator];
					}
				}
				if (arrayPointer == array.length - 1) {
					rightSum = 0;
				} else {
					for (int iterator = arrayPointer + 1; iterator < array.length; iterator++) {
						rightSum += array[iterator];
					}
				}
				difference = Math.abs(rightSum - leftSum);
				leftSum = 0;
				rightSum = 0;
				
				if (smallestDifference > difference) {
					smallestDifference = difference;
					medianIndex = arrayPointer;
				}
			}
			return medianIndex + 1;
		}
	}
	/**
	 * 
	 * @param charArray
	 * 				a character array to get data from.
	 * @param intArray
	 * 				an integer array to save converted data in.
	 */
	
	public static void charToInt(char[] charArray, int[] intArray ) {
		for (int iterator = 0; iterator < charArray.length; iterator++) {	
			intArray[iterator] = Character.getNumericValue(charArray[iterator]);
		}
	}
	/**
	 * @param array
	 *            An array to reverse.
	 * @return Return the reversed array.
	 */
	public static int[] reverseArray(int[] array) {
		
		int temp = 0;
		for (int firstIndex = 0, secondIndex = array.length - 1; firstIndex < secondIndex; firstIndex++, secondIndex--) {
			temp = array[firstIndex];
			array[firstIndex] = array[secondIndex];
			array[secondIndex] = temp;
		}
		return array;
	}
	/**
	 * prints the array's elements to screen.
	 * 
	 * @param array
	 *            Stores an array varuable.
	 */
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element myArray[" + i + "] is: " + array[i]);
		}
	}
	/**
	 * @param array
	 *            Stores an array varuable.
	 * @return returns the index of the element with minimum value.
	 */
	public static int getMinElement(int[] array) {

		int minElementIndex = 0;
		for (int i = minElementIndex; i < array.length; i++) {
			if (array[minElementIndex] > array[i]) {
				minElementIndex = i;
			}
		}
		return minElementIndex;
	}
	/**
	 * @param array
	 *            an array variable
	 * @param pos1
	 *            the index of the first element to be swapped.
	 * @param pos2
	 *            the index of the second element to be swapped.
	 */
	public static void swap(int[] array, int pos1, int pos2) {

		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;

	}
	/**
	 * 
	 * @param charNumberArray
	 * 						an array of chars to be validate.
	 * @return false if one or or both variables contain non-digit character.
	 */
	public static boolean validateInput(char[] charNumberArray) {
		for (int iterator = 0; iterator < charNumberArray.length; iterator++) {
			if (!Character.isDigit(charNumberArray[iterator])) {
				return false;
			}
		}
		return true;
	}
}
