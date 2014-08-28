package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * Program for generating an array of random symbols by given length. 
 * @author tpetrov
 *
 */
public final class RandomSymbolGenerator {
	/**
	 * Constructor.
	 */
	private RandomSymbolGenerator(){
		
	}
	/**
	 * @param args global argument.
	 */
	public static void main(String[] args) {
		
		int arrayLength = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of the elements: ");
		arrayLength = input.nextInt();
		char[] myArray = MathUtility.generateRandomSymbolArray(arrayLength);
		System.out.print(myArray);
		input.close();
	}

}
