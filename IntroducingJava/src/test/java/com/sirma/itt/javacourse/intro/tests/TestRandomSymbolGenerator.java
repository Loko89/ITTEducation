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
				 { 10 },
				 { 15 }
		 };
		}
	/**
	 * @param arrayLength length of the array.
	 */
	@org.testng.annotations.Test(dataProvider = "TestRandomSymbolGenerator")
	public void randomSymbolGenerator(int arrayLength) {
		
		boolean actualResult = true;
		char[] charArray = MathUtility.generateRandomSymbolArray(arrayLength);
		
		for (int index = 0; index < arrayLength; index++) {			
			if (!((Character.isLetter(charArray[index])) || (Character.isDigit(charArray[index])))){
				//actualResult = true;
				actualResult = false;
				break;
			}
		}
		Assert.assertTrue(actualResult);
	}
}
