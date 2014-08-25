package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */

public class TestRandomSymbolGenerator {
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "TestRandomSymbolGenerator")
	public Object[][] testRandomSymbolGenerator() {
		 return new Object[][] { 
				 { 10, true },
				 { 15, true}
		 };
		}
	/**
	 * @param arrayLength length of the array.
	 * @param expectedResult Expected result.
	 */
	@org.testng.annotations.Test(dataProvider = "TestRandomSymbolGenerator")
	public void randomSymbolGenerator(int arrayLength, boolean expectedResult) {
		
		boolean actualResult = false;
		char symbol =' ';
		for (int iterator = 0; iterator < arrayLength; iterator++) {
			symbol = MathUtility.getRandomSymbol();
			if ((Character.isLetter(symbol)) || (Character.isDigit(symbol))){
				actualResult = true;
			} else {
				actualResult = false;
				break;
			}
		}
		Assert.assertEquals(actualResult, expectedResult);
	}
}
