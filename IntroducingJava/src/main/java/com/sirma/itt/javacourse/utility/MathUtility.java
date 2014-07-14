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
			return (numberA * numberB)/calcGreatestCommonDivisor(numberA, numberB);		
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
			 result+=array[i];
		 }
		 return result;
	 }
	 /**
	  * prints the array's elements to screen.
	  * @param array Stores an array varuable.
	  */
	 public static void print(int [] array) {
		 for (int i = 0;i < array.length;i++) {
			 System.out.println("Element myArray["+i+"] is: "+array[i]);
		 }
	 }
	 /**
	  * Finding an array's medyan.
	  * @param array Stores an array varuable.
	  * @param leftIndex the index of the first element of the array.
	  * @param rightIndex the index of the last element of the array.
	  * @return returns the array's medyan.
	  */
	 public static int findArraysMedyan(int[] array, int leftIndex, int rightIndex) {
		return leftIndex + (rightIndex - leftIndex)/2;
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
		 
		 int pivot = findArraysMedyan(array, leftIndex, rightIndex);
		 if( array.length <= 1 ){
			 return array;
		 }
		 else{			 
			 for(int iterator = 0; iterator <= rightIndex; iterator++) {
				 if(iterator != pivot){
					 if(array[iterator] > array[pivot]) {
						 int temp = array[pivot];
						 array[pivot] = array[iterator];
						 array[iterator] = temp;				 
					 }
				 }
			 }
		 }
		 quickSort(array, leftIndex, pivot-1);
		 quickSort(array, pivot, rightIndex-1);
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