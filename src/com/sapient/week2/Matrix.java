package com.sapient.week2;

import java.util.Scanner;

public class Matrix {

	private int matrixArray[][];

	public int[][] getMatrixArray() {
		return matrixArray;
	}

	public Matrix(int rowSize, int columnSize) {

		matrixArray = new int[rowSize][columnSize];

	}

	public Matrix() {

		matrixArray = new int[3][3];

	}

	public Matrix(int givenMatrixArray[][]) {

		this.matrixArray = new int[givenMatrixArray.length][givenMatrixArray[0].length];

		for (int i = 0; i < givenMatrixArray.length; i++) {
			System.arraycopy(givenMatrixArray[i], 0, matrixArray[i], 0, givenMatrixArray.length);
		}

	}

	public Matrix(Matrix that) {

		this.matrixArray = new int[that.matrixArray.length][that.matrixArray[0].length];

		for (int i = 0; i < that.matrixArray.length; i++) {
			System.arraycopy(that.matrixArray[i], 0, matrixArray[i], 0, that.matrixArray.length);
		}

	}

	public void readMatrix() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter elements of the matrix (%dX%d)", this.matrixArray.length, this.matrixArray[0].length)
				.println();

		for (int i = 0; i < matrixArray.length; i++) {
			for (int j = 0; j < matrixArray[i].length; j++) {
				matrixArray[i][j] = scanner.nextInt();
			}
		}

	}

	public void displayMatrix() {

		System.out.println("Elements of the matrix are: ");

		for (int i = 0; i < matrixArray.length; i++) {
			for (int j = 0; j < matrixArray[i].length; j++) {
				System.out.print(matrixArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void addMatrix(int givenMatrix[][]) {

		if (givenMatrix.length == matrixArray.length && givenMatrix[0].length == matrixArray[0].length) {
			for (int i = 0; i < givenMatrix.length; i++) {
				for (int j = 0; j < givenMatrix[i].length; j++) {
					this.matrixArray[i][j] += givenMatrix[i][j];
				}
			}
		} else {
			System.out.println("ERROR!! Matrix dimensions do not match.");
		}

	}

	public boolean isMatrixScalar() {

		if (matrixArray.length == matrixArray[0].length) {

			int element = matrixArray[0][0];

			for (int i = 1; i < matrixArray.length; i++) {
				for (int j = 1; j < matrixArray[0].length; j++) {
					if (element != matrixArray[i][j]) {
						return false;
					}
				}
			}
		} else {
			return false;
		}

		return true;

	}

	public void multiplyMatrix(int givenMatrix[][]) {

		int resultMatrix[][] = new int[matrixArray.length][givenMatrix[0].length];

		if (givenMatrix.length == matrixArray[0].length) {

			for (int i = 0; i < resultMatrix.length; i++) {
				for (int j = 0; j < matrixArray[0].length; j++) {
					for (int k = 0; k < resultMatrix[0].length; k++) {
						resultMatrix[i][k] += matrixArray[i][j] * givenMatrix[j][k];
					}
				}
			}

		} else {
			System.out.println("ERROR!! Dimensions not suitable for multiplication.");
		}

		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
