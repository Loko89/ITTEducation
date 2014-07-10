package com.sirma.itt.javacourse.utility;

/**
 * 
 * @author tpetrov
 * Contains calculation methods
 */
public final class MathUtility{
	/**
	 * 
	 */
	private MathUtility(){
	/**
	 * Constructor.
	 */	
	}
	/**
	 * Calculates the greates common divisor of two integers.
	 * @param a stores the first number.
	 * @param b stores the second number.
	 * @return returns the result of the calculation.
	 */
	 public static int calcGreatestCommonDivisor(int a, int b){
		 int c = a;
		 int d = b;
		 while (c != d){
			 if (c > d)
				 c = c - d;
			 else 
				 d = d - c;
		 }
		 return c;
	}
	 /**
	 * Calculates the least common multiplier of two integers.
	 * @param a stores the first number.
	 * @param b stores the second number.
	 * @return returns the result of the calculation.
	  */
	 public static int calcLeastCommonMultiplier(int a, int b){
			int c = (a * b)/calcGreatestCommonDivisor(a, b);
			return c;
		 }
	 /**
	  * 
	  * @param array Stores an array varuable.
	  * @return returns the index of the element with minimum value.
	  */
	 public static int getMinElement(int[] array){
		 
		 int minElementIndex = 0;
		 for(int i = minElementIndex; i < array.length; i++){
			 if(array[minElementIndex] > array[i]){
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
	 public static int sum(int[] array){
		 int result = 0;
		 for (int i = 0;i < array.length;i++){
			 result+=array[i];
		 }
		 return result;
	 }
	 /**
	  * prints the array's elements to screen.
	  * @param array Stores an array varuable.
	  */
	 public static void print(int [] array){
		 for (int i = 0;i < array.length;i++){
			 System.out.println("Element myArray["+i+"] is: "+array[i]);
		 }
	 }
	 /**
	  * Finding an array's medyan.
	  * @param array Stores an array varuable.
	  * @return returns the array's medyan.
	  */
	 public static int findArraysMedyan(int[]array){
		int medyan = 0;
		return medyan;
	 }
}