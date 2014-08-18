package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public final class SumLongNumbers {

	/**
	 * Constructor.
	 */
	private SumLongNumbers() {
			
	};
/**
 * 
 * @param args global param
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstNumber = null;
		String secondNumber = null;
		System.out.print("Input first number: ");
		firstNumber = input.nextLine();
		System.out.print("Input second number: ");
		secondNumber = input.nextLine();
		
		System.out.print("The result is: " + MathUtility.sumLongInts(firstNumber, secondNumber));
		
		input.close();
	}

}
