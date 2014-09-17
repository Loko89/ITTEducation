package com.sirma.itt.javacourse.intro.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.sirma.itt.javacourse.utility.ArrayUtility;
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
				{
					new int[] { 5 },
					new int[] { 5 }
				},
				{
					new int[] {10, 8},
					new int[] {8, 10}
				},
				{
					new int[] {8, 10},
					new int[] {8, 10}
				},
				{
					new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
					new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
				},
				{
					new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
					new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
				},
				{
					new int[] {55, 25, 1},
					new int[] {1, 25, 55}
				},
				{
					new int[] {55, 10, 36, 78, 21, 94, 96, 25, 22, 55},
					new int[] {10, 21, 22, 25, 36, 55, 55, 78, 94, 96}
				},
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
		int[] actualResult = ArrayUtility.quickSort(testArray);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
