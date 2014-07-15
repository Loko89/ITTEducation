package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * Program for finding an array's medyan.
 * @author tpetrov
 *
 */
public final class ArrayMedyanFinder {
	/**
	 * Constructor.
	 */
	private ArrayMedyanFinder(){
	
	}
	/**
	 * 
	 * @param args global param.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[15];
		for (int iterator = 0; iterator < myArray.length; iterator++ ){
			System.out.printf("Input myArray[" + iterator + "]: ");
			myArray[iterator] = input.nextInt();
		}
		System.out.println("The Array's medyan is an element with index "
		+ MathUtility.findArraysMedian(myArray, 0, myArray.length - 1) + "\n" + " and value " 
				+ myArray[MathUtility.findArraysMedian(myArray, 0, myArray.length - 1)] );
		input.close();
	}

}
