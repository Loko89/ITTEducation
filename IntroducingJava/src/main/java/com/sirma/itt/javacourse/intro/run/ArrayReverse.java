package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.ArrayUtility;
/**
 * Program for finding an array's medyan.
 * @author tpetrov
 *
 */
public final class ArrayReverse {
	/**
	 * Constructor.
	 */
	private ArrayReverse(){
		
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
		myArray = ArrayUtility.reverseIntArray(myArray);
		for (int i =0; i < myArray.length; i++){
			System.out.printf(myArray[i] + ",");
		}
		input.close();
	}

}
