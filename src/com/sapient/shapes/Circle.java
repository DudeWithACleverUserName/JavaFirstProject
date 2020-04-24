package com.sapient.shapes;

import java.math.BigDecimal;

public class Circle {

	public void calculateArea(int sideLength) {
		
		BigDecimal sides = new BigDecimal(sideLength);
		
		System.out.println("The Area of the circle is: " + new BigDecimal("0.314").multiply(sides.multiply(sides)));

		
	}

}
