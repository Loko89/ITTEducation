package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */

public class TestArrayReverser {
	
	/**
	 * 
	 * @return Object[][]
	 */
	@DataProvider(name = "arrayReverser")
	public Object[][]testReverse(){
		return new Object[][]{
				{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
					new int[] {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1} }
		};
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned.
	 */
	@org.testng.annotations.Test(dataProvider = "arrayReverser")
	public void testArrayReverser(int[] testArray, int[] expectedResult){
		int[] actualResult = MathUtility.reverseArray(testArray);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
