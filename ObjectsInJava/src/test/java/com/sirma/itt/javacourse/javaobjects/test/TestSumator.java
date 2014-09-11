package com.sirma.itt.javacourse.javaobjects.test;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.sirma.itt.javacourse.javaobjects.Sumator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author tpetrov
 */

public class TestSumator {

	/**
	 * @return Object[][].
	 */
	@DataProvider
	public Object[][] testGetSum() {
		return new Object[][] { 
				{ new Integer[] { 6, 3 }, new Integer(9) }, 
				{ new Float[] { 5.8f, 2.4f }, new Float(8.2) },
				{ new String[] {  "4589356482462", "4712546395736"}, "9301902878198" },
				{ new BigInteger[] { BigInteger.valueOf(9), BigInteger.valueOf(18) }, new BigInteger("27") },
				{ new BigDecimal[] { BigDecimal.valueOf(15), BigDecimal.valueOf(22) }, new BigDecimal("37") }
				};
	}

	/**
	 * @param testArray
	 *            an array containing test data.
	 * @param expectedResult
	 *            the result that is expected to be returned.
	 */
	@Test(dataProvider = "testGetSum")
	public void getSum(Object[] testArray, Object expectedResult) {
		Integer integerObject;
		Float floatObject;
		String stringObject;
		BigInteger bigIntegerObject;
		BigDecimal bigDecimalObject;

		if (testArray instanceof Integer[]) {
			integerObject = Sumator.sum((Integer) testArray[0], (Integer) testArray[1]);
			Assert.assertEquals(integerObject, expectedResult);
		}
		if (testArray instanceof Float[]) {
			floatObject = Sumator.sum((Float) testArray[0], (Float) testArray[1]);
			Assert.assertEquals(floatObject, (Float)expectedResult, 1.0f);
		}
		if (testArray instanceof String[]) {
			stringObject = Sumator.sum((String) testArray[0], (String) testArray[1]);
			Assert.assertEquals(stringObject, expectedResult);
		}
		if (testArray instanceof BigInteger[]) {
			bigIntegerObject = Sumator.sum((BigInteger)testArray[0], (BigInteger)testArray[1]);
			Assert.assertEquals(bigIntegerObject, expectedResult);
		}
		if (testArray instanceof BigDecimal[]) {
			bigDecimalObject = Sumator.sum((BigDecimal)testArray[0], (BigDecimal)testArray[1]);
			Assert.assertEquals(bigDecimalObject, expectedResult);
		}
	}
}
