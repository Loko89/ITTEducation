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
	 /**
	  * QuickSort algorithm for sorting an array.
	  * @param array An array for sorting.
	  * @param left Left partition of the given array.
	  * @param right Right partition of the given array.
	  * @return returns a index.
	  * 
	  */
	 public static int partition(int[] array, int left, int right)
	 {
	       int i = left;
	       int j = right;
	       int tmp;
	       int pivot = array[(left + right) / 2];
	       while (i <= j) {
	             while (array[i] < pivot)
	                   i++;
	             while (array[j] > pivot)
	                   j--;
	             if (i <= j) {
	                   tmp = array[i];
	                   array[i] = array[j];
	                   array[j] = tmp;
	                   i++;
	                   j--;
	             }
	       }
       return i;
	 }
	 /**
	  * QuickSort algorithm for sorting an array.
	  * @param array An array for sorting.
	  * @param left Left partition of the given array.
	  * @param right Right partition of the given array.
	  * @return returns a sorted array.
	  * 
	  */
	 public static int[] quickSort(int[] array, int left, int right) {
	       int index = partition(array, left, right);
	       if (left < index - 1){
	             quickSort(array, left, index - 1);
	       }
	       if (index < right){
	             quickSort(array, index, right);
	       }
	       return array;
	 }
	 /**
	  * 
	  * @param array An array to reverse.
	  * @return Return the reversed array.
	  */
	 public static int[] reverse(int[] array){
		 int temp = 0;
		 for(int i = 0, j = array.length -1; i < j; i++, j--){
			 temp = array[i];
			 array[i] = array[j];
			 array[j] = temp;
		 }
		 return array;
	 }
}