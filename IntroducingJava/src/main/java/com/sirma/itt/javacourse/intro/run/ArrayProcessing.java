package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * Program for processing an array of integers.
 * @author tpetrov
 */
public final class ArrayProcessing {
/**
 * 
 */
	private ArrayProcessing(){
		
	}
/**
 * 
 * @param args global param.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[]myArray = new int[10];
		for (int i = 0;i < myArray.length;i++){
			System.out.printf("Insert element N"+i+": ");
			myArray[i] = input.nextInt();
		}
		System.out.println("The index of the MIN element in the array is "+MathUtility.getMinElement(myArray));
		System.out.println("The SUM of the elements in the array is "+MathUtility.sum(myArray));
		MathUtility.print(myArray);
		input.close();
	}
	
}
