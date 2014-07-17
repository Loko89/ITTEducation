package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class TestCalcLeastComDiv {

	
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "LeastComMult")
	public Object[][] testCalcLeastCommonMultiplier() {
	 return new Object[][] {
	   { 10, 15, 30 }
	 };
	}
	/**
	 * @param firstNumber First input param.
	 * @param secondNumber Second input param.
	 * @param expectedResult Expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "LeastComMult")
	public void leastComDiv(int firstNumber, int secondNumber, int expectedResult) {

		int actualResult = MathUtility.calcLeastCommonMultiplier(firstNumber, secondNumber);
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	
	
	
	
}
