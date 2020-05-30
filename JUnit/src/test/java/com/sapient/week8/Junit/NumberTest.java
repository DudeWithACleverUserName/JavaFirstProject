package com.sapient.week8.Junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberTest {

	@Test
	public void testPrimeNumberForValidInput() {

		assertTrue(Number.checkPrime(83));
		assertFalse(Number.checkPrime(12));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrimeNumberForInvalidIntegers() {

		Number.checkPrime(0);
		Number.checkPrime(-4);

	}

	@Test
	public void testArmstrongNumber() {
		assertTrue(Number.checkArmstrong(153));
		assertFalse(Number.checkArmstrong(1324));
	}

	@Test
	public void testPalindromeNumber() {
		assertTrue(Number.checkPalindrome(131));
		assertFalse(Number.checkPalindrome(2576));
	}

}
