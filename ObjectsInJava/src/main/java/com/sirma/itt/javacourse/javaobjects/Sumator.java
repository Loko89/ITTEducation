package com.sirma.itt.javacourse.javaobjects;

import java.math.BigInteger;
import java.math.BigDecimal;

import com.sirma.itt.javacourse.utility.MathUtility;

/**
 * @author tpetrov Contains methods for summing two numbers.
 */
public final class Sumator {
	/**
	 * Constructor.
	 */
	private Sumator() {

	}

	/**
	 * @param firstIntNumber
	 *            first integer number to sum.
	 * @param secondIntNumber
	 *            second integer number to sum.
	 * @return the sum of the two integers.
	 */
	public static Integer sum(Integer firstIntNumber, Integer secondIntNumber) {
		return firstIntNumber + secondIntNumber;
	}

	/**
	 * @param firstFloatNumber
	 *            first float number to sum.
	 * @param secondFloatNumber
	 *            second float number to sum.
	 * @return the sum of the two float numbers.
	 */
	public static Float sum(Float firstFloatNumber, Float secondFloatNumber) {
		return firstFloatNumber + secondFloatNumber;
	}

	/**
	 * @param firstStringNumber
	 *            first string number to sum.
	 * @param secondStringNumber
	 *            second string number to sum.
	 * @return the sum of the two string numbers.
	 */
	public static String sum(String firstStringNumber, String secondStringNumber) {
		return MathUtility.sumLongInts(firstStringNumber,secondStringNumber);
	}
	/**
	 * @param firstBigIntegerNumber
	 *            first string number to sum.
	 * @param secondBigIntegerNumber
	 *            second string number to sum.
	 * @return the sum of the two string numbers.
	 */
	public static BigInteger sum(BigInteger firstBigIntegerNumber, BigInteger secondBigIntegerNumber) {
		return firstBigIntegerNumber.add(secondBigIntegerNumber);
	}
	/**
	 * @param firstBigDecimalNumber
	 *            first string number to sum.
	 * @param secondBigDecimalNumber
	 *            second string number to sum.
	 * @return the sum of the two string numbers.
	 */
	public static BigDecimal sum(BigDecimal firstBigDecimalNumber, BigDecimal secondBigDecimalNumber) {
		return firstBigDecimalNumber.add(secondBigDecimalNumber);
	}
	

}
