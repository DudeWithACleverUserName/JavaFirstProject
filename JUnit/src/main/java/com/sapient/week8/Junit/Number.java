package com.sapient.week8.Junit;

public class Number {

	public static boolean checkPrime(int num) {

		if (num < 1) {
			throw new IllegalArgumentException("Only Positive Numbers allowed!!");

		}

		if (num == 1)
			return false;

		if (num < 4)
			return true;

		if (num % 2 == 0 || num % 3 == 0)
			return false;

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;

	}

	public static boolean checkArmstrong(int num) {

		int temp = num;
		int sum = 0;
		while (num != 0) {
			int k = num % 10;
			sum += k * k * k;
			num /= 10;
		}

		if (sum == temp)
			return true;

		return false;

	}

	public static boolean checkPalindrome(int num) {

		int temp = num;
		int sum = 0;
		while (num != 0) {
			sum *= 10;
			int k = num % 10;
			sum += k;
			num /= 10;
		}

		if (sum == temp)
			return true;

		return false;
	}

}
