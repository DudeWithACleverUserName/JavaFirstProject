package com.sapient.week2;

public class ProgramRunner {

	public static void main(String[] args) {

		// Part-1

		System.out.println("Part-1");

		// Using different type of constructors.
		IntArrProcess intArr1 = new IntArrProcess();
		IntArrProcess intArr2 = new IntArrProcess(6);
		IntArrProcess intArr3 = new IntArrProcess(new int[] { 4, 5, 7, 9, 2, 1, 3 });
		IntArrProcess intArr4 = new IntArrProcess(intArr3);

		// Class functions
		intArr1.readArray();
		intArr2.readArray();
		intArr3.sortArray();
		intArr4.findBiggestAndSmallestElement();
		intArr2.sumOfElements();
		intArr1.secondBiggestDuplication();

		// Part-2

		System.out.println("Part-2");

		// Using different type of constructors.
		Matrix matrix1 = new Matrix();
		Matrix matrix2 = new Matrix(3, 4);
		Matrix matrix3 = new Matrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		Matrix matrix4 = new Matrix(matrix3);

		// Class functions
		matrix1.readMatrix();
		matrix2.readMatrix();
		matrix3.displayMatrix();
		System.out.println(matrix4.isMatrixScalar());
		matrix1.addMatrix(matrix2.getMatrixArray());
		matrix3.multiplyMatrix(matrix4.getMatrixArray());

	}

}
