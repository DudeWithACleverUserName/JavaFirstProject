package com.sapient.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeyRead_Line2 {

	private ArrayList<Integer> dataList = new ArrayList<Integer>();

	public void read() {

		if (dataList.size() != 0) {
			System.out.println("WARNING! Elements will be added to the previous list.");
		}

		System.out.print("\nEnter no. of elements: ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		System.out.print("Enter the elements:");

		for (int i = 0; i < n; i++) {
			dataList.add(scanner.nextInt());
		}

	}

	public void find() {
		System.out.print("\nEnter the element to search: ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int element = scanner.nextInt();

		if (dataList.size() == 0) {

			System.out.printf("Element '%d' not found in the list.", element);
			System.out.println();
			System.out.println("ArrayList EMPTY!! Enter elements first.");
			read();

		}

		else {
			if (dataList.contains(element)) {
				System.out.printf("Element '%d' found in the list.", element);
				System.out.println();

			} else {
				System.out.printf("Element '%d' not found in the list.", element);
				System.out.println();

			}

		}

	}

	public void display() {

		if (dataList.size() == 0) {

			System.out.println("ArrayList EMPTY!! Enter elements first.");
			read();

		} else {
			System.out.print("Elements are: ");
			System.out.print(dataList);
		}

	}

	public void sort() {

		if (dataList.size() == 0) {

			System.out.println("ArrayList EMPTY!! Enter elements first.");
			read();

		} else {
			System.out.println("\nArray sorted!!");
			Collections.sort(dataList);
		}

	}

}
