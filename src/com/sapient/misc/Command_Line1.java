package com.sapient.misc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;

public class Command_Line1 {

	private int sum, biggest, smallest;
	private ArrayList<Integer> dataList = new ArrayList<Integer>();
	private BigDecimal average;

	public void setData(String[] args) {

		for (String arg : args) {
			dataList.add(Integer.parseInt(arg));
		}

	}

	public void calData() {

		sum = 0;
		for (Integer data : this.dataList) {
			sum += data;
		}
		if (dataList.size() != 0) {
			average = new BigDecimal(sum).divide(new BigDecimal(dataList.size()), MathContext.DECIMAL128);
		}

		biggest = Collections.max(dataList);
		smallest = Collections.min(dataList);

	}

	public void displayData() {

		System.out.println(String.format("Sum: %d\nAverage: %s\nBiggest No.: %d\nSmallest No.: %d\n", sum, average,
				biggest, smallest));

	}

}
