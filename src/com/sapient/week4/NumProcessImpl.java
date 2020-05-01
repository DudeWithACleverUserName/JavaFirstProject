package com.sapient.week4;

import java.util.Scanner;

public class NumProcessImpl {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		NumProcess add = (x, y) -> x + y;
		NumProcess subtract = (x, y) -> x - y;
		NumProcess multiply = (x, y) -> x * y;
		NumProcess divide = (x, y) -> {
			if (y != 0) {
				return x / y;

			} else {
				System.out.println("Cannot divide by zero!!");
				return -1;
			}
		};

		NumProcess[] operations = { add, subtract, multiply, divide };

		System.out.print("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("Available operations are: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.print("Enter your choice(1-4): ");
		int choice = scanner.nextInt();

		if (choice < 1 || choice > 4) {
			System.out.println("Invalid choice!!");
		} else {
			System.out.print("Result: ");
			System.out.println(operations[choice - 1].cal(num1, num2));
		}

		scanner.close();

	}

}
