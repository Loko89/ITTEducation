package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class TestSumLongNumbers {

	
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "SumLongNumbers")
	public Object[][] testSumLongNumbers() {
	 return new Object[][] {
	   { "4589356482462", "4712546395736", "09301902878198" }
	   
	 };
	}
	/**
	 * @param firstNumber First input param.
	 * @param secondNumber Second input param.
	 * @param expectedResult Expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "SumLongNumbers")
	public void sumLongNumbers(String firstNumber, String secondNumber, String expectedResult) {

		String actualResult = MathUtility.sumLongInts(firstNumber, secondNumber);
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	
	
	
	
}
