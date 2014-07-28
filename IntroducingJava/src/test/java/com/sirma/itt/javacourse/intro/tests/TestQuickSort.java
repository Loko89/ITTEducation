package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.MathUtility;
/**
 * 
 * @author tpetrov
 *
 */
public class TestQuickSort {
	/**
	 * 
	 * @return Object[][]
	 */
	@DataProvider(name = "quickSort")
	public Object[][]testQuickSortAlgorithm(){
		return new Object[][]{
				{	new int[] {5, 8, 1, 3, 9, 0, 2, 6, 7, 4},
					new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					new int[] {55, 10, 36, 78, 21, 94, 96, 25, 22},
					new int[] {10, 21, 22, 25, 36, 55, 78, 94, 96}
				}
		};
	}
	/**
	 * @param testArray an array containing test data.
	 * @param expectedResult the result that is expected to be returned.
	 */
	@org.testng.annotations.Test(dataProvider = "quickSort")
	public void testQuickSort(int[] testArray, int[] expectedResult){
		int[] actualResult = MathUtility.quickSort(testArray, 0, testArray.length - 1);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
