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
	   { "4589356482462", "4712546395736", "9301902878198" },
	   {"100", "3000", "3100"},
	   {"10000", "200", "10200"},
	   {"999999", "1", "1000000"}
	 };
	}
	/**
	 * @param firstNumber 
	 * 					first input param.
	 * @param secondNumber 
	 * 					second input param.
	 * @param expectedResult 
	 * 					expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "SumLongNumbers")
	public void sumLongNumbers(String firstNumber, String secondNumber, String expectedResult) {

		String actualResult = MathUtility.sumLongInts(firstNumber, secondNumber);
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	
	
	
	
}
