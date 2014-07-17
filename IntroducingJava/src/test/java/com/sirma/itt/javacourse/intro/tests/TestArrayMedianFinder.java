package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */

public class TestArrayMedianFinder {
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "MedianFinder")
	public Object[][] testArrayMedianFinder() {
	 return new Object[][] {
	   { new int[]{1, 2 ,3, 4 ,5}, 4 },
	   { new int[]{4, 5, 99, -1, 5, 6}, 3 }
	 };
	}
	/**
	 * @param array a test array.
	 * @param expectedResult Expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "MedianFinder")
	public void leastComDiv(int[] array, int expectedResult) {

		int actualResult = MathUtility.findArraysMedian(array);
		Assert.assertEquals(actualResult, expectedResult);
	}
}
