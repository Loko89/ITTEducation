package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class GreatestCommonDivisor {
/**
 * Program for finding the greatest common divisor of two numbers
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Input X: ");
			int x = input.nextInt(); 				//stores first number
			System.out.print("Imput Y: ");
			int y = input.nextInt();				//stores second number	
			System.out.println("The greatest common divisor of "+x+" and "+y+" is: "+MathUtility.calcGreatestCommonDivisor(x, y));
			input.close();
	}
}
