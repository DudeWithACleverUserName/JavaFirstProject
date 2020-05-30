package com.sapient.week8;

public class CalculatorUtil {

	public static void main(String[] args) {

		Calculator add = new Addition();
		Calculator sub = new Subtraction();
		Calculator mult = new Multiplication();
		Calculator div = new Division();

		System.out.print("Addition: ");
		System.out.println(add.calculate(5, 7));

		System.out.print("Subtraction: ");
		System.out.println(sub.calculate(5, 7));

		System.out.print("Multiplication: ");
		System.out.println(mult.calculate(5, 7));

		System.out.print("Division: ");
		System.out.println(div.calculate(15, 7));
	}

}
