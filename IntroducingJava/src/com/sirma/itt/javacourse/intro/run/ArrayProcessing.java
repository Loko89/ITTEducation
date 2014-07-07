package com.sirma.itt.javacourse.intro.run;
import java.util.Scanner;

import com.sirma.itt.javacourse.utility.IntegerProcessing;
/**
 * 
 * @author tpetrov
 *
 */
public class ArrayProcessing {
/**
 * 
 * Program for processing an array of integers
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[]myArray = new int[10];
		for (int i = 0;i < myArray.length;i++){
			System.out.printf("Insert element N"+i+": ");
			myArray[i] = input.nextInt();
		}
		System.out.println("The index of the MIN element in the array is "+IntegerProcessing.getMinElement(myArray,myArray.length));
		System.out.println("The SUM of the elements in the array is "+IntegerProcessing.sum(myArray));
		IntegerProcessing.print(myArray);
		input.close();
	}

}
