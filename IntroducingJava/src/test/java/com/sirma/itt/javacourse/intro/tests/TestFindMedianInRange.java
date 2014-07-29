package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */

public class TestFindMedianInRange {
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "inRangeMedianFinder")
	public Object[][] testArrayMedianFinder() {
	 return new Object[][] {
	   { new int[]{3, 1, 2, 9, 5, 4, 6, 10, 7, 14, 12, 13, 11, 0 , 8}, 4, 9, 8 }
	   
	 };
	}
	/**
	 * @param array 
	 * 				a test array.
	 * @param low 
	 * 				the index of the first element of the cluster in the array.
	 * @param high 
	 * 				the index of the last element of the cluster in the array.
	 * @param expectedResult Expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "inRangeMedianFinder")
	public void testMedianFinder(int[] array, int low, int high, int expectedResult) {

		int actualResult = MathUtility.findMedianInRange(array,low, high);
		Assert.assertEquals(actualResult, expectedResult);
	}
}
