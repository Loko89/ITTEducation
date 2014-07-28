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
		int lowValue = 0;
		int highValue = 0;

		if (array.length <= 1) {
			return arrayPointer;
		} else {
			smallestDifference = sum(array);
			for (arrayPointer = 1; arrayPointer < array.length - 1; arrayPointer++) {
				for (int iterator = 0; iterator < arrayPointer; iterator++) {
					lowValue += array[iterator];
				}
				for (int iterator = arrayPointer + 1; iterator < array.length; iterator++) {
					highValue += array[iterator];
				}
				difference = Math.abs(highValue - lowValue);
				lowValue = 0;
				highValue = 0;
				
				if (smallestDifference > difference) {
					smallestDifference = difference;
					medianIndex = arrayPointer;
				}
			}
		}
		return medianIndex + 1;
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
		
		if ((rightIndex - leftIndex)<= 1) {
			if (((rightIndex - leftIndex) == 1)&& (array[leftIndex] > array[rightIndex])) {
				swap(array, leftIndex, rightIndex);
			}
			return array;			
		} else {
			int pivot = rightIndex;
			int left = leftIndex;
			int right = rightIndex - 1;
			
			while (left <= right) {
				while (array[left] < array[pivot]){
					left++;
				}
				while (array[right] > array[pivot]) {
					right--;
				}
				if ((array[left] > array[pivot]) 
						&&(array[right] < array[pivot]) 
						&& (left <= right)) {
					swap(array, left, right);
				}
			}
			swap(array, pivot, left);
			pivot = left;
			quickSort(array, leftIndex, pivot - 1);
			quickSort(array, pivot + 1, rightIndex);
		}
		return array;
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
	 * Finding an array's medyan in given range of elements.
	 * @param array
	 *            an array variable.
	 * @param leftIndex
	 * 				  the index of the first element in the array
	 * @param rightIndex
	 * 				   the index of the last element in the array            
	 * @return returns the array's median in the given range of elements.
	 */
	public static int findMedianInRange(int[] array, int leftIndex, int rightIndex){
		
		int counter = 0;
		for (int iterator = leftIndex; iterator <= rightIndex; iterator++ ) {
			counter++;
		}
		int[] cluster = new int[counter];
		counter = 0;
		
		for (int iterator = leftIndex; iterator <= rightIndex; iterator++ ) {
			cluster[counter] = array[iterator];
			counter++;
		}
		int median = findArraysMedian(cluster);
		return median;
	}
}
