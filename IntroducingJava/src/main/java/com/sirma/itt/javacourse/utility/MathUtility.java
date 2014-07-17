package com.sirma.itt.javacourse.utility;

/**
 * 
 * @author tpetrov
 * Contains calculation methods
 */
public final class MathUtility {
	/**
	 * 
	 */
	private MathUtility() {
	/**
	 * Constructor.
	 */	
	}
	/**
	 * Calculates the greates common divisor of two integers.
	 * @param numberA stores the first number.
	 * @param numberB stores the second number.
	 * @return returns the result of the calculation.
	 */
	 public static int calcGreatestCommonDivisor(int numberA, int numberB) {
		 int firstNumber = numberA;
		 int secondNumber = numberB;
		 
		 if (firstNumber < 0){
			 firstNumber *= -1;
		 }
		 if (secondNumber < 0) {
			 secondNumber *= -1;
		 }
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
	 * @param numberA stores the first number.
	 * @param numberB stores the second number.
	 * @return returns the result of the calculation.
	  */
	 public static int calcLeastCommonMultiplier(int numberA, int numberB) {
		 
		 int firstNumber = numberA;
		 int secondNumber = numberB;
		 
		 if (firstNumber < 0){
			 firstNumber *= -1;
		 }
		 if (secondNumber < 0) {
			 secondNumber *= -1;
		 }
			return (firstNumber * secondNumber)/calcGreatestCommonDivisor(numberA, numberB);		
		 }
	 /**
	  * 
	  * @param array Stores an array varuable.
	  * @return returns the index of the element with minimum value.
	  */
	 public static int getMinElement(int[] array) {
		 
		 int minElementIndex = 0;
		 for (int i = minElementIndex; i < array.length; i++) {
			 if(array[minElementIndex] > array[i]) {
				 minElementIndex = i;
			 }
		 }
		 return minElementIndex;
	 }
	 /**
	  * 
	   @param array Stores an array varuable.
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
	  * @param array Stores an array varuable.
	  */
	 public static void print(int [] array) {
		 for (int i = 0; i < array.length;i++) {
			 System.out.println("Element myArray[" + i + "] is: " + array[i]);
		 }
	 }
	 /**
	  * Finding an array's medyan.
	  * @param array an array variable.
	  * @return returns the array's medyan.
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
			for (int iterator = 0; iterator < array.length; iterator++){
				smallestDifference += array[iterator];
			}
			for (arrayPointer = 1; arrayPointer < array.length - 1; arrayPointer++) {
				for (int iterator = 0; iterator < arrayPointer; iterator ++) {
					lowValue += array[iterator];
				}
				for (int iterator = arrayPointer + 1; iterator < array.length; iterator ++) {
					highValue += array[iterator];
				}
				if ( highValue > lowValue){
					difference = highValue - lowValue;
					lowValue = 0;
					highValue = 0;					
				} else {
					difference = lowValue - highValue;
					lowValue = 0;
					highValue = 0;
				}
				if (smallestDifference > difference) {
					smallestDifference = difference;
					medianIndex = arrayPointer;
				}
			}
		 }
		 return medianIndex + 1;
	    }
	 /**
	  * 
	  * @param firstNumber first number to be swapped.
	  * @param secondNumber second number to be swapped.
	  */
	 public static void swap(Integer firstNumber, Integer secondNumber ) {
		 
		 int temp1 = firstNumber;
		 int temp2 = secondNumber;
		
		 firstNumber = temp2;
		 secondNumber = temp1;
	 }
	 
	 /**
	  * QuickSort algorithm for sorting an array.
	  * @param array An array for sorting.
	  * @param leftIndex The index of the first element of the array.
	  * @param rightIndex The index of the last element of the array.
	  * @return returns a sorted array.
	  * 
	  */
	 public static int[] quickSort(int[] array, int leftIndex, int rightIndex) {
		 if (array.length <= 1) {
			 return array;
		 }
		 return array;
	 }
	
	 /**
	  * 
	  * @param array An array to reverse.
	  * @return Return the reversed array.
	  */
	 public static int[] reverseArray(int[] array) {
		 /**
		  * @param temp Stores teporary data while exchanging values.
		  */
		 int temp = 0; 
		 for(int firstIndex = 0, secondIndex = array.length -1;
				 firstIndex < secondIndex;
				 firstIndex++, secondIndex--) {
			 temp = array[firstIndex];
			 array[firstIndex] = array[secondIndex];
			 array[secondIndex] = temp;
		 }
		 return array;
	 }
}