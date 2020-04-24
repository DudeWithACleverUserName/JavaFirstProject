package com.sapient.misc;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		/*
		 * Part-1
		 */

		System.out.println("Part-1\n");
		Command_Line1 part1 = new Command_Line1();
		part1.setData(args);
		part1.calData();
		part1.displayData();

		/*
		 * Part-2
		 */

		System.out.println("\nPart-2");
		KeyRead_Line2 part2 = new KeyRead_Line2();
		part2.read();
		part2.display();
		part2.sort();
		part2.display();
		part2.find();

		/*
		 * Part-3
		 */

		System.out.println("\nPart-3");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		long number;
		System.out.print("Enter number to be converted to words: ");
		number = scanner.nextLong();

		System.out.println(Convert.figToWords(number));

	}

}
