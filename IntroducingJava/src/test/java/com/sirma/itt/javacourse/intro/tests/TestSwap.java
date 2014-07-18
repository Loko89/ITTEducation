package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class TestSwap {
	
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "testSwap")
	public Object[][] testSwapFunc() {
	 return new Object[][] {
	   {new int[] {5, 9, 3, 7 , 8, 3}, 2, 4, new int[] {5, 9, 8, 7, 3, 3}}
	   
	 };
	}
	/**
	 * @param testArray 
	 * 				an array variable.
	 * @param pos1
	 * 				position of the first element to be swapped.
	 * @param pos2
	 *				position of the second element to be swapped.
	 * @param expectedResult Expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "testSwap")
	public void testSwap(int[] testArray, int pos1, int pos2, int[] expectedResult) {
		MathUtility.swap(testArray, 2, 4);
		
		
		
		Assert.assertEquals(testArray, expectedResult);
	}

}
