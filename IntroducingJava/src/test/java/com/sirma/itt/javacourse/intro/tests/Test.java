package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class Test {
/**
 * Test class.
 * @return Object[][]
 */
	
	@DataProvider(name = "GrComDiv")
	public Object[][] testCalcGreatestCommonDivisor() {
	 return new Object[][] {
	   { 10, 15, 8 },
	   { 11, 12, 7 },
	   { 10, 15, 5 }
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
		Assert.assertEquals(actualResult, expectedResult, "some message");
		System.err.println();
	
	}
	/**
	 * @return Object [][].
	 */
	@DataProvider(name = "LeastComMult")
	public Object[][] testCalcLeastCommonMultiplier() {
	 return new Object[][] {
	   { 7, 15, 4 },
	   { 11, 12, 7 },
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
		Assert.assertEquals(actualResult, expectedResult, "some message");	
		System.err.println();
	}
	/**
	 * @return Object[][].
	 */
	@DataProvider(name = "getMinElementIndex")
	public Object[][] testGetMinElementIndex() {
	 return new Object[][] {
	   { new int[]{1,2,2}, 0 }
	 };
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned. 
	 */
	@org.testng.annotations.Test(dataProvider = "getMinElementIndex")
	public void getMinElementIndex(int[] testArray, int expectedResult ){
		int actualResult = MathUtility.getMinElement(testArray);
		Assert.assertEquals(actualResult, expectedResult, "Error");
	
	}
	/**
	 * @return Object[][].
	 */
	@DataProvider(name = "getSumOfTheElements")
	public Object[][] testGetSumOfTheElements() {
	 return new Object[][] {
	   { new int[]{6,3,8}, 17 }
	 };
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned. 
	 */
	@org.testng.annotations.Test(dataProvider = "getSumOfTheElements")
	public void getSumOfTheElements(int[] testArray, int expectedResult){	
		int actualResult = MathUtility.sum(testArray);
		Assert.assertEquals(actualResult, expectedResult, "Error");
		System.err.println();
		
	}
	/**
	 * 
	 * @return Object[][]
	 */
	@DataProvider(name = "arrayReverser")
	public Object[][]testReverse(){
		return new Object[][]{
				{new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},new int[]{
					15,14,13,12,11,10,9,8,7,6,5,4,3,2,1}},
				{new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},new int[]{
						15,1,13,12,11,10,9,8,7,6,5,4,3,2,14}}
		};
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned.
	 */
	@org.testng.annotations.Test(dataProvider = "arrayReverser")
	public void testArrayReverser(int[]testArray, int[] expectedResult){
		int[] actualResult = MathUtility.reverseArray(testArray);
		Assert.assertEquals(actualResult, expectedResult, "Error");
		System.err.println();
	}
}
