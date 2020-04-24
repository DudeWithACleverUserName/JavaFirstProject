package com.sapient.shapes;

import java.math.BigDecimal;

public class Triangle {

	public void calculateArea(int sideLength) {
		
		BigDecimal sides = new BigDecimal(sideLength);

		System.out.println("The Area of the triangle is: " + new BigDecimal("0.433").multiply(sides).multiply(sides));
		
	}

}
