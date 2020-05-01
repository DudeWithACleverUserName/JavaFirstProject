package com.sapient.week4;

import java.util.Arrays;
import java.util.Scanner;

public class IntArrProcess {

	private int[] integerArray;

	public IntArrProcess(int size) {

		this.integerArray = new int[size];

	}

	public IntArrProcess() {

		this.integerArray = new int[10];

	}

	public IntArrProcess(int[] givenArray) {

		this.integerArray = new int[givenArray.length];
		System.arraycopy(givenArray, 0, integerArray, 0, givenArray.length);

	}

	public IntArrProcess(IntArrProcess that) {

		this.integerArray = new int[that.integerArray.length];
		System.arraycopy(that.integerArray, 0, this.integerArray, 0, that.integerArray.length);

	}

	public void readArray() {

		System.out.printf("Enter elements of the array(size = %d): ", integerArray.length).println();
		;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < integerArray.length; i++) {

			integerArray[i] = scanner.nextInt();

		}
		System.out.println("Completed reading");

	}

	public void displayArray() {

		System.out.println("Displaying Array Horizontally: ");

		for (int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i]);
		}

		System.out.println("Displaying Array Vertically: ");

		for (int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}

	}

	public void sortArray() {

		Arrays.sort(integerArray);
		System.out.println("Array is now sorted!");

	}

	public void findBiggestAndSmallestElement() {

		int biggest = integerArray[0];
		int smallest = integerArray[0];

		for (int i = 1; i < integerArray.length; i++) {
			if (biggest < integerArray[i]) {
				biggest = integerArray[i];
			}

			if (smallest > integerArray[i]) {
				smallest = integerArray[i];
			}
		}

		System.out.printf("Biggest element is %d and smallest element is %d in the array.", biggest, smallest)
				.println();

	}

	public void sumOfElements() {

		int sum = 0;
		for (int i = 0; i < integerArray.length; i++) {
			sum += integerArray[i];
		}
		System.out.println("Sum of the array is: " + sum);

	}

	public void secondBiggestDuplication() {

		sortArray();
		int prev = integerArray[integerArray.length - 1];

		int secondBiggestDuplication = 0;
		int present = 0;

		int firstBiggestDuplication = Integer.MIN_VALUE;

		for (int i = integerArray.length - 2; i >= 0; i--) {

			if (integerArray[i] == prev) {
				if (firstBiggestDuplication == Integer.MIN_VALUE) {
					present++;
					firstBiggestDuplication = prev;
				} else {
					present++;
					secondBiggestDuplication = integerArray[i];
					break;
				}

			} else {
				prev = integerArray[i];
			}

		}

		if (present == 2) {
			System.out.println("Second Biggest Duplication in the array is: " + secondBiggestDuplication);
		} else {
			System.out.println("No Second Biggest Duplication in the array.");
		}

	}

}
