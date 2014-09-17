package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */

public class TestGetSumOfTheElements {
	
	
	/**
	 * @return Object[][].
	 */
	@DataProvider(name = "getSumOfTheElements")
	public Object[][] testGetSumOfTheElements() {
	 return new Object[][] {
	   { new int[]{6, 3, 8}, 17 }
	 };
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned. 
	 */
	@org.testng.annotations.Test(dataProvider = "getSumOfTheElements")
	public void getSumOfTheElements(int[] testArray, int expectedResult){	
		int actualResult = MathUtility.sumArrayElementsValues(testArray);
		Assert.assertEquals(actualResult, expectedResult);
	}
}
