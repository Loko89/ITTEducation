package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public final class LeastCommonMultiplier {
	/**
	 * 
	 */
	private LeastCommonMultiplier(){
		
	}
	/**
	 * Program for finding the least common multiplier of two numbers.
	 * @param args global param.
	 */
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input X: ");
		int x = input.nextInt(); 				
		System.out.print("Imput Y: ");
		int y = input.nextInt();				
		System.out.println("The leas common multiplier of " + x + " and " + y + " is: " + MathUtility.calcLeastCommonMultiplier(x, y));
		input.close();
	}

}
