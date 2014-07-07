package com.sirma.itt.javacourse.utility;

/**
 * 
 * @author tpetrov
 * Contains calculation methods
 */
public class IntegerProcessing{
	/**
	 * Calculates the greates common divisor of two integers
	 * @param a stores the first number
	 * @param b stores the second number
	 * @return returns the result of the calculation
	 */
	 public static int calcGreatestCommonDivisor(int a, int b){
		
		while (a != b){
			if (a > b)
				a = a - b;
			else 
				b = b - a;
		}
		return a;
	}
	 /**
	 * Calculates the least common multiplier of two integers
	 * @param a stores the first number
	 * @param b stores the second number
	 * @return returns the result of the calculation
	  */
	 public static int calcLeastCommonMultiplier(int a, int b){
			int c = (a * b)/calcGreatestCommonDivisor(a, b);
			return c;
		 }
	 /**
	  * 
	  * @param array Stores an array varuable
	  * @param length Stores the legth of the array (its number of elements)
	  * @return returns the index of the element with minimum value
	  */
	 public static int getMinElement(int[] array, int length){
		 
		 int minElementIndex = 0;
		 for(int i = minElementIndex; i < length; i++){
			 if(array[minElementIndex] > array[i]){
				 minElementIndex = i;
			 }
		 }
		 return minElementIndex;
	 }
	 /**
	  * 
	   @param array Stores an array varuable
	  * @return returns the sum of all elements in the array
	  */
	 public static int sum(int[] array){
		 int result = 0;
		 for (int i = 0;i < array.length;i++){
			 result+=array[i];
		 }
		 return result;
	 }
	 /**
	  * prints the array's elements to screen
	  * @param array Stores an array varuable
	  */
	 public static void print(int [] array){
		 for (int i = 0;i < array.length;i++){
			 System.out.println("Element myArray["+i+"] is: "+array[i]);
		 }
	 }
}