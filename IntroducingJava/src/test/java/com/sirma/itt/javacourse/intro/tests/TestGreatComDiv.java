package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class TestGreatComDiv {
	
	/**
	 * Test class.
	 * @return Object[][]
	 */
		
		@DataProvider(name = "GrComDiv")
		public Object[][] testCalcGreatestCommonDivisor() {
		 return new Object[][] {
		   { 10, 15, 5 },
		   { -10, -15, 5},
		   { -10, 15, 5},
		   { 10, -15, 5}
		 };
		}
		
		/**
		 * @param firstNumber First input param.
		 * @param secondNumber Second input param.
		 * @param expectedResult Expected result.
		 */
		@org.testng.annotations.Test(dataProvider = "GrComDiv")
		public void greatComDiv(int firstNumber, int secondNumber, int expectedResult) {
			
			int actualResult = MathUtility.calcGreatestCommonDivisor(firstNumber, secondNumber);
			Assert.assertEquals(actualResult, expectedResult);
		
		}

}
