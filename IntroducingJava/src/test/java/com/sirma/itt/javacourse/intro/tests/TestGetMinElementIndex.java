package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */

public class TestGetMinElementIndex {
	
	/**
	 * @return Object[][].
	 */
	@DataProvider(name = "getMinElementIndex")
	public Object[][] testGetMinElementIndex() {
	 return new Object[][] {
	   { new int[]{1, 2, 2}, 0 }
	 };
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned. 
	 */
	@org.testng.annotations.Test(dataProvider = "getMinElementIndex")
	public void getMinElementIndex(int[] testArray, int expectedResult) {
		int actualResult = MathUtility.getMinElement(testArray);
		Assert.assertEquals(actualResult, expectedResult);
	
	}
	
	
}
